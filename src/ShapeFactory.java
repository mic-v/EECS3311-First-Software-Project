/**
 * Manages the creation of shapes through ShapeFactory
 * Based on the Factory design pattern, returns a shape depending on the input
 */
public class ShapeFactory implements Factory<Shape> {
    @Override
    public Shape getObject(String type) {
        if(type == "Rectangle")
            return new Rectangle();
        else if(type == "Square")
            return new Square();
        else if(type == "Circle")
            return new Circle();
        else
            return null;
    }

    private static final ShapeFactory instance = new ShapeFactory();

    public static ShapeFactory getInstance() {
        return instance;
    }

    private ShapeFactory() {
    }
}
