import javax.swing.*;

public class Rectangle extends JComponent implements Shape {

    private int height,width;

    public Rectangle() {
        this.height = 5;
        this.width = 7;
    }
    @Override
    public int getArea() {
        return 0;
    }

}
