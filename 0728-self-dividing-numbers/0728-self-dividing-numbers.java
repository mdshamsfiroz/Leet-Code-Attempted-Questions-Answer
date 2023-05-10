class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        //new list visit then if any number found then i will add in the list.
        List<Integer> list =new ArrayList<Integer>();
        for(int i=left;i<=right;i++){
        if(isDividing(i)){
            list.add(i);
           }
        }
         return list;
        }
    public static boolean isDividing(int n){
        if(n<=0)
            return false;
        int rem=0;
        int temp=n;
        while(n!=0){
            rem=n%10;
            if(rem==0 || temp%rem !=0){
                return false;
            }
            n/=10;
        }
        return true;
    }
}