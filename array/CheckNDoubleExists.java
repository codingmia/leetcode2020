// One pass, O(N) time and space, similar to two sum ideas
// y = f(x), x = g(y)
// for every x, we check if f(x) exists, or we check if y exist.
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> numSet = new HashSet<>();
        for(int n : arr) {
            if(numSet.contains(2*n) || numSet.contains(n/2) && n%2 == 0)
                return true;
            numSet.add(n);
        }
        return false;
    }
}