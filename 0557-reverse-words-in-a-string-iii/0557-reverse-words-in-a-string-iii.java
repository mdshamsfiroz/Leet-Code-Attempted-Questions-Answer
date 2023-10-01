class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word: words){
            result.append(reverseString(word)).append(" ");
        }
        return result.toString().trim();
    }
    public static String reverseString(String s){
    char[] chars=s.toCharArray();
        int left=0;
        int right=chars.length-1;
        
        while(left<right){
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
            
        }
        return new String(chars);
    }
}