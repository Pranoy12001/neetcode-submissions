class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int postfix = 1;
        int[] prefixArray = new int[nums.length];
        int[] postfixArray = new int[nums.length];
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            prefix *= nums[i];
            prefixArray[i] = prefix;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            postfix *= nums[i];
            postfixArray[i] = postfix;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[i] = postfixArray[i + 1];
            } else if (i == nums.length - 1) {
                result[i] = prefixArray[i - 1];
            } else {
                result[i] = prefixArray[i - 1] * postfixArray[i + 1];
            }
        }

        return result;
    }
}  
