package examples.shapes;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testValidConstruction() throws Exception {
        Point bottomLeft = new Point(0,0);
        Point bottomRight = new Point(1,0);
        Point topLeft = new Point(0,1);
        Point topRight = new Point(1,1);

        Rectangle myRectangle = new Rectangle(bottomLeft, bottomRight, topLeft, topRight);

        assertEquals(0, myRectangle.getBottomLeft().getX(), 0.00001);
    }

    @Test
    public void testAllNegativePoints() throws Exception {
        Point p1 = new Point(-1,0);
        Point p2 = new Point(0,0);
        Point p3 = new Point(1,1);
        Point p4 = new Point(0,1);

        testNegativePoints(p1, p2, p3, p4);
        testNegativePoints(p2, p1, p3, p4);
        testNegativePoints(p3, p2, p1, p4);
        testNegativePoints(p4, p2, p3, p1);

    }

    public void testNegativePoints(Point p1, Point p2, Point p3, Point p4){
        try {
            new Rectangle(p1, p2, p3, p4);
            assertEquals(true, false);
        }catch(ShapeException e){
            //expected an exception
        }

    }

    @Test
    public void testGetPoints(){

        try {
            Point p1 = new Point(0, 0);
            Point p2 = new Point(1, 0);
            Point p3 = new Point(1, 1);
            Point p4 = new Point(0, 1);

            Rectangle myRectangle = new Rectangle(p1, p2, p3, p4);
            Point bottomLeft = myRectangle.getBottomLeft();
            Point bottomRight = myRectangle.getBottomRight();
            Point topRight = myRectangle.getTopRight();
            Point topLeft = myRectangle.getTopLeft();

            assertEquals(bottomRight.getX(), 1, 0.00001);
            assertEquals(bottomRight.getY(), 0.0, 0.00001);

            assertEquals(bottomLeft.getX(), 0, 0.00001);
            assertEquals(bottomLeft.getY(), 0.0, 0.00001);

            assertEquals(topLeft.getX(), 1, 0.00001);
            assertEquals(topLeft.getY(), 1, 0.00001);

            assertEquals(topRight.getX(), 0, 0.00001);
            assertEquals(topRight.getY(), 1, 0.00001);

        }catch (ShapeException e){
            assertEquals(true, false);
        }
    }

    @Test
    public void testWidthHeightArea(){
        try {
            Point p1 = new Point(0, 0);
            Point p2 = new Point(5, 0);
            Point p3 = new Point(0, 2);
            Point p4 = new Point(5, 2);

            Rectangle myRectangle = new Rectangle(p1, p2, p3, p4);
            double width = myRectangle.getWidth();
            double height = myRectangle.getHeight();
            double area = myRectangle.getArea();

            assertEquals(5,width,0.000001);
            assertEquals(2,height,0.000001);
            assertEquals(10,area,0.000001);


        }catch(ShapeException e){
            //expected an exception
        }
    }

}