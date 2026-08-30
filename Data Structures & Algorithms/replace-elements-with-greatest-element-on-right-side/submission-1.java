class Solution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        result[arr.length - 1] = -1;
        int maxValue = -1;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }

            result[i - 1] = maxValue;
        }

        return result;
    }
}