package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static List<Employee> employee = new ArrayList<>();
    static
    {
        employee.add (new Employee("Bharath","kumar",4000.0,List.of("project1","project2")));

        employee.add (new Employee("sarath","kumar",7000.0,List.of("project1","project3")));

        employee.add (new Employee("Balaji","venkatesh",5500.0,List.of("project2","project4")));

    }
    public static void main(String[] args) {

        employee.stream()
                .forEach(employee -> System.out.println(employee));


        // intermediate operations
        //map
        List<Employee> increasedSalay  = employee.stream()
                .map(employee -> (new Employee (employee.getFirstName(), employee.getLastName(), employee.getSalary() * 1.10,employee.getProject())))
                .collect(Collectors.toList());

        System.out.println(increasedSalay);


        //filter
        List<Employee> filtered_employee =  employee
                .stream()
                .filter(employee -> employee.getSalary()>5000.0)
                .map(employee -> (new Employee (employee.getFirstName(), employee.getLastName(), employee.getSalary() * 1.10,employee.getProject())))
                .collect(Collectors.toList());

        System.out.println(filtered_employee);
       //shortcircuiting operation
        List<Employee> shorting =
                employee.stream()
                        .skip(2)
                        .limit(2)
                        .collect(Collectors.toList());

        System.out.println(shorting);

        // finite the infinite value

        Stream.generate(Math::random)
                .limit(5)
                .forEach(value -> System.out.println(value));


    }
}