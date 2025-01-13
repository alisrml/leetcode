class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answerArr = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            if(i%3==0 && i%5==0){
                answerArr.add(new String("FizzBuzz"));
            }else if(i%3==0){
                answerArr.add(new String("Fizz"));
            }else if(i%5==0){
                answerArr.add(new String ("Buzz"));
            }else{
                answerArr.add(Integer.toString(i));
            }
        }
        return answerArr;
    }
}