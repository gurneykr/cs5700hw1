package examples.shapes;

public class Triangle {
    Point a = new Point(1,1);
    Point b = new Point(2,3);
    Point c = new Point(2,3);

    public Triangle(Point a, Point b, Point c)throws ShapeException{
        Validator.validatePositivePoint(a, "Bottom Left Invalid");
        Validator.validatePositivePoint(b, "Bottom Right Invalid");
        Validator.validatePositivePoint(c, "Top Right Invalid");

        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Point getA(){
        Point point = null;
        try {
            point = a.copy();
        }catch(ShapeException e){
            //According to Point this will never be thrown
        }
        return point;
    }

    public Point getB(){
        Point point = null;
        try {
            point = b.copy();
        }catch(ShapeException e){
            //According to Point this will never be thrown
        }
        return point;
    }

    public Point getC(){
        Point point = null;
        try {
            point = c.copy();
        }catch(ShapeException e){
            //According to Point this will never be thrown
        }
        return point;
    }


//    public double getArea() throws ShapeException{
//
//    }

    public void move(double x, double y) throws ShapeException{
        a.moveX(x);
        a.moveY(y);

        b.moveX(x);
        b.moveY(y);

        c.moveX(x);
        c.moveY(y);
    }

}
