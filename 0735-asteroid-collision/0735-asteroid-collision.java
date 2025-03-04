class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> asteroidStack = new Stack<>();

        for(int a:asteroids){
            //asteroids will checked from left to right.
            if(a>0){
                //if direction right add to stack no collasion right now.
                asteroidStack.push(a);
            }else{
                //a<0 direcction to left case.
                while(!asteroidStack.isEmpty() && asteroidStack.peek()>0 && asteroidStack.peek()<-a){
                    //if there is asteriod at stack direction to the right and smaller than current will explode.
                    asteroidStack.pop();
                }
                if(asteroidStack.isEmpty() || asteroidStack.peek()<0){
                    //if stack is emptyo or stacks asteriod direction left too push to stack.
                    asteroidStack.push(a); 
                }else if(asteroidStack.peek() == -a){
                    //if both asteroids same size and collapse both will explode.
                    asteroidStack.pop();
                }else{
                    //stacks last asteroid bigger then current one and collapse then current one explode.
                    continue;
                }
            }
        }

        //turn stack into array.
        int[] rArr = new int[asteroidStack.size()];
        for(int i = asteroidStack.size()-1;i>=0;i--){
            rArr[i] = asteroidStack.pop();
        }

        return rArr;
    }
}