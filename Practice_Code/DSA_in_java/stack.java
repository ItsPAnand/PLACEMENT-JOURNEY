package DSA_in_java;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        stack.push("hi");
        stack.push("hello");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
