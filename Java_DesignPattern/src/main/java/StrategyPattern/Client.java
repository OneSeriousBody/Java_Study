package StrategyPattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */

/**
 * 策略模式
 * 定义了一系列的算法 或 逻辑 或 相同意义的操作，并将每一个算法、逻辑、操作封装起来，而且使它们还可以相互替换。
 * （其实策略模式Java中用的非常非常广泛）
 * 简化 if...else 所带来的复杂和难以维护。
 */
public class Client {

  public static void main(String[] args) {
    Context context;
    context = new Context(new PayStrategyA());
    context.algorithmInterface();
    context = new Context(new PayStrategyB());
    context.algorithmInterface();
    context = new Context(new PayStrategyC());
    context.algorithmInterface();
  }

}
