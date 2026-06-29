class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }
        int max = 0;
        for (Integer n : set) {
            int count = 1;
            while (set.contains(n + count)) {
                count++;
            }
            max = Math.max(count, max);
            count = 1;
        }

        return max;
    }
}
