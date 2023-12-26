package DSA_in_java.LinkedList_Implementation;

import java.util.Iterator;

public class singleLinkedList<T> implements Iterable<T>{  // generics it helps to create any types of data in list
    class Node{
        T data;
        Node next;
    }
    Node head;
    singleLinkedList(){   // this constructor will call when object is created
        head=null;
    }
    public void inserAtBeginning(T val){
        Node newnode=new Node();
        newnode.data=val;
        newnode.next=null;
        if(head==null){                             // when head is null it means there is no any other node in list
            head=newnode;
        }
        else{                                        // when list is not empty
            newnode.next=head;
            head=newnode;
        }
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public T displayHead(Node head){
        return head.data;
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
        }
        previous.next=temp.next;
        temp=null;
    }

    public void deleteAtBeginning(){
        if(head==null){                                   // if list is empty
            throw new IndexOutOfBoundsException("The list is Empty");
        }
        head=head.next;
    }

    public void reverse(){
        Node previous=null;
        Node current=head;
        Node next=head.next;

        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        head=previous;
    }

    public void smallestIntTheList(Node head){
        // Node temp=head;
        // T max=head.data;
        // while(temp!=null){
        //     if(temp.data>temp.next.data){
                
        //     }
        // }
    }

public Node removeDuplicate(Node head){
    Node temp=head;
    return temp;
}

    public singleLinkedList<T> mergeTheList(Node head1,Node head2){
        singleLinkedList<T> tempList=new singleLinkedList<>();
        Node temp=head1;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head2;
        return tempList;
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
