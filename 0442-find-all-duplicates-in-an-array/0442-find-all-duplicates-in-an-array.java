class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList dupList = new ArrayList();
        HashSet<Integer> numSet = new HashSet<>();


        // for (int num : nums) {
        //     num = Math.abs(num);
        //     if(nums[num - 1] > 0) {
        //         nums[num - 1] *= -1; 
        //     }
        //     else {
        //         dupList.add(num);
        //     }
        // }
        // return dupList;

        for(int num : nums) {
            if (!numSet.add(num)) {
                dupList.add(num);
            }
        } 
        return dupList;


    }
}