public class PeaceAndLoveWeaponDecorator extends WeaponDecorator{

  public PeaceAndLoveWeaponDecorator(WeaponBehavior weapon){
    super(weapon);
  }
  @Override
  public int useWeapon(){
    System.out.println("Peace, Dude! Healing you with love!");
    // Jozsef's idea (quite smarter than Rikard's stupid idea)
    return 0 - Math.abs(super.useWeapon());
  }
  @Override
  public String toString(){
    return super.toString();
  }

}
