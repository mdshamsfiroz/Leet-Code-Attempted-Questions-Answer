class Solution {
    public boolean isPalindrome(int x) {
          if (x < 0) 
            return false;
        
        int number = x;
        
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return x == reverse;
    }
}