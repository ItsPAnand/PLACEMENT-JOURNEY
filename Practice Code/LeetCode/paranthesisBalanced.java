package LeetCode;

import java.util.Stack;

public class paranthesisBalanced {
    public static void main(String[] args) {
        String S="({[)]})";
        boolean flag=isBalanced(S);
        System.out.println(flag);
    }

    private static boolean isBalanced(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            switch(ch){
                case '(':
                case '[':
                case '{':
                    st.push(ch);
                    break;
                case ')':
                    if(st.isEmpty() || st.pop()!='(')
                        return false;
                    break;
                case ']':
                    if(st.isEmpty() || st.pop()!='[')
                        return false;
                    break;
                case '}':
                    if(st.isEmpty() || st.pop()!='{')
                        return false;
                    break;
            }
        }
        return st.isEmpty();
    }
}
