class Solution {
    public int rob(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }

        int[] maxLoot = new int[nums.length];
        maxLoot[0] = nums[0];
        maxLoot[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            maxLoot[i] = Math.max(maxLoot[i - 2] + nums[i], maxLoot[i - 1]);
        }

        return maxLoot[nums.length - 1];
    }
}
