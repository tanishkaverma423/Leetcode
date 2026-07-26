class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int required = target-nums[i];
            if(map.containsKey(required)){
                return new int[]{map.get(required),i}; //creating new array for answer and then returning
            }
            map.put(nums[i],i); // key,value
        }
        return new int[]{}; //returning empty array when nothing found 
    }
}