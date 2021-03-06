/**
 * @Author CoderWZT
 * @Create on 2020/10/30.
 */
import java.util.Arrays;

/**
 * 希尔排序
 */
public class ShellSort {

  public static void sort(int[] arr){
    //step:步长
    for (int step = arr.length / 2; step > 0; step /= 2) {
      //对一个步长区间进行比较 [step,arr.length)
      for (int i = step; i < arr.length; i++) {
        int value = arr[i];
        int j;
        //对步长区间中具体的元素进行比较
        for (j = i - step; j >= 0; j -= step) {
          if(arr[j] > value){
            //j为左区间的取值，j+step为右区间与左区间的对应值。
            arr[j + step] = arr[j];
          }else {
            break;
          }
        }
        //此时step为一个负数，[j + step]为左区间上的初始交换值
        arr[j + step] = value;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[]{10,7,5,11,12,35,3,15};
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }

}
