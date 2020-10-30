/**
 * @Author CoderWZT
 * @Create on 2020/10/30.
 */

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectionSort {

  public static void sort(int[] arr){
    for(int i=0;i<arr.length - 1;i++){
      int k = i;
      //选最小的记录下标
      for (int j=i + 1;j < arr.length;j++){
        if(arr[j] < arr[k]) k = j;
      }
      //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
      if(i != k){
        int temp = arr[k];
        arr[k] = arr[i];
        arr[i] = temp;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[]{10,7,5,11,12,35,3,15};
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }

}
