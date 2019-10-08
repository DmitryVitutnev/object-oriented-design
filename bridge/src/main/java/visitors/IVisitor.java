package visitors;

import shapes.Circle;
import shapes.Square;
import shapes.Triangle;

public interface IVisitor<T> {

    T visitCircle(Circle c);

    T visitSquare(Square s);

    T visitTriangle(Triangle t);


}
