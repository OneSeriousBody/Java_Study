package SingletonPattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */

/**
 * 双重检验锁
 * 双重检测锁方式 (因为JVM本质重排序的原因，可能会初始化多次，不推荐使用)
 */
public class Demo5 {

  private static Demo5 demo5;

  private Demo5(){}

  private static Demo5 getInstance(){
    if(demo5 == null){
      synchronized (Demo5.class){
        if(demo5 == null){
          demo5 = new Demo5();
        }
      }
    }
    return demo5;
  }

  public static void main(String[] args) {
    Demo5 instance1 = Demo5.getInstance();
    Demo5 instance2 = Demo5.getInstance();
    System.out.println(instance1 == instance2);
  }

}
