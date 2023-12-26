package DSA_in_java.interviewProblem;

import java.util.*;

public class postfixEvaluation {
    public static void main(String[] args) {
        String exp="231*+9-";
        isOperand('2');
        System.out.println(evaluatePostfix(exp));
    }
    public static int evaluatePostfix(String S){
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<S.length();i++){
            if(isOperand(S.charAt(i))){
                stack.push((int)S.charAt(i)-48);
            }
            else{
                int o1=stack.pop();
                int o2=stack.pop();

                switch(S.charAt(i)){
                    case '+':
                        stack.push(o2+o1);
                        break;
                    case '-':
                        stack.push(o2-o1);
                        break;
                    case '*':
                        stack.push(o2*o1);
                        break;
                    case '/':
                        stack.push(o2/o1);
                        break;
                    case '^':
                        stack.push((int)Math.pow(02,01));
                        break;
                }
            }
        }
        // System.out.println(stack);
        return stack.peek();
    }
    public static boolean isOperand(char c) {
        if( c>=48 && c<=57 )
            return true;
        return false;
    }
}

