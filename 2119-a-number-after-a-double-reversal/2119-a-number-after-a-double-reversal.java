class Solution {
    public boolean isSameAfterReversals(int num) {
        
        int temp1=num;
        int sum=0;
        while(temp1>0){
            int r=temp1%10;
            sum=sum*10+r;
            temp1=temp1/10;
        }
        int temp2=0;
        while(sum>0){
            int r2=sum%10;
            temp2=temp2*10+r2;
            sum/=10;
        }
        if(temp2==num){
            return true;
        }
        return false;       
    }
}