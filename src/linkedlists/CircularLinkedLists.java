package linkedlists;

public class CircularLinkedLists {

    private Node head;
    private Node tail;

    public CircularLinkedLists(){
        head = null;
        tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        }

        tail.next = node;
        node.next = head;

        tail = node;
    }

    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.val + " -> ");
                node = node.next;
            }while (node != head);
        }

        System.out.print("HEAD");
    }

    public void delete(int val){
        Node node = head;
        if(head == null){
            return;
        }

        if(node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }

            node = node.next;
        }while (node != head);
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
