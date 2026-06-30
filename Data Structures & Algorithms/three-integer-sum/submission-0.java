class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return new ArrayList<>();

        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int high = nums.length - 1;

            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];

                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                } else if (sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }

        return new ArrayList<>(set);
    }
}
