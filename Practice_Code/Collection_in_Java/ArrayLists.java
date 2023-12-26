package Collection_in_Java;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();  //Flexible  //any data types can be stored in same ArrayList
        
        list.add("Anand");                             //support redundancy or allows duplicate
        list.add("Sharath");
        list.add("Bharath");
        list.add("Akilesh");
        list.add("SakthiVel");
        list.add("SakthiVel");
        // int len=list.size();
        

        // list.sort(null);
        // System.out.println(len);

        // list.add("Vasnth");

        // list.remove(0);

        // list.set(0, "Anand");

        System.out.println(list);

        // for(String i:list)               //iterate using forEach loop
        //     System.out.println(i);

        // Iterator<String> i=list.iterator();    //iterating using Iterator object
        // System.out.println("Using iterator");
        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }

        // list.clear();
        // System.out.println(list);


        // ArrayList allType=new ArrayList();

        // allType.add("String");
        // allType.add(10);
        // allType.add('A');

        // System.out.println(allType);
    }
}
