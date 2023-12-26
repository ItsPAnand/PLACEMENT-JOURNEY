package DSA_in_java.interviewProblem;

import java.util.*;

public class prefixEvaluation {
    public static void main(String[] args) {
        String exp="-+2*34/6^23";
        System.out.println(evaluate(exp));
    }
    public static int evaluate(String S){
        Stack<Integer> stack=new Stack<>();

        for(int i=S.length()-1;i>=0;i--){
            if(isOperand(S.charAt(i))){
                stack.push((int)S.charAt(i)-48);
                // System.out.println(S.charAt(i));
            }
            else{
                int o1=stack.pop();
                int o2=stack.pop();

                switch(S.charAt(i)){
                    case '+':
                        stack.push(o1+o2);
                        break;
                    case '-':
                        stack.push(o1-o2);
                        break;
                    case '*':
                        stack.push(o1*o2);
                        break;
                    case '/':
                        stack.push(o1/o2);
                        break;
                    case '^':
                        stack.push((int)Math.pow(01,02));
                        break;
                }
            }
        }

        return stack.peek();
    }
    public static boolean isOperand(char c){
        if( c>=48 && c<=57 )
            return true;
        return false;
    }
}
