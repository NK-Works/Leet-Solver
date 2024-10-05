class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int out = 0;

        if (num < 0) {
            return false;
        }

        while (num != 0) {
            int dig =  num % 10;
            out = out*10 + dig;
            num = num / 10;
        }

        if (out == x) {
            return true;
        }
        return false;
    }
}