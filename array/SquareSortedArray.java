//  Squares of a Sorted Array
// use the partial ordered sub arrays and merge 2 arrays
// time O(N) space O(N) had to use additional storage for merge cannot do it in-place
class Solution {
    public int[] sortedSquares(int[] A) {
        int L = A.length;
        int[] res = new int[L];
        int j = 0;
        // step 1 find the index of first positive number
        while (j < L && A[j] < 0)
            j++;
        
        int i = j-1;
        int index = 0;
        while(i >= 0 && j < L) {
            if(A[i]*A[i] <= A[j]*A[j]){
                res[index++] = A[i]*A[i];
                i --;
            }else {
                res[index++] = A[j]*A[j];
                j ++;
            }
        }
        
        while(i >= 0){
            res[index++] = A[i]*A[i];
                i --; 
        }
        while(j < L){
            res[index++] = A[j]*A[j];
                j ++;
        }       
        return res;
    }
    
    // step 1 find the index of first positive number
    // todo I could use O(logN) to find first non-negative
    private int findFirstPositive(int[] A) {
       // binary search
       return -1;
    }
     
}