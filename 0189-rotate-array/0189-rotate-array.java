class Solution {
    public void rotate(int[] nums, int k) {
      int len=nums.length;
      k=k%len;
      int ans[]=new int[len];
      int j=0;
      for(int i=len-k;i<len;i++)
      {
           ans[j++]=nums[i%len];
      }
      for(int i=0;i<len-k;i++)ans[j++]=nums[i%len];
      j=0;
      for(int i:ans)nums[j++]=i;
    }
}