class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double result = 0;
        if(nums.length == 1){
            //if the length of array 1 then average is the element.
            result = nums[0];
        }else{
            //array length greater than 1. a sliding window size of k will iterate the loop.
            double sum = 0;
            double tempsum = 0;
            int lp = 0;
            int rp = k-1;

            for(int i = 0;i<k;i++){
                //first k element iterated and added to tempsum and assigned to sum.
                tempsum += nums[i];
            }
            sum = tempsum;

            while(rp<nums.length-1){ 
                //leftmost elemet dropped and new rightmost element added to tempsum.
                tempsum -= nums[lp];
                tempsum += nums[rp+1];
                if(tempsum>sum){
                    //sum has updated if tempsum is greater.
                    sum = tempsum;
                }
                //pointers incremented.
                lp++;
                rp++;
            }
            //result value(average) is sum/k.
            result = sum/k;
        }
        return result;
    }
}