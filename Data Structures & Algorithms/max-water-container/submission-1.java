class Solution {
    public int maxArea(int[] heights) {
        if (heights == null || heights.length < 2) return 0;

        int product = 0;
        int low = 0;
        int high = heights.length - 1;

        while (low < high) {
            product = Math.max(product, Math.min(heights[low], heights[high]) * (high - low));

            if (heights[low] < heights[high]) {
                low++;
                
            } else {
                high--;
            }
        }

        return product;
    }
}
