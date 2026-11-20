#include <vector>
#include <cmath>

using namespace std;

class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        int duplicate = -1;
        int missing = -1;

        // Step 1: Mark visited indices by negating the value at (abs(num) - 1)
        for (int num : nums) {
            int index = abs(num) - 1;
            if (nums[index] < 0) {
                duplicate = abs(num);
            } else {
                nums[index] = -nums[index];
            }
        }

        // Step 2: The index with a positive value corresponds to the missing number
        for (int i = 0; i < nums.size(); ++i) {
            if (nums[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        return {duplicate, missing};
    }
};
