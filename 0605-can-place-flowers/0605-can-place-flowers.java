class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        int avaliablePlace = 0;
        while(i<flowerbed.length){
            if(flowerbed[i]==1){
                //if the place we check equal 1 directly jump to adjacent of its adjacent
                i++;
            }else{
                //if the place we check equal 0 check for adjacents
                if(i==0){
                    //if the checked plot at head of the array
                    if(flowerbed.length == 1){
                        //if the array size 1 and plot is 0
                        avaliablePlace ++;
                        break;
                    }else if(flowerbed[i+1]==0){
                        avaliablePlace++;
                        i++;      
                    }
                }else if (i==flowerbed.length-1){
                    //if the checked plot at tail of the array
                    if(flowerbed[i-1]==0){
                        avaliablePlace++;      
                    }
                }else{
                    //if the checked plot at rest of the array
                    if(flowerbed[i+1]==0 &&flowerbed[i-1]==0){
                        avaliablePlace++;
                        i++; 
                    }
                }
                i++;
            }
        }
        return avaliablePlace >= n;
    }
}