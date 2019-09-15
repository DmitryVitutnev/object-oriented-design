package shapes;

import colors.IColor;
import sizes.ISize;

public class Circle extends Shape {

    public Circle(ISize size, IColor color) {
        super(size, color);
    }

    public String getDescription() {
        return size.getSize() + " " + color.getColor() + " " + "Circle";
    }
}
