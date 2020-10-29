package SingletonPattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */

/**
 * 静态内部类创建
 * 结合了懒汉式和饿汉式各自的优点，真正需要对象的时候才会加载，加载类是线程安全的。
 */
public class Demo3 {

  private Demo3(){}

  private static class SingletonClass{

    private static final Demo3 demo3 = new Demo3();

  }

  private static Demo3 getInstance(){
    return SingletonClass.demo3;
  }

  public static void main(String[] args) {
    Demo3 instance1 = Demo3.getInstance();
    Demo3 instance2 = Demo3.getInstance();
    System.out.println(instance1 == instance2);
  }

}
