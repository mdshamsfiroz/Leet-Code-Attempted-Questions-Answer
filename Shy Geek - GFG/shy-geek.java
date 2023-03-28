//{ Driver Code Starts
import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        

        while(t-->0){
            Shop shop = new Shop();

            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            long k = Long.parseLong(s[1]);

            s = br.readLine().trim().split(" ");

            for(String x: s){
                shop.addChocolate(Integer.parseInt(x));
            }
            
            ot.println(new Solution(shop).find(n, k));
        }
        ot.close();
    }
    
    
}
class Shop{
    private static List<Integer> chocoloates;
    private static int countOfCalls;
    Shop(){
        chocoloates = new ArrayList<>();
        countOfCalls = 0;
    }
    public static void addChocolate(int price){
        chocoloates.add(price);
    }

    public static int get(int i){
        countOfCalls++;
        if(countOfCalls > 50 || i >= chocoloates.size() || i < 0)
            return -1;
        return chocoloates.get(i);
    }
}
// } Driver Code Ends


//User function Template for Java

/*
Instructions - 

    1. 'shop' is object of class Shop.
    2. User 'shop.get(int i)' to enquire about the price
            of the i^th chocolate.
    3. Every chocolate in shop is arranged in increasing order
            i.e. shop.get(i) <= shop.get(i + 1) for all 0 <= i < n - 1
*/
class Solution{
    
    static Shop shop;
    Solution(Shop shop){
        this.shop = shop;
    }
    static long find(int n, long k){
        // Return the number of chocolates Geek had
        // enjoyed out of 'n' chocolates availabe in the
        // 'shop'.
    // Initialize the number of chocolates enjoyed by the geek to 0.
    long maxChocolates = 0;
    // Initialize the left and right indices for binary search.
    int left = 0;
    int right = n - 1;
    // Keep looping while the geek has some money left.
    while (k > 0) {
        // Initialize the maximum price of chocolate that the geek can afford.
        int maxPrice = 0;
        // Perform binary search to find the highest price chocolate that the geek can afford.
        while (left <= right) {
            // Calculate the middle index of the search range.
            int mid = (left + right) / 2;
            // Get the price of the chocolate at the middle index.
            int price = shop.get(mid);
            // If the price is higher than the remaining money, search in the lower half.
            if (price > k) {
                right = mid - 1;
            // Otherwise, update the maximum price found so far and search in the upper half.
            } else {
                maxPrice = price;
                left = mid + 1;
            }
        }
        // If the maximum price is 0, break the loop since there are no chocolates that the geek can afford.
        if (maxPrice == 0) {
            break;
        }
        // Calculate the maximum number of chocolates that the geek can buy with the remaining money.
        int numChocolates = (int) (k / maxPrice);
        // Add the number of chocolates to the total count.
        maxChocolates += numChocolates;
        /* Update the remaining money by taking the modulo with the price of the highest price 
        chocolate that the geek can afford.*/
        k = k % maxPrice;
        // Reset the left index to perform binary search on the entire array in the next iteration.
        left = 0;
    }
    // Return the number of chocolates enjoyed by the geek.
    return maxChocolates;
    }
    
}