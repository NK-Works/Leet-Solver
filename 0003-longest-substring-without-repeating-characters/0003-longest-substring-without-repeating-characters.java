class Solution {
    public int lengthOfLongestSubstring(String s) {
        int finalCount = 1;
        if (s.length() == 0) {
            return 0;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            int lenCount = 1;
            for (int j = i+1; j < s.length(); j++) {
                if (s.substring(i, j).contains(Character.toString(s.charAt(j)))) {
                    break;
                }
                lenCount++;
            }
            if (finalCount < lenCount) {
                finalCount = lenCount;
            }
        }
        return finalCount;
    }
}