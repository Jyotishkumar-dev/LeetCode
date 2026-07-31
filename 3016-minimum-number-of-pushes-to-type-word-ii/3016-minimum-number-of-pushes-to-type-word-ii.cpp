class Solution {
public:
    int minimumPushes(string word) {
        int n = word.length();
        vector<int> freq(26,0);

        for( char v:word){
            freq[v -'a']++;
        }
        sort(freq.begin(),freq.end(),greater<int>());

        int ans=0;
      for(int i=0; i<26; i++){
         ans+=(freq[i]*(i/8+1));
      }
      return ans;
    }
};