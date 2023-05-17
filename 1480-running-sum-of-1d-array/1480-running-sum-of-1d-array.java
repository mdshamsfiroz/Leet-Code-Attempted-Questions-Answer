class Solution {
    public int[] runningSum(int[] nums) {
     int [] prefix = new int [nums.length];
    
    for(int idx=0; idx<nums.length; idx++){
        prefix[idx]= nums[idx] + ((idx>0) ? prefix[idx-1]:0);
    }
      return prefix;  
    }
}