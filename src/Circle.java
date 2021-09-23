import javax.swing.*;

public class Circle extends JComponent implements Shape {

    private int radius;

    public Circle() {
        this.radius = 5;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return 0;
    }

}
