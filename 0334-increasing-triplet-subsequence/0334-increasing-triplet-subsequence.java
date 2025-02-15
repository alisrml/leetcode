class Solution {
    public boolean increasingTriplet(int[] nums){
        //if the length of nums smallet than 3 return false.
        if (nums == null || nums.length < 3) return false;

        //declaring array of smallest and greatest numbers
        int n = nums.length;
        int[] smallest = new int[n];
        int[] greatest = new int[n];
        
        //finding smallest numbers
        smallest[0] = nums[0];
        for (int i = 1; i < n; i++) {
            smallest[i] = Math.min(smallest[i - 1], nums[i]);
        }
        
        //finding greatest numbers
        greatest[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            greatest[i] = Math.max(greatest[i + 1], nums[i]);
        }
        
        //checking for numbers are they have left smaller and right bigger number.
        for (int i = 1; i < n - 1; i++) {
            //first and last numbers will not cheked.
            if (nums[i] > smallest[i - 1] && nums[i] < greatest[i + 1]) {
                return true;
            }
        }
        
        return false;
    }
}