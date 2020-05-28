
/**
    Greedy algorithm.
    One pass, Time O(N) Space O(1) 
*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int local = 0;
        int global = 0;
        for (int n: nums){
            if(n == 1) {
                local ++;
                global = Math.max(local, global);
            }
            else{
                local = 0;
            }
        }
        return global;
    }
}