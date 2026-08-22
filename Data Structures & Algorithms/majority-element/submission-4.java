class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majorityElement = 0;

        for (int n : nums) {
            if (count == 0) {
                majorityElement = n;
            }

            if (n != majorityElement) {
                count--;
            } else {
                count++;
            }
        }

        return majorityElement;
    }
}