public class WithDoubleSpeed extends WeaponDecorator{
  public WithDoubleSpeed(WeaponBehavior weapon){
    super(weapon);
  }
  @Override
  public int useWeapon(){
    System.out.println("Using " + this + " with double speed - two times!");
    return super.useWeapon() +  super.useWeapon();
  }
  public String toString(){
    return super.toString();
  }
}
