package Stack;

/**
 * @author xlm
 * @date 2022/4/7 20:55
 */
public class Stack01 {

  static class StackByArray {

    private int[] stack;
    private int top;

    public StackByArray(int size) {
      stack = new int[size];
      top = -1;
    }

    public boolean push(int data) {
      if (top >= this.stack.length) {
        System.out.println("栈已经满了");
        return false;
      } else {
        stack[++top] = data;
        return true;
      }
    }

    public boolean empty() {
      return this.top == -1;
    }

    public int pop() {
      if (top == -1) {
        System.out.println("栈已经空了");
        return -1;
      } else {
        return stack[top--];
      }
    }

    public static void main(String[] args) {
      StackByArray stack = new StackByArray(5);
      System.out.println(stack.empty());

      for (int i = 0; i < 5; i++) {
        stack.push(i);
      }

      for (int i = 0; i < 5; i++) {
        System.out.println(stack.pop());
      }

    }
  }
}
