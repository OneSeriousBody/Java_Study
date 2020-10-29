package StrategyPattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */
public class PayStrategyB extends PayStrategy {

  @Override
  void algorithmInterface() {
    System.out.println("支付宝支付");
  }

}
