class Solution {
    public int[] runningSum(int[] nums) {
        //empty array on spot ask can i handle corner case like empty case)   
        int prefix[]=new int [nums.length]; 
        prefix[0]=nums[0];
        for(int idx=1;idx<nums.length;idx++){
        prefix[idx]=nums[idx]+prefix[idx-1];
        }
        return prefix;
    }
}