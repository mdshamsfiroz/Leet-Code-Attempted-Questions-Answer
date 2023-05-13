class Solution {
    public void swap(char arr[],int left,int right){
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    public void reverseString(char[] arr) {
        
        int left= 0;
        int right = arr.length-1;
        
            while(left<=right){
            swap(arr,left,right);
            left++; right--;
        }
    }
}