class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int idx=0;idx<hours.length; idx++){
            if(hours[idx]>=target){
                count++;
            }
        }
        return count;
    }
}