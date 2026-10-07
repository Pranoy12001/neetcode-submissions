class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        
        for (String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedKey = new String(charArr);

            res.putIfAbsent(sortedKey, new ArrayList<>());
            res.get(sortedKey).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
