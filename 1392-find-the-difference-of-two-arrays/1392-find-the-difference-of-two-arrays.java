class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        HashSet<Integer> n1hs = new HashSet<>();
        HashSet<Integer> n2hs = new HashSet<>();

        //transform nums1 and nums2 to hashsets.
        for(int num : nums1){
            n1hs.add(num);
        }

        for(int num : nums2){
            n2hs.add(num);
        }

        //chels for distnict values at nums1 hashset
        for(int i = 0;i<nums1.length;i++){
            if(!n2hs.contains(nums1[i]) && !l1.contains(nums1[i])){
                l1.add(nums1[i]);
            }
        }

        //cheks for distinct calues at nums2 hashset
        for(int i = 0;i<nums2.length;i++){
            if(!n1hs.contains(nums2[i]) && !l2.contains(nums2[i])){
                l2.add(nums2[i]);
            }
        }

        result.add(l1);
        result.add(l2);

        return result;
    }
}