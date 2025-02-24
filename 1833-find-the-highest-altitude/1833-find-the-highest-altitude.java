class Solution {
    public int largestAltitude(int[] gain) {
        int result = 0;
        int curr = 0;

        for(int g : gain){
            curr += g;
            result = Math.max(result,curr);
        }

        return result;
    }
}