//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().maxRepeating(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    int maxRepeating(int[] nums, int n, int k) {
        // code here
        for(int idx  =0; idx< n; idx++){
            int original =nums[idx]%(n+1);
            nums[original] +=(n+1);
        }
        // maximum repeating number
        int maxRepeating =0, maxFreq =0;
        for(int idx=0; idx<n; idx++){
            int freq = nums[idx]/(n+1);
            if(freq>maxFreq){
                maxRepeating=idx;
            maxFreq = freq;
            }
        }
     return maxRepeating;
        
    }
    
    
}