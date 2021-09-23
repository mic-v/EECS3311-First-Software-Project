import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisplayPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(131, 21, 1));
        g2d.fillRect(250, 195, 90, 60);
    }
    public static void main(String[] args) {

        ShapeFactory shapeMaker = new ShapeFactory();
        Shape test = shapeMaker.getShape("Rectangle");

        DisplayPanel rects = new DisplayPanel();
        JFrame frame = new JFrame("Display shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
