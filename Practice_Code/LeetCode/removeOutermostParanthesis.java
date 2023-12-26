package LeetCode;

import java.util.*;

public class removeOutermostParanthesis {
    public static void main(String[] args) {
        String S="(()())(())";          //outpt="()()()"

        Stack<Character> stack=new Stack<>();
        StringBuilder result=new StringBuilder();

        for(char ch:S.toCharArray()){
            if(ch=='('){
                if(!stack.isEmpty()){
                    result.append(ch);
                }
                stack.push(ch);
            }
            else{
                stack.pop();
                if(!stack.isEmpty()){
                    result.append(ch);
                }
            }
        }
        System.out.println(result.toString());
    }
}
