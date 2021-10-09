import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    @Test
    public void RectangleAreaTest() {
        Rectangle rect = new Rectangle(5,10);
        assertEquals(rect.getArea(), 50);

        assertEquals(rect.getWidth(), 5);
        assertEquals(rect.getHeight(), 10);
    }


    @Test
    public void CircleAreaTest() {
        Circle circle = new Circle(10);
        assertEquals( (int) circle.getArea(), 314);

        assertEquals( circle.getRadius(), 10);
    }


    @Test
    public void SquareAreaTest() {
        Square square = new Square(10);
        assertEquals(square.getArea(), 100);

        assertEquals( square.getLength(), 10);
    }

}