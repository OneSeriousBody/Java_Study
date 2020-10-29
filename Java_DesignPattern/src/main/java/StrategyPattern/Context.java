package StrategyPattern;


/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */
// 使用上下文维护算法策略
public class Context {

  PayStrategy payStrategy;

  public Context(PayStrategy payStrategy){
    this.payStrategy = payStrategy;
  }

  public void algorithmInterface() {
    payStrategy.algorithmInterface();
  }

}
