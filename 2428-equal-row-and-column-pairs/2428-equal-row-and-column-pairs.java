class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<Integer,String> rows = new HashMap<>();
        HashMap<Integer,String> columns = new HashMap<>();
        int pairCount = 0;

        //fulfilling rows hashmap with rows as a string hash.
        for(int i = 0;i<grid.length;i++){
            StringBuilder sb = new StringBuilder("");
            for(int j = 0;j<grid.length;j++){    
                sb.append(grid[i][j]+" ");
            }
            rows.put(i,sb.toString());
        }

        //fulfilling columns hashmap with columns as a string hash.
        for(int i = 0;i<grid.length;i++){
            StringBuilder sb = new StringBuilder("");
            for(int j = 0;j<grid.length;j++){
                sb.append(grid[j][i]+" ");
            }
            columns.put(i,sb.toString());
        }

        //comparing rows and values for eqauality.
        for(String row:rows.values()){
            for(String column:columns.values()){
                if(row.equals(column)){
                    pairCount++;
                }
            }
        }

        return pairCount;
    }
}