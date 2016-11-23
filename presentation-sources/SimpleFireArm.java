public class SimpleFireArm implements WeaponBehavior{
  public SimpleFireArm(){
    
  }
  @Override
  public int useWeapon(){
    System.out.println("Bang");
    return 20;
  }
}
