class Solution {
    public int minJumps(int[] arr) {
        if(arr.length==1) return 0;
        Queue<Integer> data =  new LinkedList<>();
        HashSet<Integer> op = new HashSet<>();
        HashSet<Integer> yo = new HashSet<>();
        HashMap<Integer,List<Integer>> info = new HashMap<>();
        for(int i=0;i<arr.length;i++)
            info.computeIfAbsent(arr[i],x->new ArrayList<Integer>()).add(i);
        data.add(0);
        int output = 0;
        while(!data.isEmpty()){
            int n = data.size();
            while(n-->0){
                int temp = data.remove();
                if(temp-1>=0&&!op.contains(temp-1)){ op.add(temp-1); data.add(temp-1); }
                if(temp+1<arr.length&&!op.contains(temp+1)){ op.add(temp+1); data.add(temp+1);}
                if(yo.contains(arr[temp])) continue;
                List<Integer> kl = info.get(arr[temp]);
                for(int j:kl) if(!op.contains(j)){ op.add(j); data.add(j);}
                yo.add(arr[temp]);
            }
            output++;
            if(op.contains(arr.length-1)) return output;
        }
        return output;
    }
}