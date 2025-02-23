class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroCount = 0;

        //all elements on the array checked with loop.
        for(int right = 0;right < nums.length;right++){
            //if the element checked equals 0 increment zeroCount.
            if(nums[right] == 0){
                zeroCount++;
            }

            //if zeros flipped more than k need to decrement.
            if(zeroCount>k){
                //if the left pointer points 0 dont count as flipped.
                if(nums[left] == 0){
                    zeroCount--;
                }
                left++;
            }
        }
        //result is length - left pointer value.
        return nums.length - left;
    }
}