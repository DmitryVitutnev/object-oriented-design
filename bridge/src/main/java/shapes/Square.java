package shapes;

import colors.IColor;
import sizes.ISize;
import visitors.IVisitor;

public class Square extends Shape {
    public Square(ISize size, IColor color) {
        super(size, color);
    }

    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visitSquare(this);
    }

    public String getDescription() {
        return size.getSize() + " " + color.getColor() + " " + "Square";
    }
}
