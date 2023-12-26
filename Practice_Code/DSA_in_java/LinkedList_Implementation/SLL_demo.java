package DSA_in_java.LinkedList_Implementation;

import java.util.Iterator;
import java.util.List;

import DSA_in_java.LinkedList_Implementation.singleLinkedList.Node;


public class SLL_demo {
    public static void main(String[] args) {
        // singleLinkedList<Integer> list=new singleLinkedList<Integer>();

        // list.inserAtBeginning(69);
        // list.inserAtBeginning(10);
        // list.inserAtBeginning(99);
        // list.display();
        // list.insertAtPosition(25,2);
        // list.insertAtPosition(105,0);
        // list.insertAtPosition(9,5);
        // list.display();
        // list.deleteAtPosition(2);
        // list.deleteAtPosition(0);
        // list.deleteAtPosition(3);
        // list.deleteAtPosition(0);
        // list.display();
        // list.deleteAtBeginning();
        // list.display();

        // for(int a:list){                                              // this is custom for each loop 
        //     System.out.println(a+" ");
        // }              

        // Iterator<Integer> it=list.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }


        // singleLinkedList<Integer> LL=new singleLinkedList<>();
        // LL.insertAtPosition(9, 0);
        // LL.insertAtPosition(7, 1);
        // LL.insertAtPosition(4, 2);
        // LL.insertAtPosition(3, 3);
        // System.out.println("Before Reversing");
        // LL.display();
        // System.out.println("After reversing");
        // LL.reverse();
        // LL.display();

        singleLinkedList<Integer> list1=new singleLinkedList<>();
        list1.inserAtBeginning(5);
        list1.inserAtBeginning(5);
        list1.inserAtBeginning(3);
        list1.inserAtBeginning(3);
        list1.inserAtBeginning(1);
        list1.inserAtBeginning(4);
        list1.inserAtBeginning(5);
        list1.inserAtBeginning(2);
        list1.inserAtBeginning(2);
        list1.inserAtBeginning(5);
        Node did=list1.removeDuplicate(list1.head);
        list1.display();
        // list1.smallestIntTheList(list1.head);
    //     singleLinkedList<Integer> list2=new singleLinkedList<>();
    //     list2.inserAtBeginning(4);
    //     list2.inserAtBeginning(2);
    //     singleLinkedList<Integer> merged=new singleLinkedList<>();
    //    merged= mergeTheList(list1.head,list2.head);
    //    list1.display();
    //    list2.display();
    //    System.out.println(list1.displayHead(list1.head));

    }

}
