class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int element : nums1) {
            set1.add(element);
        }

        HashSet<Integer> set2 = new HashSet<>();

        for (int element : nums2) {
            if (set1.contains(element))
            set2.add(element);
        }

        int[] intersection = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            intersection[index++] = num;
        }
        return intersection;
    }
}