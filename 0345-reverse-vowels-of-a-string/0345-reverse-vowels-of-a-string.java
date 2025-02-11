class Solution {
    public String reverseVowels(String s) {
        ArrayList<String> vowels = new ArrayList<>(Arrays.asList("a","e","i","o","u","A","E","I","O","U"));
        
        // split all characters at s
        String[] slist = s.split("");

        //checking for vowels at s and keeping in order
        ArrayList<String> vowelsAtS = new ArrayList<String>();
        for (int i=0;i<slist.length;i++){
            if(vowels.contains(slist[i])){
                vowelsAtS.add(slist[i]);
            }
        }

        //reversing the vowels at slist array
        int vc = vowelsAtS.size()-1;
        for (int i=0;i<slist.length;i++){
            if(vowels.contains(slist[i])){
                slist[i] = vowelsAtS.get(vc);
                vc--;
            }
        }

        //concatenate the slist
        String result = String.join("",slist);

        return result;
    }
}