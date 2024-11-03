class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();

        for(int num : nums) {
            if(!numSet.add(num)) {
                return num;
            }
        }
        return -1;
    }
}