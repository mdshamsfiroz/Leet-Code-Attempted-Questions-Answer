class Solution {
   public static  boolean isPerfectSquare(int num){
    long s=1,e=num;
        while(s<=e)
        {
            long mid=s+(e-s)/2;
            if(mid*mid==num)
                return true;
            else if(mid*mid>num)
             e=mid-1;
            else
                s=mid+1;
        }
        return false;
    }
}