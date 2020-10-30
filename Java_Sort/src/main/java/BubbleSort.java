/**
 * @Author CoderWZT
 * @Create on 2020/10/30.
 */

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

  public static void sort(int[] arr){
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[]{10,7,5,11,12,35,3,15};
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }

}
