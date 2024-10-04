class Solution {
    public int reverse(int x) {
            int num = 0,  digit = 0;
            while (x != 0) {
                digit = x % 10;
                if (num < (Math.pow(-2,31)) / 10 || num > (Math.pow(2,31)) / 10 )
                    return 0;
                num = (num * 10) + digit;
                x = x / 10; 
            }
            return num;
    }
}