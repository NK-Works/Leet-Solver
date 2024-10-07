class Solution {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 31; i++) {
            int sol = (int) Math.pow(2, i);
            if (n == sol) 
                return true;
        }
        return false; 
    }
}