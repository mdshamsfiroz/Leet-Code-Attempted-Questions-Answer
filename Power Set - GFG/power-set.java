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
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    List<String> result;
    public void printSubsequences(String input, int idx, String output){
        if(idx == input.length()){
            if(output.length()==0) return; //empty subsequence
            result.add(output);
            return;
        }
        
        //yes recursive call
        printSubsequences(input, idx+1, output + input.charAt(idx));
        
        //no recursive call
        printSubsequences(input, idx+1 , output);
    }
    
    
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        result=new ArrayList<>();
        printSubsequences(s,0, "");
        Collections.sort(result);
        return result;
    }
}