class Solution {
    public int[] runningSum(int[] nums) {
        //empty array on spot ask can i handle corner case like empty case)   
         for(int idx =1; idx<nums.length; idx++){
             nums[idx]+=nums[idx-1];
         }
        return nums;
        
        // we must have to follow the design principal so (this is wrong step)
    }
}