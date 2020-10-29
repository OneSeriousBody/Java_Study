package TemplatePattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */
public class RestaurantLobsterImpl extends RestaurantTemplate {

  @Override
  void spotMenu() {
    System.out.println("尝尽人生百味");
  }

  @Override
  void payment() {
    System.out.println("吃不起");
  }

}
