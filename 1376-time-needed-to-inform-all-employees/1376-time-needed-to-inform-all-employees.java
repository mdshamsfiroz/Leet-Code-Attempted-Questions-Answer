class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, Integer> times = new HashMap<>();
        int max = 0;
        for(int i = 0; i < n; i++) {
            max = Math.max(max, dfs(i, manager, informTime, times));
        }
        
        return max;
    }
    
    private int dfs(int e_id, int[] manager, int[] informTime, Map<Integer, Integer> times) {
        if(manager[e_id] == -1) return 0;
        
        if(times.containsKey(e_id)) return times.get(e_id);
        
        times.put(e_id, informTime[manager[e_id]] + dfs(manager[e_id], manager, informTime, times));
		
        return times.get(e_id);
    } 
}