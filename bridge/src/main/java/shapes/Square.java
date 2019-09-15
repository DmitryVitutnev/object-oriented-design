package shapes;

import colors.IColor;
import sizes.ISize;

public class Square extends Shape {
    public Square(ISize size, IColor color) {
        super(size, color);
    }

    public String getDescription() {
        return size.getSize() + " " + color.getColor() + " " + "Square";
    }
}
