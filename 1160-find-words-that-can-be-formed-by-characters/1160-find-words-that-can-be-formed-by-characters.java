class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] counts = new int[26];
        for (Character c : chars.toCharArray()) {
            counts[c - 'a']++;
        }
        
        int ans = 0;
        for (String word : words) {
            int[] wordCount = new int[26];
            for (Character c : word.toCharArray()) {
                wordCount[c - 'a']++;
            }
            
            boolean good = true;
            for (int i = 0; i < 26; i++) {
                if (counts[i] < wordCount[i]) {
                    good = false;
                    break;
                }
            }
            
            if (good) {
                ans += word.length();
            }
        }
        
        return ans;
    }
}