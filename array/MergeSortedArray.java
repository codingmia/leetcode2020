// two pointer, O(M+N)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n -1;
        int i = m - 1;
        int j = n - 1;
        while(i >= 0 && j >= 0) {   
            nums1[index--] = nums1[i] < nums2[j] ? nums2[j--]: nums1[i--];
        }
        while(i >= 0){
            nums1[index--] = nums1[i--];
        }
        while(j >= 0){
            nums1[index--] = nums2[j--];
        }
        return;
    }
}
// todo document the different types of two pointers?