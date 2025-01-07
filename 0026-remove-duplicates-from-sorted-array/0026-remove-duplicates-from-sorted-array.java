class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> dupSet = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            dupSet.add(nums[i]);
            nums[dupSet.size() - 1] = nums[i];
        }
        return dupSet.size();
    }
}