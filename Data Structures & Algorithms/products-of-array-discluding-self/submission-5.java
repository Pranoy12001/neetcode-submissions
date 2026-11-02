class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProd = new int[nums.length];
        int[] rightProd = new int[nums.length];

        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            left *= nums[i];
            leftProd[i] = left; 
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            right *= nums[i];
            rightProd[i] = right;
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                res[i] = rightProd[i + 1];
            } else if (i == nums.length - 1) {
               res[i] = leftProd[i - 1]; 
            } else {
                res[i] = leftProd[i - 1] * rightProd[i + 1];
            }
        }

        return res;
    }
}  
