public abstract class WeaponDecorator implements WeaponBehavior{
  private final WeaponBehavior decoratedWeapon;
  public WeaponDecorator(WeaponBehavior weapon){
    this.decoratedWeapon = weapon;
  }
  @Override
  public int useWeapon(){
    // Forward the call to the decorated weapon
    return decoratedWeapon.useWeapon();
  }
  @Override
  public String toString(){
    return decoratedWeapon.toString();
  }
}
