package Tree;

/**
 * @author xlm
 * @date 2022/4/9 9:46
 */
public class Tree01 {

  public static void main(String[] args) {
      int i,level;
      int[] data = {6,3,5,9,7,8,4,2};
      int[] btree = new int[16];

    for (int datum : data) {
      System.out.print(datum);
    }

      for (int j = 0; j < 16; j++) {
       btree[j] = 0;
    }
    for (int j = 0; j < 8; j++) {
      for (level = 1; btree[level] != 0;) {
          if (data[j] > btree[level]) {
              level = level*2+1;
          }else {
              level = level*2;
          }
      }
      btree[level] = data[j];
    }

    for (int i1 : btree) {
      System.out.println(i1);
    }
  }
}
