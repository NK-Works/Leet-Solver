class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, maxArea = Integer.MIN_VALUE;
        while (i < j) {
            int minHeight = Math.min(height[i], height[j]);
            maxArea = Math.max(maxArea, (j - i) * minHeight);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}