import java.util.Arrays;
import java.util.Queue;

/**
 * @Author CoderWZT
 * @Create on 2020/10/30.
 */

/**
 * 快速排序
 */
public class Quicksort {

  public static void quickSort(int[] arr,int low,int high){
    if(low < high){
      int index = getIndex(arr,low,high);
      quickSort(arr,low,index-1);
      quickSort(arr,index+1,high);
    }
  }

  public static int getIndex(int[] arr,int low,int high){
    int tmp = arr[low];
    while(low < high){
      while(low < high && arr[high] >= tmp){
        high--;
      }
      arr[low] = arr[high];
      while(low < high && arr[low] <= tmp){
        low++;
      }
      arr[high] = arr[low];
    }
    arr[low] = tmp;
    return low;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{10,7,5,11,12,35,3,15};
    quickSort(arr,0,arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

}
