class Solution {
    public int removeElement(int[] nums, int val) {

        int change_len = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[change_len] = nums[i];
                change_len++;
            }
        }
        return change_len;

    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int result = removeElement(nums, val);
        System.out.println(result);
    }
}
