package shapes;

import colors.IColor;
import sizes.ISize;
import visitors.IVisitor;

public abstract class Shape {
    protected ISize size;
    protected IColor color;

    public Shape(ISize size, IColor color) {
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size.getSize();
    }

    public String getColor() {
        return color.getColor();
    }

    public abstract<T> T accept(IVisitor<T> visitor);

}
