class Solution {
    public String reverseVowels(String s) {
        char sCh[] = s.toCharArray();
        int start = 0, end = s.length()-1;
        String vow = "aeiouAEIOU";

        while (start < end) {
            if (vow.indexOf(sCh[start]) == -1) {
                start++;
            } else if (vow.indexOf(sCh[end]) == -1) {
                end--;
            } else {
                char temp = sCh[start];
                sCh[start] = sCh[end];
                sCh[end] = temp;
                start++;
                end--;
            }
        }
        String ans = new String(sCh);
        return ans;
    }
}