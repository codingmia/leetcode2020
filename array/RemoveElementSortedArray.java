class Solution {
    public int removeDuplicates(int[] nums) { 
        int index = 0;
        for(int num: nums) {
            // we discover the relationship between nums[i] and last seen non-duplicate element
            // a new number occur, put it in the next slot.
            if(num != nums[index]){
                ++ index;
                nums[index] = num;
            }
        }
        return index+1;
    }
}