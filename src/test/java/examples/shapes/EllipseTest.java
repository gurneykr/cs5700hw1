package examples.shapes;
import org.junit.Test;


public class EllipseTest {

    @Test
    public void testValidConstruction()throws ShapeException{
        Point center = new Point(5,5);

        Ellipse ellipse = new Ellipse(center, 7, 3);

       //assertEquals(5, ellipse.get, 0.00001);
    }
}
