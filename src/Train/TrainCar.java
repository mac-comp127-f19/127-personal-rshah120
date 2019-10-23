package Train;

import comp127graphics.Ellipse;
import comp127graphics.GraphicsGroup;
import comp127graphics.Line;
import comp127graphics.Rectangle;

import java.awt.*;


public abstract class TrainCar extends GraphicsGroup {
    public static final int SCALE = 1;
    public static final double WHEEL_RADIUS = 8*SCALE;
    public static final double CONNECTOR = 6*SCALE;
    public static final double WHEEL_INSET = 16*SCALE;
    public static final double CAR_WIDTH = 75*SCALE;
    public static final double CAR_HEIGHT = 36*SCALE;
    public static final double CAR_BASELINE = 10*SCALE;

    GraphicsGroup trainCar;

    public TrainCar(Color color){
        this.trainCar = new GraphicsGroup();
        drawCarFrame(0, getCarHeight(), color);


    }


    /* Draws a wheel centered at (x, y) */
    private void drawWheel(double x, double y) {
        double r = WHEEL_RADIUS;
        Ellipse wheel = new Ellipse(x - r, y - r, 2 * r, 2 * r);
        wheel.setFilled(true);
        wheel.setFillColor(Color.GRAY);
        this.trainCar.add(wheel);
    }
    /* Draws the common part of a train car */
    private void drawCarFrame(double x, double y, Color color) {
        double x0 = x + CONNECTOR;
        double y0 = y - CAR_BASELINE;
        double top = y0 - CAR_HEIGHT;
        this.trainCar.add(new Line(x, y0, x + CAR_WIDTH + 2 * CONNECTOR, y0));
        drawWheel(x0 + WHEEL_INSET, y - WHEEL_RADIUS);
        drawWheel(x0 + CAR_WIDTH - WHEEL_INSET, y - WHEEL_RADIUS);
        Rectangle r = new Rectangle(x0, top, CAR_WIDTH, CAR_HEIGHT);
        r.setFilled(true);
        r.setFillColor(color);
        this.trainCar.add(r);
    }

    public double getCarHeight(){
        return CAR_HEIGHT-CAR_BASELINE;
    }

}
