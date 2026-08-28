class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result = 0;
        for (int num : nums) {
            if (num != 1) {
                count = 0;
            } else {
                count++;
            }

            result = Math.max(result, count);
        }

        return result;
    }
}