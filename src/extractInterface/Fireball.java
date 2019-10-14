package extractInterface;

public class Fireball implements Attack {

    private int fireballDamage;
    private int fireballManaRequired;

    public Fireball(int fireballDamage, int fireballManaRequired) {
        this.fireballDamage = fireballDamage;
        this.fireballManaRequired = fireballManaRequired;
    }

    public int getFireballDamage() {
        return fireballDamage;
    }

    public int getFireballManaRequired() {
        return fireballManaRequired;
    }

    @Override
    public String attack(GameCharacter attacker, GameCharacter target) {
        if (attacker.useMana(fireballManaRequired)) {
                target.takeDamage(fireballDamage);
                return attacker.getName() + " hit " + target.getName() + " with a fireball for "
                        + fireballDamage + " points of damage";
        }
        else {
            return attacker.getName() + " did not have enough mana for a fireball attack";
        }
    }
}

