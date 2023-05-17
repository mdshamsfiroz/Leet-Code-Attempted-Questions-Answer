class Solution {
    public int[] runningSum(int[] nums) {
     int [] prefix = new int [nums.length];
    
    for(int idx=0; idx<nums.length; idx++){
        prefix[idx]= nums[idx] + ((idx>0) ? prefix[idx-1]:0);
    }
      return prefix;  
    }
}
/*
public int[] runningSum(int[] nums){
        int n=nums.length;
        int [] suffix=new int [n];
        suffix[n-1]=num[n-1];
        for(int idx=n-2;idx>=0;idx--){
            suffix[idx]=nums[idx]+suffix[idx+1];
        }
        return suffix;
    }
    
    */