class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;

        int zeroIndex = -1;
        int numsOfZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroIndex = i;
                numsOfZero++;
                continue;
            }

            product *= nums[i];
        }

        if (numsOfZero >= 2) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = 0;
            }

            return nums;
        }

        if (numsOfZero == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (i == zeroIndex){
                    nums[i] = product;
                } else {
                    nums[i] = 0;
                }
            }

            return nums;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] != 0 ? product / nums[i] : 0;
        }

        return nums;
    }
}  
