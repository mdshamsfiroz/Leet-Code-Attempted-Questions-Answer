// I used bit manipulation. XOR will return 1 only on two different bits. So if two numbers are the same, XOR will return 0. Finally only one number left.
class Solution {
    public int singleNumber(int[] nums) {
         int x = 0;
         for (int a:nums){
             x=x^a;
         }
     return x;   
            }
        }
    
