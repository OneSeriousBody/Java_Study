package ObserverPattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */

/**
 * 观察者模式，是一种行为性模型，又叫发布-订阅模式，他定义对象之间一种一对多的依赖关系，
 * 使得当一个对象改变状态，则所有依赖于它的对象都会得到通知并自动更新。
 */
public class Client {

  public static void main(String[] args) {
    // 目标对象
    RealObserver subject = new RealObserver();
    // 创建多个观察者
    ObserverImpl obs1 = new ObserverImpl();
    ObserverImpl obs2 = new ObserverImpl();
    ObserverImpl obs3 = new ObserverImpl();
    // 注册到观察队列中
    subject.registerObserver(obs1);
    subject.registerObserver(obs2);
    subject.registerObserver(obs3);
    // 改变State状态
    subject.setState(300);
    System.out.println("obs1观察者的MyState状态值为："+obs1.getMyState());
    System.out.println("obs2观察者的MyState状态值为："+obs2.getMyState());
    System.out.println("obs3观察者的MyState状态值为："+obs3.getMyState());
    // 改变State状态
    subject.setState(400);
    System.out.println("obs1观察者的MyState状态值为："+obs1.getMyState());
    System.out.println("obs2观察者的MyState状态值为："+obs2.getMyState());
    System.out.println("obs3观察者的MyState状态值为："+obs3.getMyState());
  }

}
