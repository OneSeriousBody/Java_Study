package SingletonPattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */

/**
 * 饿汉式
 * 类初始化时,会立即加载该对象，线程天生安全,调用效率高。
 */
public class Demo1 {

  private static Demo1 demo1 = new Demo1();

  private Demo1(){}

  private static Demo1 getInstance(){
    return demo1;
  }

  public static void main(String[] args) {
    Demo1 instance1 = Demo1.getInstance();
    Demo1 instance2 = Demo1.getInstance();
    System.out.println(instance1 == instance2);
  }

}
