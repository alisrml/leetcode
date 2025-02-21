class Solution {
    public int maxVowels(String s, int k) {
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        int maxVowel = 0; //keeps max value of vowels at a window of size k.
        int currentMaxVowel = 0;

        //first windows vowel count.
        for(int i = 0;i<k;i++){
            if(vowels.contains(s.charAt(i))){
                currentMaxVowel++;
            }
        }
        maxVowel = currentMaxVowel;

        //every iteration steps 1 to right and cheks next windows vowel count.
        for(int i = k;i<s.length();i++){
            //if new element at tail vowel increment currentMaxVowel.
            if (vowels.contains(s.charAt(i))) {
                currentMaxVowel++;
            }
            //if the element that just passed vowel decrement currentMaxVowel.
            if (vowels.contains(s.charAt(i - k))) {
                currentMaxVowel--;
            }
            // if currentMaxVowel greater than maxVowel then update it.
            if(currentMaxVowel>maxVowel){
                maxVowel = currentMaxVowel;
            }
        }
        return maxVowel;
    }
}