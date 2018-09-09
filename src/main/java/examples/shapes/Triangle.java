package examples.shapes;

public class Triangle {
    Point a = new Point(1,1);
    Point b = new Point(2,3);
    Point c = new Point(3,1);

    public Triangle(Point a, Point b, Point c)throws ShapeException{

        this.a = a.copy();
        this.b = b.copy();
        this.c = c.copy();
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


    public double getArea() throws ShapeException{
        Line ab = new Line(getA(), getB());
        Line ac = new Line(getA(), getC());
        Line bc = new Line(getB(), getC());

        double abLength = ab.computeLength();
        double acLength = ac.computeLength();
        double bcLength = bc.computeLength();

        //p is half of the perimeter
        double p = (abLength + acLength + bcLength)/2;
        double area = Math.sqrt(p*(p-acLength)*(p-abLength)*(p-bcLength));
        return area;
    }

    public void move(double x, double y) throws ShapeException{
        a.moveX(x);
        a.moveY(y);

        b.moveX(x);
        b.moveY(y);

        c.moveX(x);
        c.moveY(y);
    }

}
