class Solution {
    public boolean isPalindrome(int x) {
     int reverseNum = 0;
  int tempOriginal = x;

  while (tempOriginal > 0) {

    int lastDigit = tempOriginal % 10;
    reverseNum = reverseNum * 10 + lastDigit;
    tempOriginal = tempOriginal / 10;
  }

  if (x == reverseNum) {
    return true;
  } else {
    return false;
   
    }
}
}