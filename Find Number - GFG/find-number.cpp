//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
public:
    long long findNumber(long long N){
        // Code here
        long long ans=0;
        if(N<=5)
        {
            if(N==1)
            {return 1;}
             if(N==2)
            {return 3;}
             if(N==3)
            {return 5;}
             if(N==4)
            {return 7;}
             if(N==5) 
            {return 9;}
        }
        if(N%5==0) return findNumber(N/5-1)*10 +9;
        else return findNumber(N%5)+findNumber(N/5)*10;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        long long N;
        cin>>N;
        Solution ob;
        cout<<ob.findNumber(N)<<endl;
    }
    return 0;
}
// } Driver Code Ends