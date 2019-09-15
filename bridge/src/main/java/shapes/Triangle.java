package shapes;

import colors.IColor;
import sizes.ISize;

public class Triangle extends Shape {
    public Triangle(ISize size, IColor color) {
        super(size, color);
    }

    public String getDescription() {
        return size.getSize() + " " + color.getColor() + " " + "Triangle";
    }
}
