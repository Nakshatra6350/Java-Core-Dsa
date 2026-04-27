package linkedlists;


public class Main {
    public static void main(String[] args) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(24);

        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(7);
//        list.insertFirst(8);
        list.insertFirst(12);
        list.insertLast(10);
        list.insert(8,1);


        list.display();

        int val = list.deleteFirst();
        System.out.println("Deleted First : " + val);


        int val2 = list.deleteLast();
        System.out.println("Deleted Last : " + val2);

        list.display();

        list.insertFirst(12);
        list.insertLast(10);
        list.display();
        int val3 = list.delete(0);

        list.deleteLast();
        list.deleteFirst();

        list.display();
    }
}
