package activityStarterCode.objects;
import java.util.Random;

public class Die {
    int internalState = -1;
    Random rand = new Random();
    public Die() {

    }

    public void roll() {
        internalState = rand.nextInt(5) + 1;
    }

    public Integer getValue() {
        return internalState;
    }

    public String toString() {
        switch (internalState) {
            case 1:
                return "one";
                //break;
            case 2:
                return "two";
            //break;
            case 3:
                return "three";
            //break;
            case 4:
                return "four";
            //break;
            case 5:
                return "five";
            //break;
            case 6:
                return "six";
            //break;
            default:
                return "Negative one";
        }
    }

}
