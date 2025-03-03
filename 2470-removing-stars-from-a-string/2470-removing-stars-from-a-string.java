class Solution {
    public String removeStars(String s) {
        Stack<Character> sStack = new Stack<>(); //stack keeps letters in order.

        //fullfilling stack with letters in order.
        for(char c:s.toCharArray()){
            if(c == '*'){
                sStack.pop(); //if star comes pop the last letter.
            }else{
                sStack.add(c); //if letter add it to stack.
            }
        }

        //turn stack into string
        StringBuilder result = new StringBuilder();
        for(char c:sStack){
            result.append(String.valueOf(c));
        }

        return result.toString();
    }
}