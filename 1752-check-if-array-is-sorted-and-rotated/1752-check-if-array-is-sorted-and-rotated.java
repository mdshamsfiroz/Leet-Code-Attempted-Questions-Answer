class Solution {
    public boolean check(int[] nums) {
        // here we compare all the neighbouring elemnts and check whether they are in somewhat sorted using arr[i]=arr[i+1]
        //using note given in ques make me easy to think.
        // there will be a small change due to rotation in the array at only one place.
        // so if there are count more than once, return false
        // else return true;
        int count=0;
        int length=nums.length;
        for(int i=0;i<length;i++){
            int current=nums[i];
            int next=nums[(i+1)%length];
            if(current>next){
              
                count++;
            }
            
        }
        return (count>1?false:true);
    }
}