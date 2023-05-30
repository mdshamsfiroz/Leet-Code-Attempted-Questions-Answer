class Solution {
    public boolean isAlphaNumeric(char ch){
        if(ch >= 'a' && ch <= 'z' ) return true; //lowercase
        if(ch >= 'A' && ch <= 'Z' ) return true; //uppercase
        if(ch >='0' && ch <= '9' ) return true; //digits
        return false;
    }
    public boolean isPalindrome(String str) {
        str =str.toLowerCase()
;
    int left =0 , right =str.length()-1;
        
        while(left <= right){
            
            // discard non-alpha numeric
            if(isAlphaNumeric(str.charAt(left))==false){
                left++ ; continue;
            }
        
            if(isAlphaNumeric(str.charAt(right))==false){
                right--; continue;
            }
            
            if(str.charAt(left) != str.charAt(right)){
                 return false;
            }
            left++; right--;
        }
        return true;
    }
    
}

// Time O(n)
//(Linear)
// Space O(1)
//no extra space