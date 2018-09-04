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
    public void testNegativeNumber() throws Exception {
        Point bottomLeft = new Point(-1,0);
        Point bottomRight = new Point(0,0);
        Point topLeft = new Point(1,1);
        Point topRight = new Point(0,1);

       try {
           Rectangle myRectangle = new Rectangle(bottomLeft, bottomRight, topLeft, topRight);
           assertEquals(true, false);
       }catch(ShapeException e){
           //expected an exception
       }
       
    }

}