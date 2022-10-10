package Stack;

/**
 * @author xlm
 * @date 2022/4/7 21:23
 */
public class Stack02 {

  class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  private Node first;
  private Node last;

  public boolean empty() {
    return first == null;
  }

  public int push(int data) {
    Node newNode = new Node(data);
    if (empty()) {
      first = newNode;
      last = newNode;
    } else {
      last.next = newNode;
      last = newNode;
    }
    return data;
  }

  public int pop() {
    if (empty()) {
      System.out.println("empty");
      return -1;
    } else {
      Node node = first;
      while (node.next != last) {
        node = node.next;
      }
      node.next = last.next;
      last = node;
      return last.data;
    }
  }
}
