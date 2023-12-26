package DSA_in_java.stack_implementation;

public class stack_demo {
    public static void main(String[] args) {
        // ArrayStack<Integer> stack=new ArrayStack<>();
        // stack.push(86);
        // stack.push(69);
        // stack.push(6);
        // stack.push(76);
        // System.out.println(stack.pop());
        // System.out.println(stack.peek());
        //stack.display();

        // ArrayStack<String> s=new ArrayStack<>();
        // s.push("ANAND");
        // s.push("SHARATH");
        // s.display();

        LinkedListStack<Integer> LL_Stack=new LinkedListStack<>();
        LL_Stack.push(78);
        LL_Stack.push(77);
        LL_Stack.push(10);
        LL_Stack.push(90);
        LL_Stack.display();
       // System.out.print(LL_Stack.peek());
    }
}
