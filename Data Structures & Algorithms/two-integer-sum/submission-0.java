class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapVal = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int leftSum = target - nums[i];
            if(mapVal.containsKey(leftSum)){
                return new int[] {mapVal.get(leftSum), i};
            }
            mapVal.put(nums[i], i);
        }
        return new int[] {0, 0};
    }
}
