//{ Driver Code Starts
//Initial Template for Java
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Geeks g = new Geeks();
		g.getInput();
	}
}
// } Driver Code Ends


//User function Template for Java

//Complete the function
//Take input for a and s 
class Geeks {
	static void getInput () {
		
	    Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt(); //Taking the number of testcases
	    while(t-->0)
	    {
    		 int a = sc.nextInt(); 
    		 sc.nextLine();
    		 // used this line of code to skip the \n left as when a = sc.nextInt //happens the cursor will lie just next to the number on same line
    	    String s =sc.nextLine();
    	    
    	    
    	    //Your code here
    
    		System.out.println(a);
    		System.out.println(s);
	    }
	
	}
}

