// Time O(new length) Space in place.
class Solution {
    public void duplicateZeros(int[] arr) {
        int L = arr.length;
        int countZero = 0;
        for (int i = 0; i < L; i++){
            if(arr[i] == 0) countZero ++;
        }
        int index = countZero + L - 1;
        
        for(int i = L - 1, j = index; i< j; i--, j--){
            if(j < L) arr[j] = arr[i];
            if(arr[i] == 0){
                j--;
                if(j < L) arr[j] = arr[i];
            }
        }
        return;
    }
}