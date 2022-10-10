package List;

import org.w3c.dom.Node;

/**
 * @author xlm
 * @date 2022/4/7 7:30
 */
public class Single {
  class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  class LinkedList {
    public Node first;
    public Node last;

    public boolean isEmpty() {
      return first == null;
    }

    /**
     * 拼接连个单链表
     *
     * @param head1
     * @param head2
     * @return
     */
    public LinkedList Concatenate(LinkedList head1, LinkedList head2) {
      LinkedList ptr;
      ptr = head1;
      while (ptr.last.next != null) {
        ptr.last = ptr.last.next;
      }
      ptr.last.next = head2.first;
      return head1;
    }

    /**
     * 向单链表插入数据 三种情况
     *
     * @param ptr
     */
    public void insert(Node ptr) {
      Node tmp;
      Node newNode;

      if (isEmpty()) {
        first = ptr;
        last = ptr;
      } else {
        if (ptr.next == first) {
          ptr.next = first;
          first = ptr;
        } else {
          if (ptr.next == null) {
            last.next = ptr;
            last = ptr;
          } else {
            newNode = first;
            tmp = first;
            while (ptr.next != newNode.next) {
              tmp = newNode;
              newNode = newNode.next;
            }
            tmp.next = ptr;
            ptr.next = newNode;
          }
        }
      }
    }

     public Node reverse(Node head) {
      if (head == null || head.next == null) {
        return head;
      }

      Node p1 = head;
      Node p2 = head.next;
      Node p3 = null;

      while (p2 != null) {
        p3 = p2.next;
        p2.next = p1;

        p1 = p2;
        p2 = p3;
      }

      head.next = null;
      head = p1;

      return head;
    }
  }
}
