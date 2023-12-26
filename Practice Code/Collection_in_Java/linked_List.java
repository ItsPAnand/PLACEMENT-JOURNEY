package Collection_in_Java;

import java.util.*;

public class linked_List {
    public static void main(String[] args) {
        //same it has all methods in arrayList
        LinkedList<String> linked_List=new LinkedList<String>();
        linked_List.add(0, "Anand");
        linked_List.add(1,"Sharath");
        linked_List.add(2,"Bharath");
        linked_List.add(3, "Akilesh");
        linked_List.add(4,"SakthiVel");
        linked_List.add(5, "Anand");
        linked_List.addFirst("Vasanth");
        linked_List.addLast("Vimal");
        // System.out.println(linked_List.contains("Anand"));         
        System.out.println(linked_List);
        // System.out.println(linked_List.lastIndexOf("Anand"));               // return last occurence index
        // System.out.println(linked_List.element());                           // returns fisrt element

        LinkedList<String> Reverse=new LinkedList<>();              // reversing the linked list
        int index=0;
        for(int i=linked_List.size()-1;i>=0;i--){
            Reverse.add(index, linked_List.get(i));
            index++;
        }
        System.out.println(Reverse);

        LinkedList<String> clone=new LinkedList<>(linked_List);            // cloning the linked list
        System.out.println(clone);
    }
}
