package TemplatePattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */
public class RestaurantGinsengImpl extends RestaurantTemplate {

  @Override
  void spotMenu() {
    System.out.println("点山珍海味");
  }

  @Override
  void payment() {
    System.out.println("天价");
  }

}
