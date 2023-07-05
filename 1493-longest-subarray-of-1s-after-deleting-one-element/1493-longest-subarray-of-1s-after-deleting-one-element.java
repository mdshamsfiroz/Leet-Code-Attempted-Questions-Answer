class Solution {
    public int longestSubarray(int[] nums) {
        int prevCnt=0, cnt=0 , res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
                cnt++;
            else{
                res = Math.max(res, cnt +prevCnt);
                prevCnt=cnt;
                cnt=0;
                }
         }
         res=Math.max(res, cnt + prevCnt);
        
         return res == nums.length ? res -1 : res;
            
        }
    }
