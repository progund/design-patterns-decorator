public class PeaceAndLoveWeaponDecorator extends WeaponDecorator{
  private boolean isSet;
  public PeaceAndLoveWeaponDecorator(WeaponBehavior weapon){
    super(weapon);
  }
  @Override
  public int useWeapon(){
    // Debug: to see how each wrapped object has its
    // own isSet, uncomment below:
    // System.out.println("My isSet variable is: " + isSet);
    if ( ! isSet ){
      System.out.println("Peace, Dude! Healing you with love!");
      isSet = true;
      return 0 - super.useWeapon();
    }else{
      return super.useWeapon();
    }
  }
  @Override
  public String toString(){
    return super.toString();
  }

}
