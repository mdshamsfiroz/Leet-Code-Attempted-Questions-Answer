class Solution {
    public String reverseWords(String str) {
        String[] words =str.split("\s+");
        
        StringBuilder res = new StringBuilder();
        for(int idx=words.length-1;idx>=0;idx--){
            res.append(" "+ words[idx]);
        }
        
        return res.toString().trim();
    }
}