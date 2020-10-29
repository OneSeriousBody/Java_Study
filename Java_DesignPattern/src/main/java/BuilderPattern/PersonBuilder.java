package BuilderPattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */
public interface PersonBuilder {
  void builderHelmetMurder();

  void builderArmorMurder();

  void builderWeaponMurder();

  void builderHelmetYanLong();

  void builderArmorYanLong();

  void builderWeaponYanLong();

  Arms BuilderArms(); //组装

}
