//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            Solution ob = new Solution();
            String ans = ob.modify(s);
            System.out.println(ans);
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String modify(String s) {
        char firstChar = s.charAt(0);
        if (Character.isUpperCase(firstChar)) {
            return s.toUpperCase();
        } else {
            return s.toLowerCase();
        }
    }
}
