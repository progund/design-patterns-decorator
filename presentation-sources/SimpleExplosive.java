public class SimpleExplosive implements WeaponBehavior{
  public SimpleExplosive(){
    
  }
  @Override
  public int useWeapon(){
    System.out.println("Ka-boom");
    return 25;
  }
}
