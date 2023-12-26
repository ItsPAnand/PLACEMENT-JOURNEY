
package DSA_in_java.LinkedList_Implementation;

import java.util.Iterator;

public class doublyLinkesList<T> implements Iterable<T>{  // generics it helps to create any types of data in list
    class Node{
        Node previous;
        T data;
        Node next;
    }
    Node head;
    Node tail;
    doublyLinkesList(){   // this constructor will call when object is created
        head=null;
        tail=null;
    }
    public void inserAtBeginning(T val){
        Node newnode=new Node();
        newnode.previous=null;
        newnode.data=val;
        newnode.next=null;
        if(head==null){                             // when head is null it means there is no any other node in list
            head=newnode;
            tail=newnode;
        }
        else{                                        // when list is not empty
            head.previous=newnode;
            newnode.next=head;
            head=newnode;
        }
    }

    public void display() throws Exception{
        if(head==null){
            throw new Exception("List is Empty");
        }
        Node temp=head;
        System.out.print("NULL <-> ");
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public void displayReverse() throws Exception{
        if(tail==null){
            throw new Exception("List is Empty");
        }
        Node temp=tail;
        System.out.print("NULL <-> ");
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.previous;
        }
        System.out.println("NULL");
    }

    public void insertAtPosition(T val,int position){
        if(position==0){
            inserAtBeginning(val);
            return;
        }

        Node newnode=new Node();
        newnode.data=val;
        newnode.next=null;
        Node temp=head;
        for(int i=1;i<=position-1;i++){
            temp=temp.next;
            if(temp==null){
                // System.err.println("Invalid Position");
                // return;
                throw new IndexOutOfBoundsException("Invalid Position "+position);
            }
        }
        newnode.next=temp.next;
        newnode.previous=temp;
        if(temp==tail)             // Incase of inserting at last
            tail=newnode;
        else
            temp.next.previous=newnode;
        temp.next=newnode;

    }

    public void deleteAtPosition(int position){
        if(head==null){                                   // if list is empty
            throw new IndexOutOfBoundsException("The list is Empty");
        }
        if(position==0){                        // deleting the first node
            deleteAtBeginning();
            return;
        }
        Node temp=head;
        Node previous=null;
        for(int i=1;i<=position;i++){
            previous=temp;              // previous of delete node
            temp=temp.next;             // jump to delete node
            if(temp==null)
                throw new IndexOutOfBoundsException("Ivalid Position");
        }
        previous.next=temp.next;
        if(temp.next==null)
            tail=previous;
        else
            temp.next.previous=previous;
    }

    public void deleteAtBeginning(){
        if(head==null){                                   // if list is empty
            throw new IndexOutOfBoundsException("The list is Empty");
        }
        head=head.next;
        if(head==null)
            tail=null;
        else
            head.previous=null;
    }

    public Iterator<T> iterator(){
        return new Iterator<T>() {
            Node temp=head;
            public boolean hasNext(){
                return temp!=null;
            }
            public T next(){
                T val=temp.data;
                temp=temp.next;
                return val;
            }
        };
    }

}
