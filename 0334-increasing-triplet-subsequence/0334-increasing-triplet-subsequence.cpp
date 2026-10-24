#include <vector>
#include <climits>

class Solution {
public:
    bool increasingTriplet(std::vector<int>& nums) {
        // Step 1: Initialize the first two elements of our triplet to the largest possible value
        int first = INT_MAX;
        int second = INT_MAX;
        
        // Step 2: Iterate through the array
        for (const int num : nums) {
            if (num <= first) {
                // Keep 'first' as small as possible
                first = num; 
            } 
            else if (num <= second) {
                // 'num' is greater than 'first' but smaller than or equal to 'second'
                second = num; 
            } 
            else {
                // 'num' is greater than both 'first' and 'second'. Triplet found!
                return true; 
            }
        }
        
        // No triplet found after scanning the entire array
        return false;
    }
};
