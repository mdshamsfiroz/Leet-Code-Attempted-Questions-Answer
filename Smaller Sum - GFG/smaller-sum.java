//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine());
            String s[]=in.readLine().trim().split(" ");
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(s[i]);
            }
            Solution ob=new Solution();
            long ans[]=ob.smallerSum(n,a);
            for(long i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public long[] smallerSum(int n,int arr[])
 {
        HashMap<Integer,Long> map=new HashMap<>();
        long[] ans=new long[n]; int in=0;
        int[] arrcpy=new int[n];
        
        for(int i=0;i<n;i++) arrcpy[i]=arr[i]; 
        
        
        Arrays.sort(arrcpy);
        
        long prefixSum=arrcpy[0];
        map.put(arrcpy[0],(long)0);
        
        for(int i=1;i<n;i++)
        {
            if(arrcpy[i-1]==arrcpy[i])
            {
                long sum=map.get(arrcpy[i-1]);
                map.put(arrcpy[i],sum);
            }
            else
            {
                map.put(arrcpy[i],prefixSum);
            }
            
            prefixSum+=arrcpy[i];
        }
        
        
        for(int i=0;i<n;i++)
        {
            ans[i]=map.get(arr[i]);
        }
        
            return ans;
    }
}