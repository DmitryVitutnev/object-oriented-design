package shapes;

import colors.IColor;
import sizes.ISize;
import visitors.IVisitor;

public class Triangle extends Shape {
    public Triangle(ISize size, IColor color) {
        super(size, color);
    }

    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visitTriangle(this);
    }

    public String getDescription() {
        return size.getSize() + " " + color.getColor() + " " + "Triangle";
    }
}
