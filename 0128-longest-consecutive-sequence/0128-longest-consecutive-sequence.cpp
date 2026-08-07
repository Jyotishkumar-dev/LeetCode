class Solution {
public:
    int longestConsecutive(vector<int>& nums)
    {
        unordered_set<int> st(nums.begin(),nums.end());
        int ans=0;
        for(auto v: st)
        {
            int count=1;
            int curr = v;
            if(st.count(curr-1))
            {
                continue;
            }
            else
            {
                curr+= 1;
                while(st.count(curr))
                {
                    count++;
                    curr++;
                }
            }
            ans= max(count, ans);
        }
        return ans;
    }
};