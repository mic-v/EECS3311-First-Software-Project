import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {
    @Test
    public void shapeFactoryTest()
    {
        ShapeFactory instance = ShapeFactory.getInstance();
        assertEquals(instance.getObject("Rect"), null);

        assertEquals(instance.getObject("Rectangle").getClass().getName(), "Rectangle");
        assertEquals(instance.getObject("Circle").getClass().getName(), "Circle");
        assertEquals(instance.getObject("Square").getClass().getName(), "Square");
    }
}