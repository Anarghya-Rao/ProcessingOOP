import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int FRAME_HEIGHT = 700;
    public static final int FRAME_WIDTH = 1000;
    public static final int DIAMETER = 10;
    public static final int SPEED = 1;

    Circle circle1;
    Circle circle2;
    Circle circle3;
    Circle circle4;

    public static void main(String[] args){
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(FRAME_WIDTH, FRAME_HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();

        circle1 = new Circle(this, 0, FRAME_HEIGHT / 5, DIAMETER, SPEED);
        circle2 = new Circle(this, 0, (FRAME_HEIGHT / 5) * 2, DIAMETER, 2 * SPEED);
        circle3 = new Circle(this, 0, (FRAME_HEIGHT / 5) * 3, DIAMETER, 3 * SPEED);
        circle4 = new Circle(this, 0, (FRAME_HEIGHT / 5) * 4, DIAMETER, 4 * SPEED);
    }

    @Override
    public void draw() {
        drawCircles();
    }

    private void drawCircles() {
        circle1.draw();
        circle2.draw();
        circle3.draw();
        circle4.draw();

        circle1.updateX();
        circle2.updateX();
        circle3.updateX();
        circle4.updateX();
    }

}
