package Tree;


import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author xlm
 * @date 2022/4/9 10:08
 */
public class Tree02 {
  static class TreeNode {
    int value;
    TreeNode left_node;
    TreeNode right_node;

    public TreeNode(int value) {
      this.value = value;
      this.left_node = null;
      this.right_node = null;
    }

    static class BinaryTree {

      public TreeNode rootNode;

      public BinaryTree(int[] data) {
        for (int i = 0; i < data.length; i++) {
          Add_Node_To_Tree(data[i]);
        }
        System.out.println("链表创建二叉树成功!");
      }

      void Add_Node_To_Tree(int value) {
        TreeNode currentNode = rootNode;
        if (currentNode == null) {
          rootNode = new TreeNode(value);
          return;
        }

        while (true) {
          if (value < currentNode.value) {
            if (currentNode.left_node == null) {
              currentNode.left_node = new TreeNode(value);
              return;
            } else {
              currentNode = currentNode.left_node;
            }
          }

          if (value > currentNode.value) {
            if (currentNode.right_node == null) {
              currentNode.right_node = new TreeNode(value);
              return;
            } else {
              currentNode = currentNode.right_node;
            }
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] data = {6, 3, 5, 9, 7, 8, 4, 2};
    TreeNode.BinaryTree binaryTree = new TreeNode.BinaryTree(data);
    //    前序遍历
    System.out.println("前序遍历");
    Tree02.before(binaryTree.rootNode);
    //    中序遍历
    System.out.println();
    System.out.println("中序遍历");
    Tree02.curry(binaryTree.rootNode);
    //    后序遍历
    System.out.println();
    System.out.println("后序遍历");
    Tree02.after(binaryTree.rootNode);
    System.out.println();

    boolean b = Tree02.find(2, binaryTree.rootNode);
    System.out.println(b);

    Tree02.bfsShow(binaryTree.rootNode);
  }

  /** 前序遍历 */
  public static void before(TreeNode rootNode) {
    if (rootNode == null) {
      return;
    }
    System.out.print("[" + rootNode.value + "]  ");
    before(rootNode.left_node);
    before(rootNode.right_node);
  }

  /** 中序遍历 */
  public static void curry(TreeNode rootNode) {
    if (rootNode == null) {
      return;
    }
    curry(rootNode.left_node);
    System.out.print("[" + rootNode.value + "]  ");
    curry(rootNode.right_node);
  }

  /** 后序遍历 */
  public static void after(TreeNode rootNode) {
    if (rootNode == null) {
      return;
    }
    after(rootNode.left_node);
    after(rootNode.right_node);
    System.out.print("[" + rootNode.value + "]  ");
  }

  public static boolean find(int value, TreeNode treeNode) {
    if (treeNode != null) {
      if (value > treeNode.value) {
        return find(value, treeNode.right_node);
      }
      if (value < treeNode.value) {
        return find(value, treeNode.left_node);
      }
      return true;
    }
    return false;
  }

  public static void bfsShow(TreeNode treeNode) {
    if (treeNode != null) {
      Queue<TreeNode> arrayQueue = new ArrayDeque<TreeNode>();
      arrayQueue.add(treeNode);

      while (!arrayQueue.isEmpty()) {
        TreeNode node = arrayQueue.poll();
        System.out.println(node.value);

        if (node.left_node != null) {
          arrayQueue.add(node.left_node);
        }

        if (node.right_node != null) {
          arrayQueue.add(node.right_node);
        }
      }
    }
  }
}
