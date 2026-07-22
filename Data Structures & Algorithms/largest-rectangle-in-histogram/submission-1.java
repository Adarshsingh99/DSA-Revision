class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int minHeight = Integer.MAX_VALUE;

            for (int j = i; j < n; j++) {

                minHeight = Math.min(minHeight, heights[j]);

                int width = j - i + 1;

                int area = minHeight * width;

                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}