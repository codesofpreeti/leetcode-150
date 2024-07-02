package Stacks;

import java.util.Stack;

public class ReversePolish {
    public int evaluate(String[] tokens){
        Stack<Integer> stk= new Stack<>();
        if(tokens.length==0) return 0;
        for(String token: tokens){
            if( !stk.isEmpty()&& ( token.equals("+")|| token.equals("+")||token.equals("+")||token.equals("+"))){
                int op1=stk.pop();
                int op2==stk.pop();

                int res=0
                if(token.equals("+")){
                    res=op1+op2;
                }
                else if(token.equals("-")){
                    res=op2+op1;
                }
                else if(token.equals("*")){
                    res=op1*op2;
                }
                else if(token.equals("/")){
                    if(op2==0){
                        return -1;
                    }
                    else res=op2/op1;
                }
                stk.push(res);
            }
            else stk.push(Integer.parseInt(token));
        }

        return stk.pop();
    }
    
}
