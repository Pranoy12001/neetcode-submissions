class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];

        int left = 1;

        for (int i = 0; i < nums.length; i++) {
            left *= nums[i];

            leftProduct[i] = left;
        }

        int right = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            right *= nums[i];

            rightProduct[i] = right;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[i] = rightProduct[i + 1];
            } else if (i == nums.length - 1) {
                result[i] = leftProduct[i - 1];
            } else {
                result[i] = leftProduct[i - 1] * rightProduct[i + 1];
            }
        }

        return result;
    }
}  
