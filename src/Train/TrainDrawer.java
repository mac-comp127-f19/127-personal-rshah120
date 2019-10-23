//package Train;
//
//import comp127graphics.CanvasWindow;
//import comp127graphics.Rectangle;
//
//import java.awt.*;
//
//
///*
// * File: Train.TrainDrawer.java
// * --------------------
// * This program draws a three-car train consisting on an engine,
// * a boxcar, and a caboose.  This implementation of the program,
// * however, is incomplete, and contains only the methods given
// * in the text.
// */
//
//public class TrainDrawer {
//
//    public static final int SCALE = 1;
//
//	/* Private constants */
//
//    /* Dimensions of the frame of a train car */
//    public static final double CAR_WIDTH = 75*SCALE;
//    public static final double CAR_HEIGHT = 36*SCALE;
//
//    /* Distance from the bottom of a train car to the track below it */
//    public static final double CAR_BASELINE = 10*SCALE;
//
//    /* Width of the connector, which overlaps between successive cars */
//    public static final double CONNECTOR = 6*SCALE;
//
//    /* Radius of the wheels on each car */
//    public static final double WHEEL_RADIUS = 8*SCALE;
//
//    /* Distance from the edge of the frame to the center of the wheel */
//    public static final double WHEEL_INSET = 16*SCALE;
//
//    /* Dimensions of the cab on the engine */
//    public static final double CAB_WIDTH = 35*SCALE;
//    public static final double CAB_HEIGHT = 8*SCALE;
//
//    /* Dimensions of the smokestack and its distance from the front */
//    public static final double SMOKESTACK_WIDTH = 8*SCALE;
//    public static final double SMOKESTACK_HEIGHT = 8*SCALE;
//    public static final double SMOKESTACK_INSET = 8*SCALE;
//
//    /* Dimensions of the door panels on the boxcar */
//    public static final double DOOR_WIDTH = 18*SCALE;
//    public static final double DOOR_HEIGHT = 32*SCALE;
//
//    /* Dimensions of the cupola (the rectangular piece on the top of the caboose) */
//    public static final double CUPOLA_WIDTH = 35*SCALE;
//    public static final double CUPOLA_HEIGHT = 8*SCALE;
//
//    // Instance variable for the canvas that you can add shapes to in order to have them be drawn.
//    private CanvasWindow canvas;
//
//
//    public static void main(String[] args) {
//        Train.TrainDrawer drawer = new Train.TrainDrawer();
//    }
//
//    public TrainDrawer(){
//        //Create a window and canvas to draw on
//        canvas = new CanvasWindow("Train", 800, 500);
//
//        double trainWidth = 3 * CAR_WIDTH + 4 * CONNECTOR;
//        double x = (canvas.getWidth() - trainWidth) / 2;
//        double y = canvas.getHeight();
//        double dx = CAR_WIDTH + CONNECTOR;
//        Engine engine = new Engine(Color.BLACK);
//        canvas.add(engine, 0, engine.getCarHeight());
//        drawBoxcar(x + dx, y, Color.GREEN);
//        drawCaboose(x + 2 * dx, y);
//    }
//
//    /**
//     * Draws an engine whose origin is at (x, y)
//     * @param x The x origin
//     * @param y The y origin
//     */
//    private void drawEngine(double x, double y) {
//        drawCarFrame(x, y, Color.BLACK);
//        drawSmokestack(x, y);
//        drawEngineCab(x, y);
//        drawCowcatcher(x, y);
//    }
//
//
//
//
//
//
//
//
//
//    /* Draws a red caboose */
//    private void drawCaboose(double x, double y) {
//        drawCarFrame(x,y, Color.RED);
//        drawCupola(x,y);
//    }
//
//    private void drawCupola(double x, double y) {
//        double xLeft = x + CONNECTOR+CAR_WIDTH/2-CUPOLA_WIDTH/2;
//        double yTop = y - CAR_BASELINE - CAR_HEIGHT - CUPOLA_HEIGHT;
//        Rectangle cupola = new Rectangle(xLeft, yTop, CUPOLA_WIDTH, CUPOLA_HEIGHT);
//        cupola.setFillColor(Color.RED);
//        cupola.setFilled(true);
//        canvas.add(cupola);
//    }
//
//
//
//
//
//
//
////}