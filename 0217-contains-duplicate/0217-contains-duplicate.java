class Solution {
    public boolean containsDuplicate(int[] nums) {
    Set<Integer> numset = new HashSet<>();
    for(int i: nums) {
        if(!numset.add(i))
            return true;
    }
    return false;

    }
}