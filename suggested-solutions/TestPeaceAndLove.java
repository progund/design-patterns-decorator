public class TestPeaceAndLove{
  public static void main(String[] args){
    WeaponBehavior sword = new Sword();
    int damage;
    System.out.println("Normal use of " + sword);
    damage=sword.useWeapon();
    System.out.println("Damage from " + sword + " " + damage);
    System.out.println("============");

    System.out.println("Player gets Peace and Love spell!");
    sword = new PeaceAndLoveWeaponDecorator(sword);
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

    System.out.println("Player gets a Peace and Love spell!");
    sword = new PeaceAndLoveWeaponDecorator(sword);
    damage=sword.useWeapon();
    System.out.println("Damage from " + sword + " " + damage);
    System.out.println("============");

    System.out.println("Testing: Applying spell again (second time)");
    sword = new PeaceAndLoveWeaponDecorator(sword);
    damage=sword.useWeapon();
    System.out.println("Damage from " + sword + " " + damage);
    System.out.println("============");

    System.out.println("Testing: Applying spell again (third time)");
    sword = new PeaceAndLoveWeaponDecorator(sword);
    damage=sword.useWeapon();
    System.out.println("Damage from " + sword + " " + damage);
    System.out.println("============");

    System.out.println("Testing: Applying spell again (fourth time)");
    sword = new PeaceAndLoveWeaponDecorator(sword);
    damage=sword.useWeapon();
    System.out.println("Damage from " + sword + " " + damage);
    System.out.println("============");
  }
}
