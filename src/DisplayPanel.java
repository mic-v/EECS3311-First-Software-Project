import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.*;

/**
 * DisplayShapes program
 * @author Michael Victorino
 * @author 216864621
 */
public class DisplayPanel extends JPanel {

    private static JFrame frame;
    private static JPanel buttonPanel;
    private static ArrayList<Shape> shapes = new ArrayList<>();
    private static DisplayPanel drawPanel;

    public static void main(String[] args) {
        // Setup the screen interface for the user
        frame = new JFrame("Display shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        buttonPanel = new JPanel();
        buttonPanel.setMaximumSize(new Dimension(600,100));
        JButton loadButton = new JButton();
        loadButton.setText("Load Shapes");
        JButton sortButton = new JButton();
        sortButton.setText("Sort Shapes");
        buttonPanel.add(loadButton);
        buttonPanel.add(sortButton);

        /**
         * Load Shapes button
         * Generates a panel for the JFrame that will draw the shapes, generate the shapes
         * from generateShapes(), and then the drawing panel gets added into JFrame
         * Redraw the frame to force draw the shapes into screen using the shapes implemented draw function
         */
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

        /**
         * Sort shapes button
         * Clears the drawing panel of the shapes, sorts the shapes
         * and finally redraws the shapes with the sorted list
         */
        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                SortingTechnique.sort(shapes);

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

    /**
     * Draws the shapes in the interface
     * Iterates from the list of shapes from ArrayList shapes and
     * calls their draw function
     * @param g
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        for(Shape shape : shapes)
        {
            shape.draw(g);
        }

    }

    /**
     * Generate shapes for the user
     * From a random generator, generates a type of shape and gets added into shapes
     * and then given a position based on current loop index
     */
    private static void generateShapes() {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        shapes.clear();
        Random rand = new Random();
        for(int i = 0; i < 6; i++) {
            int randNum = rand.nextInt(10);
            Shape temp;
            if(randNum < 3)
                temp = shapeFactory.getObject("Rectangle");
            else if(randNum < 6)
                temp = shapeFactory.getObject("Square");
            else
                temp = shapeFactory.getObject("Circle");
            temp.setPosition(new Point(i*80 + 10, i * 80));
            shapes.add(temp);
        }

    }

}
