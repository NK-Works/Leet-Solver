class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubleString = s + s;
        return doubleString.substring(1, doubleString.length() - 1).contains(s);
    }
}