import colors.Blue;
import colors.Green;
import colors.Red;
import org.junit.Assert;
import org.junit.Test;
import shapes.Circle;
import shapes.Shape;
import shapes.Square;
import shapes.Triangle;
import sizes.Big;
import sizes.Small;

public class ShapeTest {

    @Test
    public void CircleTest(){
        Shape circle = new Circle(new Big(), new Red());
        String result = circle.getDescription();
        String expected = "Big Red Circle";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void SquareTest(){
        Shape circle = new Square(new Small(), new Green());
        String result = circle.getDescription();
        String expected = "Small Green Square";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void TriangleTest(){
        Shape circle = new Triangle(new Big(), new Blue());
        String result = circle.getDescription();
        String expected = "Big Blue Triangle";
        Assert.assertEquals(expected, result);
    }

}
