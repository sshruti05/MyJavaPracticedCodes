package logicbuilding.linkedList;

public class LinkedListRunner {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        traverseNodes(head);
        traverseNodes(reverseNodes(head));
    }

    public static void traverseNodes(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static Node reverseNodes(Node head) {
        Node current = head;
        Node prev = null;
        Node next = null;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}