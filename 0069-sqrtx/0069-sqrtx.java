class Solution {
    public int mySqrt(int x) {
        int low = 0, high = x, ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long sq = (long)mid * mid;
            if (sq == x) {
                return mid;
            } else if (sq < x) {
                low = mid + 1;
                ans = mid;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}