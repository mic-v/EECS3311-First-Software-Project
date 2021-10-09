/**
 * Manages the creation of shapes through ShapeFactory
 * Based on the Factory design pattern, returns a shape depending on the input
 */
public class ShapeFactory implements Factory<Shape> {
    /**
     * Returns a shape based on input, null if shape type is incorrect
     * @param type
     * @return Shape object
     */
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

    /**
     * Singleton design pattern
     */
    private static final ShapeFactory instance = new ShapeFactory();

    /**
     * Returns single instance of ShapeFactory
     * @return
     */
    public static ShapeFactory getInstance() {
        return instance;
    }

    private ShapeFactory() {
    }
}
