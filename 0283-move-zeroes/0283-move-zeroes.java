class Solution {
    public void moveZeroes(int[] nums) {
        int arr[] = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (0 != nums[i]) {
                arr[idx] = nums[i];
                idx++;
            }
        }

        for (int i = idx; i < nums.length; i++) {
            arr[idx] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
    }
}