import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.*;

public class DisplayPanel extends JPanel {

    private static JFrame frame;
    private static JLayeredPane mainPanel;
    private static ArrayList<Shape> shapes = new ArrayList<>();
    private static DisplayPanel drawPanel;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ShapeFactory shapeFactory = new ShapeFactory();
        for(Shape shape : shapes)
        {
            shape.draw(g);
        }

    }

    public static void main(String[] args) {
        //JFrame.setDefaultLookAndFeelDecorated(true);
        frame = new JFrame("Display shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setMaximumSize(new Dimension(600,100));
        JButton loadButton = new JButton();
        loadButton.setText("Load Shapes");
        JButton sortButton = new JButton();
        sortButton.setText("Sort Shapes");
        buttonPanel.add(loadButton);
        buttonPanel.add(sortButton);

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(drawPanel != null)
                    frame.remove(drawPanel);
                drawPanel = new DisplayPanel();
                generateShapes();
                frame.add(drawPanel);
                frame.repaint();
                frame.revalidate();
            }
        });

        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                for(int i = 0; i < shapes.size();i++)
                {
                    System.out.println("shapes : " + i + " " + shapes.get(i).getArea() + " " + shapes.get(i).getPos().x + " " + shapes.get(i).getPos().y);
                }
                SortingTechnique.bubbleSort(shapes);
                for(int i = 0; i < shapes.size();i++)
                {
                    System.out.println("shapes : " + shapes.get(i).getArea() + " " + shapes.get(i).getPos().x + " " + shapes.get(i).getPos().y);
                }
                if(drawPanel != null) {
                    frame.remove(drawPanel);
                }
                drawPanel = null;
                frame.revalidate();
                frame.repaint();
                drawPanel = new DisplayPanel();
                frame.add(drawPanel);
                frame.revalidate();
                frame.repaint();
            }
        });

        frame.add(buttonPanel);
        buttonPanel.setOpaque(true);
        frame.setVisible(true);
    }

    private static void generateShapes() {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapes.clear();

        Random rand = new Random();
        for(int i = 0; i < 6; i++) {
            int randNum = rand.nextInt(10);
            Shape temp;
            if(randNum < 3)
                temp = shapeFactory.getShape("Rectangle");
            else if(randNum < 6)
                temp = shapeFactory.getShape("Square");
            else
                temp = shapeFactory.getShape("Circle");
            temp.setPosition(new Point(i*50 + 10, i * 75));
            shapes.add(temp);
        }
    }

}
