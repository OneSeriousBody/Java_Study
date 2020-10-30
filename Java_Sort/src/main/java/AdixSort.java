/**
 * @Author CoderWZT
 * @Create on 2020/10/30.
 */

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 基数排序
 */
public class AdixSort {

  public static void sort(int arr[]){
    //获取数组中的最大值
    int max = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      if(max < arr[i]) max = arr[i];
    }

    //统计最大数的位数
    int count = 0;
    while(max > 0){
      max /= 10;
      count++;
    }

    List<ArrayList> queue = new ArrayList<>();//多维数组
    for (int i=0;i<10;i++){ //创建10个list（每一位有从0到9，一共10个数，每个list数组用来存放每次迭代中，0-9 每个数组中需要装入的数）
      ArrayList q = new ArrayList();
      queue.add(q);//由于数字的特殊性，大数组中要添加10个小数组；
    }

    //开始比较
    for(int i=0;i<count;i++){
      for(int j=0;j<arr.length;j++){
        //获取每次要比较的那个数字；不管是哪个位置上的；
        //获取对应位的值（i为0是个位，1是十位，2是百位）；
        int x = arr[j] % (int)Math.pow(10,i+1) / (int)Math.pow(10,i);
        // queue.get(x) 是在返回第0的这个行的list上面的数，然后再 add(arr[j]) 是把当前的这个数添加到末尾去
        queue.get(x).add(arr[j]);
      }

      //排好序的数据放入数组
      int times = 0;
      for(int j=0;j<10;j++){
        while(queue.get(j).size() > 0){
          ArrayList arrayList = queue.get(j);
          arr[times++] = (int) arrayList.get(0);
          arrayList.remove(0);
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
