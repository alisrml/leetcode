class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        //this loop calculates for every index leftsum values.
        for(int i = 0;i<nums.length;i++){
            if(i==0){
                leftSum[i] = 0;
            }else{
                leftSum[i] = leftSum[i-1]+nums[i-1];
            }
        }

        //this loop calculates for every index rightsum values.
        for(int i = nums.length-1;i>=0;i--){
            if(i==nums.length-1){
                rightSum[nums.length-1] = 0;
            }else{
                rightSum[i] = rightSum[i+1] + nums[i+1];
            }
        }

        //this loop checks for pivot index.
        for(int i = 0;i<nums.length;i++){
            if(leftSum[i]==rightSum[i]){
                return i;
            }
        }
        
        //if no other index returned, return -1.
        return -1;
    }
}