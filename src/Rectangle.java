import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Rectangle shape
 * Inherits from Shape and functions from Shape are implemented for a rectangle
 * but also has its own distinct data such as height and width
 */
public class Rectangle extends Shape {

    private int height,width;

    /**
     * Creates Rectangle with random height,width, colour, and position
     */
    public Rectangle() {
        this.height = ThreadLocalRandom.current().nextInt(20,60);
        this.width = this.height + ThreadLocalRandom.current().nextInt(40,80);

        this.pos = new Point(20,20);
        this.color = new Vec3(ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255));

    }

    /**
     * Creates a Rectangle with a specified width, and height
     * @param width
     * @param height
     */
    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;

        this.pos = new Point(20,20);
        this.color = new Vec3(ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255));

    }

    /**
     * Returns height of rectangle
     * @return height
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * Returns width of rectangle
     * @return width
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * Returns area of rectangle
     * @return area
     */
    @Override
    public double getArea() {
        return this.width * this.height;
    }

    /**
     * Sets position of the rectangle in the interface
     * @param pos
     */
    @Override
    public void setPosition(Point pos) {
        this.pos = pos;
    }

    /**
     * Customized drawing of Rectangle in the interface
     * @param g
     */
    @Override
    public void draw(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(color.x,color.y,color.z));
        g2d.fillRect(this.pos.x, this.pos.y, this.width, this.height);
    }

}
