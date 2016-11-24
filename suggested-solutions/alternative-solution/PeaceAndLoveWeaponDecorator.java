public class PeaceAndLoveWeaponDecorator extends WeaponDecorator{
  public PeaceAndLoveWeaponDecorator(WeaponBehavior weapon){
    super(weapon);
    System.out.println("Created a " + getWrappedList());
  }

  @Override
  public int useWeapon(){
      int damage;
      if(! isAlreadyWrapped()){
        System.out.println("Peace, Dude! Healing you with love!");
        damage =  0 - super.useWeapon();
      }else{
        //System.out.println("Already wrapped inside a PeaceAndLove, using weapon as is");
        damage = super.useWeapon();
      }
      return damage;
  }

  private boolean isAlreadyWrapped(){
    WeaponBehavior w = super.decoratedWeapon;
    while(! (w instanceof PeaceAndLoveWeaponDecorator)){
      if(w instanceof WeaponDecorator){
        w = ((WeaponDecorator)w).decoratedWeapon;
      }else{
        break;
      }
    }
    return w instanceof PeaceAndLoveWeaponDecorator;
  }

  @Override
  public String toString(){
    return super.toString() + " of class " + this.getClass().getName();
  }
}
