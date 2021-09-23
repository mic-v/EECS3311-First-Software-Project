

public class ShapeFactory {
    public Shape getShape(String shapeType)
    {
        if(shapeType == "Rectangle")
            return new Rectangle();
        else if(shapeType == "Square")
            return new Square();
        else if(shapeType == "Circle")
            return new Circle();
        else
            return null;
    }
}
