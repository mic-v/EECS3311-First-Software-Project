import javax.swing.*;

public class Square extends JComponent implements Shape {

    private int height, width;
    public Square() {
        this.height = this.width = 5;
    }

    @Override
    public int getArea() {
        return this.height * this.width;
    }

}
