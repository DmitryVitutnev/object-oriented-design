package shapes;

import colors.IColor;
import sizes.ISize;

public abstract class Shape {
    protected ISize size;
    protected IColor color;

    public Shape(ISize size, IColor color) {
        this.size = size;
        this.color = color;
    }

    public abstract String getDescription();

}
