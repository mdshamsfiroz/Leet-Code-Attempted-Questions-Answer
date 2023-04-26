//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    static class FastReader{ 
		BufferedReader br; 
		StringTokenizer st; 
  
		public FastReader(){ 
			br = new BufferedReader(new InputStreamReader(System.in)); 
		} 
  
		String next(){ 
			while (st == null || !st.hasMoreElements()){ 
				try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
			} 
			return st.nextToken(); 
		} 
  
		String nextLine(){ 
			String str = ""; 
			try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
			return str; 
		} 
	}
	
    public static void main(String args[])throws IOException
    {
        FastReader sc = new FastReader();
        int t = Integer.parseInt(sc.next());
        while(t-- > 0)
        {
            char c = sc.next().charAt(0); 

            Solution ob = new Solution();
            System.out.println(ob.isVowel(c));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    String isVowel(char c){
        // code here
        if(c =='a'|| c== 'e' || c== 'i' || c== 'o' || c=='u' ||c=='A'|| c=='E'|| c=='I'|| c=='O'||c=='U'){
            String str="YES";
            return str;
        }
        else{
            String str1="NO";
            return str1;
        }
    }
}
