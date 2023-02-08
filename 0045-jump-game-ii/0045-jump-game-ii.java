class Solution {
    public int jump(int[] nums) {
        int ans=0;  // no. of jumps
        int idx = 0;  // current idx
        int l_idx=0;  // maximum idx it can reach in a jump 
        
        for(int i=0; i< nums.length-1 ;i++ ){
            l_idx = Math.max(l_idx, i+nums[i] );
            
            if(idx ==i ){
                ans++;
                idx=l_idx;
            }
        }
        return ans;
    }
}