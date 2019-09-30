package activityStarterCode.objects;

public class DiceRoller {
    public static void main(String[] args) {
        Die myDice = new Die();
        for (int i = 1; i <= 10; i++) {
            myDice.roll();
            System.out.println("Roll " + i + " generated a " + myDice.toString());
        }
    }
}
