public abstract class WeaponDecorator implements WeaponBehavior{
  final WeaponBehavior decoratedWeapon;

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

  String getWrappedList(){
    StringBuilder result = new StringBuilder(this.getClass().getName());
    WeaponBehavior w = decoratedWeapon;
    result.append(" containing a ").append(w.getClass().getName());
    while(w instanceof WeaponDecorator){
      w = ((WeaponDecorator)w).decoratedWeapon;
      result.append(" containing a ").append(w.getClass().getName());
    }
    return result.toString();
  }
}
