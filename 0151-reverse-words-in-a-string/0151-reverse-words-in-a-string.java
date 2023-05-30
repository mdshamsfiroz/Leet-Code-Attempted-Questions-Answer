class Solution {
    //split the string based on spaces
    
    public String reverseWords(String str) {
       int right =str.length()-1;
       StringBuilder res= new StringBuilder();
        
    //iterate on all words
        while(right>=0){
            // right will stop at ending index of a word
            while(right>= 0 && str.charAt(right)== ' '){
                right--;
            }
            
            int left = right;
            // left will stop at starting index of a word -1;
            while(left>=0 && str.charAt(left) != ' '){
                left --;
            }
            
            if(res.length()> 0 && left<right){
                res.append(" ");
            }
            
          
            
            for(int idx=left +1; idx<= right ; idx++){
                res.append(str.charAt(idx));
            }
            right = left;
        }
        return res.toString();
    }
}