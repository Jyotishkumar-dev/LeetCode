#include <vector>
#include <string>

class Solution {
public:
    std::vector<std::string> largestString(std::vector<int>& nums) {
        std::vector<std::string> ans;
        ans.reserve(nums.size());
        
        for (long long x : nums) {
            std::string current_str = "";
            
            // 1. Handle 'z' (index 25). Weight = 2^25
            long long z_weight = 1LL << 25;
            long long z_count = x / z_weight;
            current_str.append(z_count, 'z');
            x %= z_weight; // Remainder to distribute among 'y' down to 'a'
            
            // 2. Greedily check characters 'y' (24) down to 'a' (0)
            for (int j = 24; j >= 0; --j) {
                long long char_weight = 1LL << j;
                if (x >= char_weight) {
                    current_str.push_back('a' + j);
                    x -= char_weight;
                }
            }
            
            ans.push_back(current_str);
        }
        
        return ans;
    }
};
