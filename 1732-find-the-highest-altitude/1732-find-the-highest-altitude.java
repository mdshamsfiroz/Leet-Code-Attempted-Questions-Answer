class Solution {
    public int largestAltitude(int[] gain) {
        
        int answer=0, altitude =0;
        // For Each Loop
        
        for(int val:gain){
            altitude+=val;
            answer=Math.max(answer, altitude);
            //if (altitude>answer) amswer =altitude;
        }
         
        return answer;
    }
}