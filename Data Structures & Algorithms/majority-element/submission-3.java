class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int n : nums) {
            if (!countMap.containsKey(n)) {
                countMap.put(n, 1);
                
                if (countMap.get(n) > (nums.length / 2)) {
                    return n;
                }
            } else {
                countMap.put(n, countMap.get(n) + 1);

                if (countMap.get(n) > (nums.length / 2)) {
                    return n;
                }
            }
        }

        return 0;
    }
}