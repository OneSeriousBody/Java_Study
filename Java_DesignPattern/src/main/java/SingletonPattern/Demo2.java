package SingletonPattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */

/**
 * 懒汉式
 * 初始化时,不会初始化该对象,真正需要使用的时候才会创建该对象,具备懒加载功能。
 */
public class Demo2 {

  private static Demo2 demo2;

  private Demo2(){}

  private static Demo2 getInstance(){
    if(demo2 == null){
      demo2 = new Demo2();
    }
    return demo2;
  }

  public static void main(String[] args) {
    Demo2 instance1 = Demo2.getInstance();
    Demo2 instance2 = Demo2.getInstance();
    System.out.println(instance1 == instance2);
  }

}
