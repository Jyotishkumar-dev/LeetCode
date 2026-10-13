import java.util.HashMap;

public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // Map to store (remainder, first_seen_index)
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Base case: To handle subarrays that start from index 0
        // A remainder of 0 is conceptually seen at index -1
        map.put(0, -1);
        
        int runningSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            
            // Calculate remainder
            int remainder = runningSum % k;
            
            // If the remainder already exists in the map
            if (map.containsKey(remainder)) {
                // Check if the subarray length is at least 2
                if (i - map.get(remainder) >= 2) {
                    return true;
                }
            } else {
                // Only store the first occurrence to maximize subarray length
                map.put(remainder, i);
            }
        }
        
        return false;
    }
}
