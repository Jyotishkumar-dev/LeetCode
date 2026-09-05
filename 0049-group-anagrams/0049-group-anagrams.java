class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //CREATE A MAP
        Map<String, List<String>> map = new HashMap<>();

        // traverse on strs using for each
        for(String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            //create a key
            String key = new String(chars);

            //create hasMap
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);

        }

        return new ArrayList<> (map.values());
        
    }
}