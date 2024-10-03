class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        int n = nums.length;

        for (int i= 0; i < n; i++) {
            int comp = target - nums[i];
            if(sumMap.containsKey(comp)) {
                return new int[] {sumMap.get(comp), i};
            }
            sumMap.put(nums[i], i);
        }
        return new int[] {};
    }
}