class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        
        //visited mark
        
        for(int idx=0;idx<nums.length;idx++){
              int original =nums[idx] %(n+1);
             nums[original - 1] += (n+1);
        }
        
        //find all missing numbers
        List<Integer> duplicate =new ArrayList<>();
        
        for(int idx =0; idx<nums.length; idx++){
            int freq =nums[idx] /(n+1);
            if(freq >1) duplicate.add(idx+1);
        }
        return duplicate;
        }
}