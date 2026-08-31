class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            if (i == 0) {
                list.add(1);
            } else if (i == 1) {
                list.add(1);
                list.add(1);
            } else {
                List<Integer> previousResult = result.get(i - 1);
                list.add(0, 1);
                for (int j = 0; j < previousResult.size() - 1; j++) {
                    list.add(previousResult.get(j) + previousResult.get(j + 1));
                }
                list.add(previousResult.size(), 1);
            }

            result.add(list);
        }

        return result;
    }
}