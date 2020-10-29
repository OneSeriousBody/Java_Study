package TemplatePattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */

/**
 * 模板方法模式：定义一个操作中的算法骨架（父类），而将一些步骤延迟到子类中。 模板方法使得子类
 * 可以不改变一个算法的结构来重定义该算法的
 */
public class Client {

  public static void main(String[] args) {
    RestaurantTemplate restaurantLobster = new RestaurantLobsterImpl();
    restaurantLobster.process();
    System.out.println("========================");
    RestaurantTemplate restaurantGinseng = new RestaurantGinsengImpl();
    restaurantGinseng.process();
  }

}
