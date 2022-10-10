package List;

import org.w3c.dom.Node;

/**
 * @author xlm
 * @date 2022/4/6 21:24
 */
public class NodeTest {
    int data;
    Node next;

    public NodeTest(int data) {
        this.data = data;
        this.next = null;
    }

    class LinkList {
        private Node first;
        private Node last;
    }

    class Node {
        String name;
        int no;
        int score;
        Node next;

        public Node(String name, int no, int score, Node next) {
            this.name = name;
            this.no = no;
            this.score = score;
            this.next = next;
        }

    }

}
