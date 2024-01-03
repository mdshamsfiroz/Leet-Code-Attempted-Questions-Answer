class Solution {
    public int numberOfBeams(String[] bank) {
        // poc=previous of count , coc =current of count
        
        int poc=0;
        int ans=0;
    
      for(String s: bank){
          int coc=0;
          for( int i=0;i< s.length();i++)
              if(s.charAt(i) == '1')
                  coc++;
              
             if(coc > 0){
                 ans += coc * poc;
                 poc=coc;
             } 
             
              
             
          }
      
          return ans; 
    }
      }     
    