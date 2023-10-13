import processing.core.PApplet;

class Circle{
    private int diameter = 0;
    private int centerX = 0;
    private int centerY = 0;
    private int updateValueX = 0;
    private PApplet parentPApplet;

    Circle(PApplet parentPApplet, int centerX, int centerY, int diameter, int updateValueX){
        this.parentPApplet = parentPApplet;
        this.centerX = centerX;
        this.centerY = centerY;
        this.diameter = diameter;
        this.updateValueX = updateValueX;
    }

    public void draw(){
        parentPApplet.ellipse(centerX, centerY, diameter, diameter);
    }

    public void updateX(){
        centerX += updateValueX;
    }

}
