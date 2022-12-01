// not done by myself learn from discuss
class Solution {
    public boolean halvesAreAlike(String s) {
       int count=0;
        String vowel="aeiouAEIOU";
        for(int i=0,j=s.length()-1;i<=j;i++,j--){
            if(vowel.indexOf(s.charAt(i))!=-1){
                count++;
            }
            if(vowel.indexOf(s.charAt(j))!=-1){
                count--;
            }
        }
        return count == 0;
        }
    }
   
