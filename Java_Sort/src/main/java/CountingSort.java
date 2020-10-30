/**
 * @Author CoderWZT
 * @Create on 2020/10/30.
 */

import java.util.Arrays;

/**
 * 计数排序
 */
public class CountingSort {

  public static void main(String[] args) {
    int[] arr = new int[]{10,7,5,11,12,35,3,15};
    int[] sortedArray=countSort(arr);
    System.out.println(Arrays.toString(sortedArray));
  }

  private static int[] countSort(int[] array) {
    //得到数组的最大值和最小值，并推算出差值d
    int max=array[0];
    int min=array[0];
    for(int i=1;i<array.length;i++){
      if(array[i]>max){
        max=array[i];
      }
      if(array[i]<min){
        min=array[i];
      }
    }
    int d=max-min;
    //创建统计数组并统计对应的元素个数
    int[] countArray=new int[d+1];
    for(int i=0;i<array.length;i++){
      countArray[array[i]-min]++;
    }
    //统计数组做变形，后边的元素等于前面的元素之和
    for(int i=1;i<countArray.length;i++){
      countArray[i]+=countArray[i-1];
    }
    //倒序遍历原始数组，从统计数组中找到正确的位置，输出到结果数组
    int[] sortedArray=new int[array.length];
    for(int i=array.length-1;i>=0;i--){
      //给sortedArray的当前位置赋值
      sortedArray[countArray[array[i]-min]-1]=array[i];
      //给countArray的位置的值--
      countArray[array[i]-min]--;
    }
    return sortedArray;
  }

}
