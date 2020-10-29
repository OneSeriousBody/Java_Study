package BuilderPattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */

/**
 * 建造者模式：是将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的方式进行创建。
 * 工厂类模式是提供的是创建单个类的产品
 * 而建造者模式则是将各种产品集中起来进行管理，用来具有不同的属性的产品
 */
public class PersonDirector {
  //组装
  public Arms constructPerson(PersonBuilder pb) {
    pb.builderHelmetYanLong();
    pb.builderArmorMurder();
    pb.builderWeaponMurder();
    return pb.BuilderArms();
  }

  //这里进行测试
  public static void main(String[] args) {
    PersonDirector pb = new PersonDirector();
    Arms arms = pb.constructPerson(new ArmsBuilder());
    System.out.println(arms.getHelmet());
    System.out.println(arms.getArmor());
    System.out.println(arms.getWeapon());
  }

}
