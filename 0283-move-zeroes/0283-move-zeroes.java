class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0, n = nums.length;
        //k keeps indices of zero values. every nonzero values replace with 0 values.
        for (int i = 0; i < n; ++i) {
            if (nums[i] != 0) {
                int t = nums[i];
                nums[i] = nums[k];
                nums[k++] = t;
            }
        }
    }
}