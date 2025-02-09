class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //new list for keeping the boolean values.
        ArrayList<Boolean> result = new ArrayList<Boolean>();
        
        //find max value of candies.
        int max = 0;
        for(int a = 0; a<candies.length;a++){
            if(candies[a]>max){
                max = candies[a];
            }
        }

        //code for check every kids candies and fullfiling the boolean result list.
        for(int i=0;i < candies.length;i++){
            if(candies[i]+extraCandies>=max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}