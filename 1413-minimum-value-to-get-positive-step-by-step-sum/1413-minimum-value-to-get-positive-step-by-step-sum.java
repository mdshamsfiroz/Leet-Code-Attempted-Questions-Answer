class Solution {
    public int minStartValue(int[] nums) {
     int sum=1 , starting=1;
        
        for(int val : nums){
            sum+=val;
            if(sum<=0){
                starting+=(1-sum);
                sum=1;
            }
        }
            return starting;
        }
    }
