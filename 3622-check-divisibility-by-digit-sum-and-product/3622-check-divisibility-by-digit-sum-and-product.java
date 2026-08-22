class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n, sum = 0, prod = 1;
        while (temp > 0) {
            sum += temp % 10;
            prod *= temp % 10;
            temp /= 10;
        }
        if (n % (sum + prod) == 0) {
            return true;
        }
        return false;
    }
}