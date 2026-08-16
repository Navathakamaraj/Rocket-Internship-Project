//Find the cycle in Linked list

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main2 {

    public static boolean cycle(Node head) {

        Node s = head;
        Node f = head;

        while (f != null && f.next != null) {

            s = s.next;
            f = f.next.next;

            if (s == f) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head.next.next.next.next = head.next;

        System.out.println(cycle(head));
    }
}