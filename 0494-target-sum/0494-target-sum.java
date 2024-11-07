class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int ans = getTargetSumWays(nums, 0, 0, target);
        return ans;
    }

    public int getTargetSumWays(int[] nums, int idx, int sos, int target) {
        int count = 0;
        if (idx == nums.length) {
            if (sos == target) {
                // System.out.println(set + ".");
                count++;
            }
            return count;
        }

        int ans1 = getTargetSumWays(nums, idx+1, sos + nums[idx], target);
        int ans2 = getTargetSumWays(nums, idx+1, sos - nums[idx], target);

        return ans1 + ans2;

    }
}