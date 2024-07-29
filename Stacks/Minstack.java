package Stacks;

import java.util.Stack;

/**
 * Minstack
 */
public class Minstack {

    Stack<Integer> s= new Stack<>();
    Stack<Integer> minStack= new Stack<>();

    public minStack(){
        //constructor
    }
    public void push(int val){
        s.push(val);
        if(minStack.isEmpty() || minStack.peek()>=val){
            minStack.push(val);
        }

    }
    public void pop(){
        if(!s.isEmpty()){
            if(s.peek().equals((minStack.peek()))){
                s.pop();
                minStack.pop();
            }
            else s.pop();
        }
    }
    public int top(){
        return s.pop();
    }
    public int getMin(){
        return minStack.peek();
    }
}