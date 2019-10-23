package Train;

import comp127graphics.Rectangle;

import java.awt.*;

public class BoxCar extends TrainCar {

    public BoxCar(Color color) {
        super(color);
        drawBoxcar(0, getCarHeight(), color);
    }

    /* Draws a boxcar in the specified color */
    private void drawBoxcar(double x, double y, Color color) {
//        drawCarFrame(x, y, color);
        double xRight = x + CONNECTOR + CAR_WIDTH / 2;
//        double xLeft = xRight - DOOR_WIDTH;
//        double yDoor = y - CAR_BASELINE - DOOR_HEIGHT;
//        canvas.add(new Rectangle(xLeft, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
//        canvas.add(new Rectangle(xRight, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
    }
}
