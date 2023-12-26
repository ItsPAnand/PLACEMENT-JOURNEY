package DSA_in_java.stack_implementation;

public class ArrayStack<T> {
    static final int MAX_SIZE=30;
    T stack[]=(T[])new Object[MAX_SIZE];
    int top;
    ArrayStack(){
        top=-1;
    }

    public void push(T data){
        if(top==MAX_SIZE-1)
            throw new IndexOutOfBoundsException("Stack Overflow");
        stack[++top]=data;
    }

    public T pop(){
        if(top==-1)
            throw new IndexOutOfBoundsException("Stack Underflow");
        return stack[top--];
    }

    public T peek(){
        if(top==-1)
            throw new IndexOutOfBoundsException("Stack Underflow");
        return stack[top];
    }
    public void display(){
        if(top==-1)
            throw new IndexOutOfBoundsException("Stack Underflow");
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }

}
