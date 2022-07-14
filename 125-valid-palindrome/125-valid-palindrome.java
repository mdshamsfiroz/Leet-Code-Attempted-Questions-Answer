// class Solution {
//     public boolean isPalindrome(String s) {
//         boolean flag=true;
//         int left=0;
//         int right=s.length()-1;
//         while(left<right){
//             char chleft =s.charAt(left);
//             char chright =s.charAt(right);
//             if(chleft!=chright){
//                 flag=false;
//                 break;
//             }
//             left++;
//             right--;
//         }
//         return flag;
        
//     }
// }

 class Solution {
    public boolean isPalindrome(String s) {
      int i = 0;
      int j = s.length() - 1;
      char[] chars = s.toCharArray();
      while (i < j) {
        while (i < j && !Character.isLetterOrDigit(chars[i])) {
          i++;
        }
        while (i < j && !Character.isLetterOrDigit(chars[j])) {
          j--;
        }
        if (Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[j])) {
          return false;
        }
        i++;
        j--;
      }
      return true;
    }
  }
