package sort;

/**
 * @author xinglimin
 * @version v1.0
 * @date 2022/09/14 22:05
 */
public class QuickSort {
    public static void sort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }


        int base = arr[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && arr[j] >= base) {
                  j--;
            }

            while (i < j && arr[i] <= base) {
                i++;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[left] = arr[i];
        arr[i] = base;

        sort(arr,left, i-1);
        sort(arr, i+1, right);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 2, 3, 1};
        sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
