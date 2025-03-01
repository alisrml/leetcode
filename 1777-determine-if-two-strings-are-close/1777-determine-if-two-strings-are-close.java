class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()){//if length of words not equal then false.
            return false;
        }

        //letter frequencies of words must be equal for being close.
        Map<Character,Integer> wordFreqMap1 = new HashMap<>();
        Map<Character,Integer> wordFreqMap2 = new HashMap<>();

        for(char c : word1.toCharArray()){ //letter frequence of word1.
            wordFreqMap1.put(c, wordFreqMap1.getOrDefault(c,0)+1);
        }

        for(char c : word2.toCharArray()){ //letter frequence of word2.
            wordFreqMap2.put(c, wordFreqMap2.getOrDefault(c,0)+1);
        }
        
        if(!wordFreqMap1.keySet().equals(wordFreqMap2.keySet())){
            return false; //if their letter set not equal then they cant be close.
        }

        //last frequence values must be same for words to be close words.
        List<Integer> freqValues1 = new ArrayList<>(wordFreqMap1.values());
        List<Integer> freqValues2 = new ArrayList<>(wordFreqMap2.values());

        Collections.sort(freqValues1);
        Collections.sort(freqValues2);

        return freqValues1.equals(freqValues2);
    }
}