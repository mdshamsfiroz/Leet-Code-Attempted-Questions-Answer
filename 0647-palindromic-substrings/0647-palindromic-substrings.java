class Solution {
    public int countSubstrings(String s) {
         int count=0;
         	  for(int i=0;i<s.length();i++){
                 
	            for(int j=i+1;j<=s.length();j++){
	                String sub=s.substring(i,j);
	                boolean isPalindrome=IsPalindrome(sub);
	                
	                if(isPalindrome==true) {
	                	count++;
	                }
	               
	            }
		  }
        return count;
		  
    }
	public static boolean IsPalindrome(String sub) {
		boolean flag=true;
		
		int left=0;
		int right=sub.length()-1;
		while(left<right) {
			char chleft=sub.charAt(left);
	        char chright=sub.charAt(right);
	        
	        if(chleft!=chright) {
	        	flag=false;
	        	break;
	        }
	        left++;
	        right--;
		}
		return flag;
	}

    }
