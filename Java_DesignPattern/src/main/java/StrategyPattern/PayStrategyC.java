package StrategyPattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */
public class PayStrategyC extends PayStrategy {

  @Override
  void algorithmInterface() {
    System.out.println("银联支付");
  }

}
