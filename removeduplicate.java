public class removeduplicate {

    public static int uniqueElement(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        nums[j++] = nums[nums.length - 1];

        return j;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        int result = uniqueElement(nums);
        System.out.println(result);
    }

}
