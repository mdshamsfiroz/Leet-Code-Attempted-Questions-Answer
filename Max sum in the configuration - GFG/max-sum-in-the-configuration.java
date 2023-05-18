//{ Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			System.out.println(new GfG().max_sum(arr,n));
			
		t--;
		}
	}
	
}

// } Driver Code Ends


class GfG
{
    int max_sum(int arr[], int n)
    {
	// Your code here
	int sum=0 , sumWithIndex=0;
	 for(int i=0; i<n; i++){
	     sum+=arr[i];
	     sumWithIndex +=arr[i]*i;
	 }
	 int maxAns = sumWithIndex;
	  for(int i=1; i<n ; i++){
	     sumWithIndex = sumWithIndex - sum +arr[i-1]*n;
	     maxAns=Math.max(maxAns, sumWithIndex);
	 }
	 
	 return maxAns;
    }	
}
