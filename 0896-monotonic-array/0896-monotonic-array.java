class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean asen = true , dsen=true;
        for (int i=0;i<nums.length - 1;i++){
            if(nums[i]>nums[i+1])
            asen=false;
            if(nums[i]<nums[i+1])
            dsen=false;
        }
        return asen || dsen;

        
        
    }
}