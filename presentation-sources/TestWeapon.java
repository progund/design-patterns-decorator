public class TestWeapon{
  public static void main(String[] args){
    WeaponBehavior sword = new Sword();
    int damage;
    System.out.println("Normal use of " + sword);
    damage=sword.useWeapon();
    System.out.println("Damage from " + sword + " " + damage);
    System.out.println("============");
    System.out.println("Player gets a double injury spell!");
    sword = new WithDoubleInjury(sword);
    System.out.println("Using the weapon with the spell in place");
    damage=sword.useWeapon();
    System.out.println("Damage from " + sword + " " + damage);
    System.out.println("============");
    System.out.println("Spell wears off. Back to normal.");
    sword = new Sword();
    System.out.println("Normal use of " + sword);
    damage=sword.useWeapon();
    System.out.println("Damage from " + sword + " " + damage);
    System.out.println("============");
    System.out.println("Player gets a double speed spell!");
    sword = new WithDoubleSpeed(sword);
    System.out.println("Using the weapon with the spell in place");
    damage=sword.useWeapon();
    System.out.println("Damage from " + sword + " " + damage);
    System.out.println("============");
    System.out.println("Spell wears off. Back to normal.");
    sword = new Sword();
    System.out.println("Normal use of " + sword);
    damage=sword.useWeapon();
    System.out.println("Damage from " + sword + " " + damage);
    System.out.println("============");
    System.out.println("Whoa! Double spell! Speed and injury!");
    sword = new WithDoubleSpeed(new WithDoubleInjury(sword));
    System.out.println("Using the weapon with the spell in place");
    damage=sword.useWeapon();
    System.out.println("Damage from " + sword + " " + damage);
    System.out.println("============");
    System.out.println("Whoa! Double spell! Speed and injury!");
    sword = new WithDoubleInjury(new WithDoubleSpeed(new Sword()));
    System.out.println("Using the weapon with the spell in place");
    damage=sword.useWeapon();
    System.out.println("Damage from " + sword + " " + damage);
    System.out.println("============");
    /*
    WeaponBehavior fireArm = new SimpleFireArm();
    WeaponBehavior sixShooter = new Shooter(new SimpleFireArm());
    WeaponBehavior grenade = new SimpleExplosive();
    WeaponBehavior rpg = new Shooter(new Explosive(new SimpleFireArm()));

    System.out.println("Firing fire arm");
    int damage = fireArm.useWeapon();
    System.out.println("Fire arm Damage: " + damage);
    System.out.println("===========");
    System.out.println("Firing six shooter "+
                       "(a Shooter composed with a SimpleFireArm)");
    damage = sixShooter.useWeapon();
    System.out.println("Six shooter Damage: " + damage);
    System.out.println("===========");
    System.out.println("Setting off grenade (a SimpleExplosive)");
    damage = grenade.useWeapon();
    System.out.println("Grenade Damage: " + damage);
    System.out.println("===========");
    System.out.println("Firing rpg (a Shooter composed with "+
                       "an Explosive composed with a "+
                       "SimpleFireArm)");
    damage = rpg.useWeapon();
    System.out.println("RPG Damage: " + damage);
    System.out.println("===============");
    System.out.println("Firing six more shots with the six shooter");
    for(int i = 0; i <6; i++){
      damage = sixShooter.useWeapon();
      System.out.println("Six shooter Damage: " + damage);
    }
    */
  }
}
