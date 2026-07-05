package logicbuilding.linkedList;

public class LinkedListRunner {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        reverse(head);
//        traverseNode(head);
    }

    private static void traverseNode(Node head) {
        Node current = head;
        while(current != null) {
            System.out.println(current.getData());
            current = current.next;
        }
    }

    private static void reverse(Node head){
        Node current = head;
        Node prev = null;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            System.out.println(current.getData());
            prev = current;
            current = next;
            System.out.println(current.getData());

        }
    }
}
