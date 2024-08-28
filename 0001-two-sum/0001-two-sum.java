class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] list = new int[2];
        for(int i1 = 0; i1<nums.length;i1++){
            for(int i2 = i1+1; i2<nums.length;i2++){
                if(nums[i1]+nums[i2]==target){
                    list[0] = i1;
                    list[1] = i2;
                }
            }
        }
        return list;
    }
}