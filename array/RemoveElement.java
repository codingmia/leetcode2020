class Solution {
    public int removeElement(int[] nums, int val) {
        // tracking the next slot for copying a number not equal val
        int index = 0;
        for(int num: nums){
            if(num != val) {
                nums[index] = num;
                index ++;
            }
        }
        return index;
    }
}