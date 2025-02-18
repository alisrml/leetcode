class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0, tIndex = 0;

        //if s length 0 means true anyway.
        if(s.length() == 0){
            return true;
        }

        //loop will iterate each character of t.
        while(tIndex<t.length()){
            //if there is a character match both indexes increment.
            if(s.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
                tIndex++;
                //if the sIndex and s length equal means there is a match.
                if(sIndex == s.length()){
                    return true;
                }
            }else{
                //if there is no match only t index inrecements.
                tIndex++;
            }
        }

        return false;
    }
}