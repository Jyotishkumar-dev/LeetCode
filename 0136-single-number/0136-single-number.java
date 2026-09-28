class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        
        // XOR every number in the array
        for (int num : nums) {
            result ^= num; 
        }
        
        // The duplicates cancelled out; only the single number remains
        return result;
    }
}
