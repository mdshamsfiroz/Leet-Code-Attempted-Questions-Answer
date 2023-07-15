//{ Driver Code Starts
//Initial template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function template for C++

class Solution
{
    public:
    void deleteMid(stack<int>&s, int sizeOfStack)
    {
        stack<int> temp;
        int n=sizeOfStack;
        for(int i=0; i<n/2; i++){
            int val=s.top();
            s.pop();
            temp.push(val);
        }
        s.pop();
        for(int i=0; i<n/2; i++){
            int val=temp.top();
            temp.pop();
            s.push(val);
        }
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin>>t;
    
    while(t--)
    {
        int sizeOfStack;
        cin>>sizeOfStack;
        
        stack<int> myStack;
        
        for(int i=0;i<sizeOfStack;i++)
        {
            int x;
            cin>>x;
            myStack.push(x);    
        }

            Solution ob;
            ob.deleteMid(myStack,myStack.size());
            while(!myStack.empty())
            {
                cout<<myStack.top()<<" ";
                myStack.pop();
            }
        cout<<endl;
    }   
    return 0;
}

// } Driver Code Ends