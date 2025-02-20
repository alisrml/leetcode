class Solution {
    public int maxOperations(int[] nums, int k) {
        //sorting array
        Arrays.sort(nums);
        
        //declaring leftpointer and rightpointer.
        int lp = 0;
        int rp = nums.length -1;
        int result = 0;

        //iterate each element of the array
        while(lp<rp){
            int sum = nums[lp] + nums[rp];
            //if pairs sum equal to k. change pointers increment result.
            if(sum == k){
                result++;
                lp++;
                rp--;    
            }else if(sum>k){
                //if sum bigger than k decrement rp. because array sorted sum should be smaller.
                rp--;
            }else{
                //if sum smaller than k increment lp. because sum should be bigger.
                lp++;
            }
        }
        return result;
    }
}