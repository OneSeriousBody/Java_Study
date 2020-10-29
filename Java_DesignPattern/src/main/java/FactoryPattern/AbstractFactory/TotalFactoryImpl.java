package FactoryPattern.AbstractFactory;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */

/**
 * 抽象工厂模式
 * 抽象工厂简单地说是工厂的工厂，抽象工厂可以创建具体工厂，由具体工厂来产生具体产品
 */
public class TotalFactoryImpl implements TotalFactory {

  @Override
  public Car createCar() {
    return new CarA();
  }

  @Override
  public Engine createEngine() {
    return new EngineB();
  }

  public static void main(String[] args) {
    TotalFactoryImpl totalFactory = new TotalFactoryImpl();
    Car car = totalFactory.createCar();
    car.run();
    Engine engine = totalFactory.createEngine();
    engine.run();
  }

}
