/* Leetcode House robber */


class Solution {
    public int rob(int[] nums) {
        int prevPrev = 0, prev = 0;
        for(int i : nums){
            int curr = Math.max(i+prevPrev , prev);
            prevPrev = prev;
            prev = curr;
        }
        return prev;
        
    }
}
