class Solution {
    public int longestSubarray(int[] nums) {
        //array keeps the longest subarray length of 1's at the left and right side of index.
        int[] left = new int[nums.length+1];
        int[] right = new int[nums.length+1];

        //fullfilling the left array
        for (int i = 1; i <= nums.length; ++i) {
            if (nums[i - 1] == 1) {
                left[i] = left[i - 1] + 1;
            }
        }
        //fullfilling the right array
        for (int i = nums.length - 1; i >= 0; --i) {
            if (nums[i] == 1) {
                right[i] = right[i + 1] + 1;
            }
        }

        //for each index calculating the longest 1's subarray length and comparing it.
        int ans = 0;
        for (int i = 0; i < nums.length; ++i) {
            ans = Math.max(ans, left[i] + right[i + 1]);
        }
        return ans;

    }
}