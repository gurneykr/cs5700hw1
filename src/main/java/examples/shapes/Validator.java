package examples.shapes;

public class Validator {
    public static void validateDouble(double value, String errorMessage) throws ShapeException {
        if (Double.isInfinite(value) || Double.isNaN(value))
            throw new ShapeException(errorMessage);
    }

    public static void validatePositiveDouble(double value, String errorMessage) throws ShapeException {
        validateDouble(value, errorMessage);
        if (value<0)
            throw new ShapeException(errorMessage);
    }

    public static void validatePositivePoint(Point value, String errorMessage) throws ShapeException {
        validatePositiveDouble(value.getX(), errorMessage);
        validatePositiveDouble(value.getY(), errorMessage);
    }

    public static void validateRectangle(Point bottomLeft, Point bottomRight, Point topLeft, Point topRight) throws ShapeException {
        //check if points are not null
        if(bottomLeft == null  || bottomRight == null || topLeft == null || topRight == null ){
            throw new ShapeException("Invalid Rectangle, null points not allowed");
        }
        //validate if the points are postive
        validatePositivePoint(bottomLeft, "No negative points");
        validatePositivePoint(bottomRight, "No negative points");
        validatePositivePoint(topLeft, "No negative points");
        validatePositivePoint(topLeft, "No negative points");

        //check for right angles
        validateRightAngle(bottomLeft, bottomRight, topLeft, topRight);

    }

    public static void validateRightAngle(Point bottomLeft, Point bottomRight, Point topLeft, Point topRight) throws ShapeException {
        Line line1 = new Line(bottomLeft, bottomRight);
        Line line2 = new Line(topLeft, topRight);
        Line line3 = new Line(topLeft,  bottomLeft);
        Line line4 = new Line(topRight, bottomRight);

        double line1Length = line1.computeLength();
        double line2Length = line2.computeLength();
        double line3Length = line3.computeLength();
        double line4Length = line4.computeLength();

        if(line1Length != line2Length || line3Length != line4Length){
            throw new ShapeException("Invalid Rectangle, needs to have right angles.");
        }
    }
}
