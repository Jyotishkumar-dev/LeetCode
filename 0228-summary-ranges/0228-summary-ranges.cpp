#include <vector>
#include <string>

using namespace std;

class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
        vector<string> result;
        int n = nums.size();
        
        for (int i = 0; i < n; ++i) {
            int start = nums[i];
            
            // Advance pointer while the next number is consecutive
            // Note: Using subtraction or long long avoids integer overflow
            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                ++i;
            }
            
            // Format the range based on whether it contains one or multiple numbers
            if (start != nums[i]) {
                result.push_back(to_string(start) + "->" + to_string(nums[i]));
            } else {
                result.push_back(to_string(start));
            }
        }
        
        return result;
    }
};
