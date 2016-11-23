public class Explosive extends WeaponDecorator{
  public Explosive(WeaponBehavior weapon){
    super(weapon);
  }
  @Override
  public int useWeapon(){
    System.out.println("Boooom!");
    return super.useWeapon() + 10;
  }
}
