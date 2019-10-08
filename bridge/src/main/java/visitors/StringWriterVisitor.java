package visitors;

import shapes.Circle;
import shapes.Square;
import shapes.Triangle;

public class StringWriterVisitor implements IVisitor<String> {
    public String visitCircle(Circle c) {
        return c.getSize() + " " + c.getColor() + " " + "Circle";
    }

    public String visitSquare(Square s) {
        return s.getSize() + " " + s.getColor() + " " + "Square";
    }

    public String visitTriangle(Triangle t) {
        return t.getSize() + " " + t.getColor() + " " + "Triangle";
    }
}
