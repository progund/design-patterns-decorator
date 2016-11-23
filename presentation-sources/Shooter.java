public class Shooter extends WeaponDecorator{
  private int rounds = 6;
  public Shooter(WeaponBehavior weapon){
    super(weapon);
  }
  @Override
  public int useWeapon(){
    if(rounds-- > 0){
      System.out.println("Bam!");
      return super.useWeapon();
    }else{
      // Note! There is no way to reload! ;-)
      // How do we solve that?
      // Without refactoring, we'd have to use "new"
      // i.e. create a new shooter and re-assign
      System.out.println("No more rounds! Need to reload");
      return 0;
    }
  }
}
