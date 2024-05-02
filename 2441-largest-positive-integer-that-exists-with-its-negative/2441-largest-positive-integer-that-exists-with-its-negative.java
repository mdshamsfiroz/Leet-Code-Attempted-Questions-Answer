class Solution {
    public int findMaxK(int[] nums) {
        int ans=-1;
        
        for(int i: nums){
            for(int j : nums){
                if(i==-j){
                    ans = Math.max(ans, Math.abs(i));

                }
            }
        }
        
       return ans; 
    }
}