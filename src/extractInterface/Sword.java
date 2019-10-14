package extractInterface;

import java.util.Random;

public class Sword implements Attack {

    private int swordMinDamage;
    private int swordMaxDamage;

    private static final Random rand = new Random();

    public Sword(int swordMinDamage, int swordMaxDamage) {
        this.swordMinDamage = swordMinDamage;
        this.swordMaxDamage = swordMaxDamage;
    }

    public int getSwordMinDamage() {
        return swordMinDamage;
    }

    public int getSwordMaxDamage() {
        return swordMaxDamage;
    }

    @Override
    public String attack(GameCharacter attacker, GameCharacter target) {
        int damage = rand.nextInt(swordMaxDamage - swordMinDamage + 1) + swordMinDamage;
        target.takeDamage(damage);
        return attacker.getName() + " struck " + target.getName() + " with a sword for "
                + damage + " points of damage";
    }
}
