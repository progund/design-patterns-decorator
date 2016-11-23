public class WithDoubleInjury extends WeaponDecorator{
  public WithDoubleInjury(WeaponBehavior weapon){
    super(weapon);
  }
  @Override
  public int useWeapon(){
    System.out.println("Using " + this + " with double injury");
    return 2 * super.useWeapon();
  }
  public String toString(){
    return super.toString();
  }
}
