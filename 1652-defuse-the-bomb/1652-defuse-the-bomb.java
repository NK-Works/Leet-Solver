class Solution {
    public int[] decrypt(int[] code, int k) {
       int decryptCode[] = new int[code.length];
       
       for (int i = 0; i < decryptCode.length; i++) {
        if (k > 0) {
            for (int j = i + 1; j < i + k + 1; j++) {
                decryptCode[i] += code[j % code.length];
            }
        } else if (k < 0) {
            for (int j = i - Math.abs(k); j < i; j++) {
                decryptCode[i] += code[(j + code.length) % code.length];
            }
        }
       }

       return decryptCode; 
    }
}