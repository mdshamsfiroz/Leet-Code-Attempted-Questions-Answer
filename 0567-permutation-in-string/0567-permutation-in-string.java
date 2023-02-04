class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n>m) return false;
        int[] arr = new int[26];
        for(int i=0;i<n;i++){
            arr[s1.charAt(i)-'a']++;
         }
         for(int i = 0;i<m;i++){
            arr[s2.charAt(i)-'a']--;
            if(i-n >= 0){
                arr[s2.charAt(i-n)-'a']++;
            }
            if(zero(arr)) {
                return true;
            }
        }
        return false;
    }
    public boolean zero(int[] arr){
       for(int i =0 ;i<26;i++){
           if(arr[i] != 0) {
               return false;
           }
       }
       return true;
    }
}