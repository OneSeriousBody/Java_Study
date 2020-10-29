package FactoryPattern.FactoryMethod;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */
public class AoDiFactory implements CarFactory {
  @Override
  public  Car createCar() {
    return new AoDi();
  }
}
