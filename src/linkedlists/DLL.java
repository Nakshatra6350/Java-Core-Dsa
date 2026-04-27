package linkedlists;

public class DLL {

    private Node head;
    private Node tail;

    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if(head != null){
            head.prev = node;
        }
        head = node;
        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val){
        Node node = new Node(val);

        if (head == null) {
            insertFirst(val);
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;

        for(int i = 1; i < index; i++){ // not starting with 0 because 0th index is Node temp = head
            temp = temp.next;
        }

        Node node  = new Node(val);
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        if (node.next != null) {
            node.next.prev = node;
        }

        size++;
    }

    public int deleteFirst() {
        if (head == null) {
            return -1;
        }

        int val = head.val;
        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }

        size--;
        return val;
    }

    public int deleteLast() {
        if (tail == null) {
            return -1;
        }

        int val = tail.val;

        if (tail.prev == null) {
            // only one element
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
        return val;
    }

    public int delete(int index) {

        if (index < 0 || index >= size) {
            return -1;
        }

        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        int val = temp.val;

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;
        return val;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }

        System.out.println("END");



        while (last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }

        System.out.println("START");
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
