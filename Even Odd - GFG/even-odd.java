//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            Solution obj = new Solution();
            obj.evenOdd(a, b);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    public void evenOdd(int a, int b){
        // Code here 
        if(a%2==0){
            System.out.println(a);
            System.out.println(b);
        }
        else{
            System.out.println(b);
            System.out.println(a);
        }
    }
}