package linkedlists;


public class Main {
    public static void main(String[] args) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(24);


        //singly linked list
//        LL list = new LL();
//        list.insertFirst(12);
//        list.insertLast(10);
//        list.insert(8,1);
//
//
//        list.display();
//
//        int val = list.deleteFirst();
//        System.out.println("Deleted First : " + val);
//
//
//        int val2 = list.deleteLast();
//        System.out.println("Deleted Last : " + val2);
//
//        list.display();
//
//        list.insertFirst(12);
//        list.insertLast(10);
//        list.display();
//        int val3 = list.delete(0);
//
//        list.deleteLast();
//        list.deleteFirst();
//
//        list.display();



        //doubly linked list
//        DLL doublyList = new DLL();
//        doublyList.insertFirst(2);
//        doublyList.insertFirst(1);
//        doublyList.insertLast(3);
//        doublyList.insertLast(4);
//        doublyList.insert(5, 2);
//        doublyList.display();


        //circular linked list
//        CircularLinkedLists cll = new CircularLinkedLists();
//        cll.insert(23);
//        cll.insert(32);
//        cll.insert(424);
//        cll.insert(333);
//        cll.delete(32);
//        cll.delete(23);
//        cll.display();




        LL list = new LL();
        list.insertFirst(12);
        list.insertLast(10);
        list.insert(8,1);
        list.display();
        list.insertUsingRecursion(100, 2);
        list.display();
    }
}
