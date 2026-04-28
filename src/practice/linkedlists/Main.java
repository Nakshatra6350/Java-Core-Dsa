package practice.linkedlists;

import practice.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertLast(1);
        ll.insertLast(3);
        ll.insertLast(5);
        ll.display();
//        ll.removeDuplicates();


        LinkedList ll2 = new LinkedList();
        ll2.insertLast(1);
        ll2.insertLast(2);
        ll2.insertLast(9);
        ll2.insertLast(14);
        ll2.display();

        LinkedList ans = ll.mergeTwoLinkedLists(ll, ll2);
        ans.display();
    }
}
