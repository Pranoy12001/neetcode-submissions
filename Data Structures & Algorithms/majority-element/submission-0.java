class Solution {
    private Map<Integer, Integer> getCount(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i : nums) {
            if (!countMap.containsKey(i)) {
                countMap.put(i, 1);
            } else {
                countMap.put(i, countMap.get(i) + 1);
            }
        }

        return countMap;
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countEntry = getCount(nums);


        for (Map.Entry<Integer, Integer> entry : countEntry.entrySet()) {
            if (entry.getValue() > (nums.length / 2)) {
                return entry.getKey();
            }
        }

        return 0;
    }
}