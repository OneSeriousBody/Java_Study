package ObserverPattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */
//观察者的接口，用来存放观察者共有方法
public interface Observer {
  //观察者方法
  void update(int state);
}
