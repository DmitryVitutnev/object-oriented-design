import colors.Blue;
import colors.Green;
import colors.Red;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import shapes.Circle;
import shapes.Shape;
import shapes.Square;
import shapes.Triangle;
import sizes.Big;
import sizes.Small;
import visitors.StringWriterVisitor;

public class ShapeTest {

    StringWriterVisitor visitor;

    @Before
    public void init() {
        visitor = new StringWriterVisitor();
    }

    @Test
    public void CircleTest(){
        Shape circle = new Circle(new Big(), new Red());
        String result = circle.accept(visitor);
        String expected = "Big Red Circle";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void SquareTest(){
        Shape square = new Square(new Small(), new Green());
        String result = square.accept(visitor);
        String expected = "Small Green Square";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void TriangleTest(){
        Shape triangle = new Triangle(new Big(), new Blue());
        String result = triangle.accept(visitor);
        String expected = "Big Blue Triangle";
        Assert.assertEquals(expected, result);
    }

}
