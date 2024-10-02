class Solution {
    public void sortColors(int[] nums) {
        ArrayList<Integer> sortedNumList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sortedNumList.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                sortedNumList.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sortedNumList.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sortedNumList.get(i);
        }
    }
}