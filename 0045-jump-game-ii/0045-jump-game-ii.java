class Solution {
    public int jump(int[] nums) {
        int count = 0, maxReach = 0, lastMax = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
            maxReach = Math.max(maxReach, i + nums[i]);

            if (lastMax == i) {
                count++;
                lastMax = maxReach;
                
                if (maxReach >= nums.length - 1) {
                    break;
                }
            }
        }
        return count;
    }
}