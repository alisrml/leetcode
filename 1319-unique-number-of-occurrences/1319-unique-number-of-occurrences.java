class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> oCount= new HashMap<>();

        //fulfilling hashmap with occurence values.
        for(int num:arr){
            oCount.put(num,oCount.getOrDefault(num,0)+1);
        }

        List<Integer> values = new ArrayList<>(oCount.values());
        Set<Integer> uniqueValues = new HashSet<>(values);

        //if there are repeated values hashset size be smaller than values.
        if (uniqueValues.size() < values.size()) {
            return false;
        } else {
            return true;
        }
    }
}