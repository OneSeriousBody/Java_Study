package SingletonPattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */

/**
 * 枚举型
 * 使用枚举实现单例模式 优点:实现简单、调用效率高，枚举本身就是单例，由jvm从根本上提供保障!避免通过反射和反序列化的漏洞， 缺点没有延迟加载。
 */
public class Demo4 {

  private static Demo4 getInstance(){
    return Demo.INSTANCE.getInstance();
  }

  //定义枚举
  private static enum Demo{
    INSTANCE;

    private Demo4 demo4;

    private Demo(){
      demo4 = new Demo4();
    }

    public Demo4 getInstance(){
      return demo4;
    }
  }

  public static void main(String[] args) {
    Demo4 instance1 = Demo4.getInstance();
    Demo4 instance2 = Demo4.getInstance();
    System.out.println(instance1 == instance2);
  }

}
