package StrategyPattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */
public class PayStrategyA extends PayStrategy {

  @Override
  void algorithmInterface() {
    System.out.println("微信支付");
  }

}
