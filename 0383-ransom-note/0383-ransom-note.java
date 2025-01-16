class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //iki arraylist olusturup elemanları parse edebilirim. bu parse
        //sonucunda olusan ilk liste empty olana kadar bir whileda döner.
        //ve içinde olan her harf için karsı liste ile matchlesip her ikisindende
        //bosaltma islemi yapılabilir.
        char[] charArr1 = ransomNote.toCharArray();
        char[] charArr2 = magazine.toCharArray();

        ArrayList<Character> charList1 = new ArrayList<>();
        for(char c:charArr1){
            charList1.add(c);
        }

        ArrayList<Character> charList2 = new ArrayList<>();
        for(char c:charArr2){
            charList2.add(c);
        }

        while(!charList1.isEmpty() && !charList2.isEmpty()){
            if(charList2.contains(charList1.get(0))){
                charList2.remove(charList1.get(0));
                charList1.remove(charList1.get(0));
            }else{
                return false;
            }
        }
        if(charList1.isEmpty()){
            return true;
        }
        return false;
    }
}