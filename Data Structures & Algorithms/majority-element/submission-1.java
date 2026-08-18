class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majorityElement = 0;

        for (int num : nums) {
            if (count == 0) {
                majorityElement = num;
            }

            if (majorityElement != num) {
                count --;
            } else {
                count++;
            }
        }

        return majorityElement;
    }
}