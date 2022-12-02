//solve again      
class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        if(word1.length()==1){
                return word1.equals(word2);
        }
       char w1[]=word1.toCharArray();
       char w2[]=word2.toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);
        int count=1;
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<w1.length-1;i++){
            if(!word2.contains(""+w1[i])){
                return false;
            }
            if(w1[i]==w1[i+1]){
                count++;
            }
            else{
                list1.add(count);
                count=1;
            }
        }
        list1.add(count);
        count=1;
        
        for(int i=0;i<w2.length-1;i++){
            if(w2[i]==w2[i+1]){
                count++;
            }
            else{
                list2.add(count);
                count=1;
            }
        }
        list2.add(count);
        
        for(int i=0;i<list1.size();i++){
            if(list2.contains(list1.get(i))){
                list2.remove(list1.get(i));
            }
            else{
                return false;
            }
        }
        return true;
    }
       }