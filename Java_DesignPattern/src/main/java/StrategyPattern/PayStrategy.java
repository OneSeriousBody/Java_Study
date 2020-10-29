package StrategyPattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */
//策略模式 定义抽象方法 所有支持公共接口
abstract class PayStrategy {

  // 支付逻辑方法
  abstract void algorithmInterface();
}
