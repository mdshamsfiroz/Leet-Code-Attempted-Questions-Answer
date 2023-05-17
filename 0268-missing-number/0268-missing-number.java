class Solution {
    public int missingNumber(int[] nums) {
    int n=nums.length;
    //visited mark
    for(int idx=0; idx<n;idx++){
        int original = nums[idx] % (n+1);
        if(original < n){
            nums[original]+=(n+1);
        }
    }
    //find missing number
        for(int idx=0;idx<n;idx++){
            int freq=nums[idx]/(n+1);
            if(freq ==0 ) return idx;   
    }
    
        return n;
    }
}