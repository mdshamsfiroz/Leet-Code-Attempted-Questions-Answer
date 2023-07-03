//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxIndexDiff(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

  int maxIndexDiff(int arr[], int n) {
    int[] v_min = new int[n];
    int[] v_max = new int[n];
    v_min[0] = arr[0];
    v_max[n - 1] = arr[n - 1];
    for (int i = 1; i < n; i++) {
        v_min[i] = Math.min(v_min[i - 1], arr[i]);
        v_max[n - i - 1] = Math.max(v_max[n - i], arr[n - i - 1]);
    }
    int ans = 0, i = 0, j = 0;
    while (i < n && j < n) {
        if (v_min[i] <= v_max[j]) {
            ans = Math.max(ans, j - i);
            j++;
        } else {
            i++;
        }
    }
    return ans;
}
}