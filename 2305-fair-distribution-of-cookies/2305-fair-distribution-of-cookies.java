class Solution {
    int result = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
    //backtracking
     int[] count = new int[k];
     backtracking(cookies, 0, count, 0);
    return result;
}

private void backtracking(int[] cookies, int index, int[] count, int isVisitedCount) {
    if(count.length - isVisitedCount > cookies.length - index) return;
    if(index >= cookies.length) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < count.length; i++) {
            max = Math.max(max, count[i]);
        }
        result = Math.min(result, max);
        return;
    }
    for(int i = 0; i < count.length; i++) {
        boolean isVisited = count[i] > 0;
        count[i] += cookies[index];
        backtracking(cookies, index + 1, count, isVisited ? isVisitedCount : isVisitedCount + 1);
        count[i] -= cookies[index];
    }
}
}