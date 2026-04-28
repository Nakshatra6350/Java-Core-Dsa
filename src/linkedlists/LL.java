package linkedlists;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val){


        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);

        Node temp = head;

        while (temp.next != null){ // use this only if no tail is present in node, means tail is unknown
            temp = temp.next;
        }

        temp.next = node;
        tail = node;
        size += 1;
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

        Node node  = new Node(val); // or you can do Node node  = new Node(val, temp.next) which will act as next line
        node.next = temp.next;
        temp.next = node;

        size++;
    }

    public int deleteFirst(){
        int val = head.val;
        head = head.next;

        if(head == null){
            tail = null;
        }

        size--;

        return val;

    }

    public int deleteLast(){
        if(size <= 1){
            return  deleteFirst();
        }

        Node secondLast = get(size - 2);

        int val = tail.val;
        tail = secondLast;
        tail.next = null;

        size--;

        return val;
    }

    public int delete(int index){
        if(index == 0){
            return  deleteFirst();
        }

        if(index == size){
            return deleteLast();
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node presentAtIndex = get(index);
        int val = presentAtIndex.val;
        temp.next = presentAtIndex.next;
        presentAtIndex.next = null;

        size--;

        return val;

    }

    public void insertUsingRecursion(int val, int index){
        head = insertRecursion(val,index,head);
    }

    private Node insertRecursion(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRecursion(val, --index, node.next);

        return node;
    }


    private Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }

        return node;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    private class Node{
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }
    }

}
