package BuilderPattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */
public class ArmsBuilder implements PersonBuilder {
  private Arms arms;

  public ArmsBuilder() {
    arms = new Arms();
  }

  public void builderHelmetMurder() {
    arms.setHelmet("夺命头盔");
  }

  public void builderArmorMurder() {
    arms.setArmor("夺命铠甲");
  }

  public void builderWeaponMurder() {
    arms.setWeapon("夺命宝刀");
  }

  public void builderHelmetYanLong() {
    arms.setHelmet("炎龙头盔");
  }

  public void builderArmorYanLong() {
    arms.setArmor("炎龙铠甲");
  }

  public void builderWeaponYanLong() {
    arms.setWeapon("炎龙宝刀");
  }

  @Override
  public Arms BuilderArms() {
    return arms;
  }
}
