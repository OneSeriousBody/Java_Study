package FactoryPattern.FactoryMethod;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */
public class BMWFactory implements CarFactory{
  @Override
  public Car createCar() {
    return new BMW();
  }
}
