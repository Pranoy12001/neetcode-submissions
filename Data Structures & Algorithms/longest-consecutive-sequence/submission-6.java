class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int longestSequence = 0;
        int curr = nums[0];
        int i = 0;
        int count = 0;

        while (i < nums.length) {
            if (curr != nums[i]) {
                curr = nums[i];
                count = 0;
            }

            while (i < nums.length && curr == nums[i]) {
                i++;
            }

            count++;
            curr++;
            longestSequence = Math.max(longestSequence, count);
        }

        return longestSequence;
    }
}
