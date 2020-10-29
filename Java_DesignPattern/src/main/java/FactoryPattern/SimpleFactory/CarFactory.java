package FactoryPattern.SimpleFactory;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */

/**
 * 简单工厂
 * 简单工厂模式相当于是一个工厂中有各种产品，创建在一个类中，客户无需知道具体产品的名称，只
 * 需要知道产品类所对应的参数即可。但是工厂的职责过重，而且当类型过多时不利于系统的扩展维护。
 */
public class CarFactory {

  public static Car createCar(String name){
    if("".equals(name)) return null;
    if(name.equals("baoma")){
      return new Bmw();
    }
    if(name.equals("AoDi")){
      return new AoDi();
    }
    return null;
  }

  public static void main(String[] args) {
    Car baoma = CarFactory.createCar("baoma");
    Car aoDi = CarFactory.createCar("AoDi");
    baoma.run();
    aoDi.run();
  }

}
