class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestSequence = 0;

        for (int num : nums) {
            int length = 1;

            if (!set.contains(num - 1)) {
                while (set.contains(num + length)) {
                    length++;
                }
            }

            longestSequence = Math.max(length, longestSequence);
        }

        return longestSequence;
    }
}
