class Solution {
    public int[] productExceptSelf(int[] nums) {
        //array that keeps product results.
        int[] products = new int[nums.length];

        //each index will keep product of left nums.
        int leftp = 1;
        for(int i = 0;i<nums.length;i++){
            products[i] = leftp;
            leftp *= nums[i];
        }

        //each index will multiplied by products of right nums.
        int rightp = 1;
        for(int i = nums.length-1;i>=0;i--){
            products[i] *= rightp;
            rightp *= nums[i];
        }
        
        return products;
    }
}