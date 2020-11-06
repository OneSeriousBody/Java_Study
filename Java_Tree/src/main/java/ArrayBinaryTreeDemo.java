/**
 * @Author CoderWZT
 * @Create on 2020/11/6.
 */

import java.util.Arrays;

/**
 * 给定一个数组，进行二叉树的前序、中序、后序遍历，并输出结果
 */
public class ArrayBinaryTreeDemo {

  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6};
    Arrays.sort(arr);
    ArrayBinaryTree tree = new ArrayBinaryTree(arr);
    tree.preOrder();
    tree.inOrder();
    tree.postOrder();
  }

}

class ArrayBinaryTree{

  private int[] arr;

  public ArrayBinaryTree(int[] arr){
    this.arr = arr;
  }

  //前序遍历
  public void preOrder(){
    if(arr == null || arr.length == 0){
      System.out.println("树为空");
      return ;
    }
    preOrder(0);
    System.out.println();
  }

  //中序遍历
  public void inOrder(){
    if(arr == null || arr.length == 0){
      System.out.println("树为空");
      return ;
    }
    inOrder(0);
    System.out.println();
  }

  //后序遍历
  public void postOrder(){
    if(arr == null || arr.length == 0){
      System.out.println("树为空");
      return ;
    }
    postOrder(0);
    System.out.println();
  }

  private void preOrder(int index){
    System.out.print(arr[index] + " ");
    int left = 2 * index + 1;
    if(left < arr.length) preOrder(left);
    int right = 2 * index + 2;
    if(right < arr.length) preOrder(right);
  }

  private void inOrder(int index){
    int left = 2 * index + 1;
    if(left < arr.length) inOrder(left);
    System.out.print(arr[index] + " ");
    int right = 2 * index + 2;
    if(right < arr.length) inOrder(right);
  }

  private void postOrder(int index){
    int left = 2 * index + 1;
    if(left < arr.length) postOrder(left);
    int right = 2 * index + 2;
    if(right < arr.length) postOrder(right);
    System.out.print(arr[index] + " ");
  }

}
