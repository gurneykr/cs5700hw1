package examples.shapes;

public class Rectangle {
    private Point bottomLeft;
    private Point bottomRight;
    private Point topLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point bottomRight, Point topLeft, Point topRight) throws ShapeException{
        Validator.validatePositivePoint(bottomLeft, "Bottom Left Invalid");
        Validator.validatePositivePoint(bottomRight, "Bottom Right Invalid");
        Validator.validatePositivePoint(topRight, "Top Right Invalid");
        Validator.validatePositivePoint(topLeft, "Top Left Invalid");


        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
        this.topLeft = topLeft;
        this.topRight = topRight;
    }

    public Point getBottomLeft(){
        Point point = null;
        try {
            point = bottomLeft.copy();
        }catch(ShapeException e){
            //According to Point this will never be thrown
        }
        return point;
    }

    public Point getBottomRight(){
        Point point = null;
        try {
            point = bottomRight.copy();
        }catch(ShapeException e){
            //According to Point this will never be thrown
        }
        return point;
    }

    public Point getTopLeft(){
        Point point = null;
        try {
            point = topLeft.copy();
        }catch(ShapeException e){
            //According to Point this will never be thrown
        }
        return point;
    }

    public Point getTopRight(){
        Point point = null;
        try {
            point = topRight.copy();
        }catch(ShapeException e){
            //According to Point this will never be thrown
        }
        return point;
    }

}
