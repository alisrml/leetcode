class Solution {
    public int compress(char[] chars) {
        int writeIndex = 0;
        int readIndex = 0;

        //iterate all elements of the array.
        while(readIndex<chars.length){
            char currentChar = chars[readIndex];
            int count = 0;

            //iterates all same chars on array.
            while(readIndex < chars.length && chars[readIndex] == currentChar){
                readIndex++;
                count++;
            }
            
            //save the character to array.
            chars[writeIndex++] = currentChar;

            //save the number of repeats.
            if(count>1){
                for(char c : String.valueOf(count).toCharArray()){
                    chars[writeIndex++] = c;
                }
            }
        }
        return writeIndex;
    }
}