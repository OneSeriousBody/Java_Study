import java.util.Arrays;

/**
 * @Author CoderWZT
 * @Create on 2020/10/30.
 */

/**
 * 归并排序
 */
public class MergeSort {

  public static void merge(int[] arr){
    if(arr == null || arr.length == 0) return;
    int[] tmp = new int[arr.length];
    mergeSort(arr,0,arr.length - 1,tmp);
  }

  //归并
  public static void mergeSort(int[] arr,int first,int last,int[] tmp){
    if(first < last){
      int mid = (first + last) / 2;
      mergeSort(arr,first,mid,tmp); //递归左边元素
      mergeSort(arr,mid + 1,last,tmp);  //递归右边元素
      mergeArray(arr,first,mid,last,tmp); // 再将二个有序数列合并
    }
  }

  //合并
  public static void mergeArray(int[] arr,int first,int mid,int last,int[] tmp){
    if(first < last){
      int i = first,j = mid + 1; // 第一组起点是i,第二组起点是j
      int m = mid,n = last; //第一组终点是m,第二组终点是n
      int k = 0; // k指向tmp数组
      while(i <= m && j <= n){
        if(arr[i] <= arr[j]){
          tmp[k++] = arr[i++];
        }else {
          tmp[k++] = arr[j++];
        }
      }

      while(i <= m){
        tmp[k++] = arr[i++];
      }

      while(j <= n){
        tmp[k++] = arr[j++];
      }

      for(i=0;i<k;i++){
        arr[first + i] = tmp[i];
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[]{10,7,5,11,12,35,3,15};
    merge(arr);
    System.out.println(Arrays.toString(arr));
  }

}
