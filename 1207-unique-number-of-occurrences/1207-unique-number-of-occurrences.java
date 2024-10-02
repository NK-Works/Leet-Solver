class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> myMap = new HashMap<>();

        for (int val : arr) {
            myMap.put(val, myMap.getOrDefault(val, 0) + 1);
        }

        HashSet<Integer> mySet = new HashSet<>();
        for (int freq : myMap.values()) {
            if (mySet.contains(freq)) {
                return false;
            }
            else {
                mySet.add(freq);
            }
        }
        return true;
    }
}