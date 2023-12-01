class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String gen1=""; String gen2="";
        for(int i=0;i<word1.length;i++){
            gen1+=word1[i];
        }
    
        for(int j=0;j<word2.length;j++){
            gen2+=word2[j];
        }
        
        
        return (gen1.equals(gen2));
        
    }
}