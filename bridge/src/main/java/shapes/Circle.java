package shapes;

import colors.IColor;
import sizes.ISize;
import visitors.IVisitor;

public class Circle extends Shape {

    public Circle(ISize size, IColor color) {
        super(size, color);
    }

    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visitCircle(this);
    }

}
