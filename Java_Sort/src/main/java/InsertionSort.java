/**
 * @Author CoderWZT
 * @Create on 2020/10/30.
 */

import java.util.Arrays;

/**
 * 插入排队
 */
public class InsertionSort {

  public static void sort(int[] arr){
    int i,j,temp;
    for(i=1;i<arr.length;i++){
      temp = arr[i];
      for(j=i-1;j>=0;j--){
        if(temp<arr[j]){
          arr[j+1]=arr[j];
        }else {
          break;
        }
      }
      arr[j+1]=temp;
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[]{10,7,5,11,12,35,3,15};
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }

}
