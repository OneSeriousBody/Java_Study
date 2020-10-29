package ObserverPattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */
//具体观察者
public class ObserverImpl implements Observer {

  private int myState;

  @Override
  public void update(int state) {
    myState = state;
    System.out.println("收到消息，myState的值变为：" + myState);
  }

  public int getMyState(){
    return myState;
  }

}
