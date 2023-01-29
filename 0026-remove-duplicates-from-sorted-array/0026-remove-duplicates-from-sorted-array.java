class Solution {
    public int removeDuplicates(int[] nums) {
                
        int ans = 0;
        int i = 0;
        int idx = i+1;

        while(i < nums.length)
        {
            int j = i+1;
            while(j < nums.length && nums[i] == nums[j]) j++;

            if(j < nums.length && idx < nums.length && idx != j)
            {
                nums[idx] = nums[j];
            }

            i = j;
            idx++;
            ans++;
        }

        return ans;
    }
}