package List;

/**
 * @author xlm
 * @date 2022/4/6 21:36
 */
public class LinkedList {
    static class Node {
        int data;
        int np;
        String names;
        Node next;

        public Node(int data, String names, int np) {
            this.data = data;
            this.np = np;
            this.names = names;
            this.next = null;
        }
    }

    private Node first;
    private Node last;

    public boolean isEmpty() {
        return first == null;
    }

    public void print() {
        Node current = this.first;
        while (current != null) {
            System.out.println("[" + current.data + " " + current.names + " " + current.np + "]");
            current = current.next;
        }
        System.out.println();
    }

    public void insert(int data, String names, int np) {
        Node newNode = new Node(data, names, np);
        if (this.isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        System.out.println(linkedList.isEmpty());

        for (int i = 0; i < 6; i++) {
            linkedList.insert(i, String.valueOf(i), i);
        }
        linkedList.print();
        System.out.println("hello");
    }
}
