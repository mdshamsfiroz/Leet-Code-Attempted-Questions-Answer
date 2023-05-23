//{ Driver Code Starts
//Initial Template for Java

import java.util.*;


class Node
{
    int data;
    Node left, right;
    
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}


class ConstructTree
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int pre[] = new int[n];
            int preM[] = new int[n];
            
            for(int i = 0; i < n; i++)
              pre[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              preM[i] = sc.nextInt();
            
            Solution gfg = new Solution();  
           
            
            inorder(gfg.constructBTree(pre, preM, n));
            System.out.println();
            
        }
    }
    
    public static void inorder(Node root)
    {
        if(root == null)
         return;
         
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
	public int find(int a[], int si, int ei, int key) {
		for (int i = si; i <= ei; i++) {
			if (a[i] == key)
				return i;
		}
		return -1;
	}

	public Node construct(int pre[], int preM[], int si, int ei, int mSI, int mEI) {
		if (si > ei)
			return null;
		Node root = new Node(pre[si]);
		if (si == ei)
			return root;
		int x = find(pre, si + 1, ei, preM[mSI + 1]);
		root.left = construct(pre, preM, si + 1, x - 1, mSI + (ei - x + 1) + 1, mEI);
		root.right = construct(pre, preM, x, ei, mSI + 1, mSI + (ei - x + 1));
		return root;
	}

	public Node constructBTree(int pre[], int preM[], int size) {
		// your code here
		return construct(pre, preM, 0, size - 1, 0, size - 1);
	}

}