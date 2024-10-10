class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList dupList = new ArrayList();

        for (int num : nums) {
            num = Math.abs(num);
            if(nums[num - 1] > 0) {
                nums[num - 1] *= -1; 
            }
            else {
                dupList.add(num);
            }
        }
        return dupList;

    }
}