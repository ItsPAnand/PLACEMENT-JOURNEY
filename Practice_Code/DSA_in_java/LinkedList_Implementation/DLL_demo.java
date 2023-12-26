package DSA_in_java.LinkedList_Implementation;


public class DLL_demo {
    public static void main(String[] args) throws Exception {
        doublyLinkesList<Integer> list=new doublyLinkesList<>();
        list.inserAtBeginning(87);
        list.inserAtBeginning(73);
        list.inserAtBeginning(69);
        list.inserAtBeginning(27);
        // list.display();
        // list.displayReverse();
        list.insertAtPosition(10, 2);
        // list.display();
        list.insertAtPosition(90, 5);
        list.display();
        // list.displayReverse();
        list.deleteAtPosition(0);
        list.deleteAtPosition(4);
        list.display();
        list.displayReverse();
    }
}