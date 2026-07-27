class Solution {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        // Compare every character of the first string
        for (int i = 0; i < strs[0].length(); i++) {

            char ch = strs[0].charAt(i);

            // Compare with all other strings
            for (int j = 1; j < strs.length; j++) {

                // If current string is shorter
                // OR character doesn't match
                if (i == strs[j].length() || strs[j].charAt(i) != ch) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }
}