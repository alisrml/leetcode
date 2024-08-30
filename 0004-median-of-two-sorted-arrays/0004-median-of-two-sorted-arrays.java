class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newArr = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, newArr, 0, nums1.length);
        System.arraycopy(nums2, 0, newArr, nums1.length, nums2.length);
        Arrays.sort(newArr);
        int n = newArr.length;
        
        if (n % 2 == 0) { 
            int mid1 = n / 2;
            int mid2 = mid1 - 1;
            return (newArr[mid1] + newArr[mid2]) / 2.0;
        } 
        else {
            return newArr[n / 2];
        }
    }
}