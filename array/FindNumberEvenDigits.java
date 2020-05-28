//   Find Numbers with Even Number of Digits
// one pass time (N)
class Solution {
    public int findNumbers(int[] nums) {
        int numberOfEvenDigits = 0;
        for(int num : nums) {
            if(digits(num) % 2 == 0)
                numberOfEvenDigits ++;
        }
        return numberOfEvenDigits;
    }
     
    private int digits(int num) {
        if (num == 0) return 1;
        int numberOfDigits = 0;
        while(num > 0) {
            num = num/10;
            numberOfDigits++;
        }
        return numberOfDigits;
    }
}