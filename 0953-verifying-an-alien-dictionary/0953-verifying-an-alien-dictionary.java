class Solution {
    int [] orderMap = new int[26];
    public boolean isAlienSorted(String[] words, String order) {
        
        
        for (int i = 0; i < order.length(); i++){
            orderMap[order.charAt(i) - 'a'] = i;
        }
        
        for(int i =1;i< words.length;i++){
            if(!compare(words[i],words[i-1]))return false;
        }
        return true;
        
    }
    
    public boolean compare(String s1, String s2){
        
            int j = 0;
            while(j<s1.length() && j<s2.length()){
                if(s1.charAt(j) == s2.charAt(j)) j++;
                else if(orderMap[s1.charAt(j)-'a']>orderMap[s2.charAt(j)-'a']) return true;
                else return false;
            }
            if(s1.length()<s2.length())return false;
            return true;
        
    }
    }
