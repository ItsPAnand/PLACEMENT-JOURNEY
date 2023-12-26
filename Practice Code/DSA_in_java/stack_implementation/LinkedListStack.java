package DSA_in_java.stack_implementation;

public class LinkedListStack<T> {
    class Node{
        T data;
        Node next;
    }
    Node top;
    LinkedListStack(){
        top=null;
    }

    public void push(T value){
        Node newnode=new Node();
        newnode.data=value;

        newnode.next=top;
        top=newnode;
    }

    public T pop(){
        if(top==null)
            throw new IndexOutOfBoundsException("Stack is underflow");
        T temp=top.data;
        top=top.next;
        return temp;
    }
    public T peek(){
        if(top==null)
            throw new IndexOutOfBoundsException("Stack is underflow");
        return top.data;
    }

    public void display(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
