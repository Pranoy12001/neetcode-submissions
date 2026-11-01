class Solution {
    public int rob(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }

        int[] skipLast = new int[nums.length - 1];
        int[] skipFirst = new int[nums.length - 1];

        for (int i = 0; i < nums.length - 1; i++) {
            skipLast[i] = nums[i];
            skipFirst[i] = nums[i + 1]; 
        }

        int lootWithoutLast = robHouse(skipLast);
        int lootWithoutFirst = robHouse(skipFirst);

        return Math.max(lootWithoutLast, lootWithoutFirst);
    }

    private int robHouse(int[] arr) {
        if (arr.length < 2) {
            return arr[0];
        }

        int[] loot = new int[arr.length];

        loot[0] = arr[0];
        loot[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            loot[i] = Math.max(loot[i - 2] + arr[i], loot[i - 1]);
        } 

        return loot[arr.length - 1];
    }
}
