class Solution {
    public int longestSubsequence(int[] nums) {

        int n = nums.length;
        int xor = 0;
        int zeroCount = 0;

        for (int num : nums) {

            xor ^= num;

            if (num == 0) {
                zeroCount++;
            }
        }

        // Case 1: Entire array has non-zero XOR
        if (xor != 0) {
            return n;
        }

        // Case 2: Every element is zero
        if (zeroCount == n) {
            return 0;
        }

        // Case 3: Total XOR is zero,
        // but at least one element is non-zero
        return n - 1;
    }
}