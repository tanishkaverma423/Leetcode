import java.util.*;
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);  //arrange in order negative to positive in increasing order
        int n = nums.length;
        int prod1 = nums[n-1]*nums[n-2]*nums[n-3];  // in case of only positive no
        int prod2 = nums[0]*nums[1]*nums[n-1];  // in case negative numbers are also present along with positive no
        return Math.max(prod1, prod2);
    }
}