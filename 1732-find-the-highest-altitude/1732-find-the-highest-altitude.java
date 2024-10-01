class Solution {
    public int largestAltitude(int[] gain) {
        // int[] alt = new int[gain.length + 1];
        // alt[0] = 0;
        // for (int i = 0; i < gain.length-1; i++) {
        //     // for (int j = i; j < i+1; j++) {
        //         int j = i + 1;
        //         int temp = gain[i] + alt[0];
        //         alt[j] = temp;    
        //     }
        //     int max = alt[0];
        //  for (int i = 0; i < gain.length-1; i++) {
        //     if (max < alt[i]) {
        //         int temp = max;
        //         max = alt[i];
        //         alt[i] = temp;
        //     }

        //  }
        // return max;
        int currentAltitude = 0;
        int highestAltitude = 0;

        for(int altitude : gain){
            currentAltitude += altitude;
            highestAltitude=Math.max(highestAltitude, currentAltitude);
        }

        return highestAltitude;

    }
}