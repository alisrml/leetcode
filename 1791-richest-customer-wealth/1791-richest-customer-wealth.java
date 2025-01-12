class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxR = 0;
        int current = 0;
        for(int i = 0; i < accounts.length;i++){
            current = 0;
            for(int j = 0; j < accounts[i].length;j++){
                current += accounts[i][j];
            }
            if(current>maxR){
                maxR = current;
            }
        }
        return maxR;
    }
}