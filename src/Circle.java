import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Circle shape
 * Inherits from Shape and functions from Shape are implemented for a circle
 * but also has its own distinct data such as radius
 */
public class Circle extends Shape {

    private int radius;

    /**
     * Create Circle with random radius, colour, and position
     */
    public Circle() {
        this.radius = ThreadLocalRandom.current().nextInt(40,80);
        this.pos = new Point(20,20);
        this.color = new Vec3(ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255));
    }

    /**
     * Create Circle with specified radius
     * @param radius
     */
    public Circle(int radius) {
        this.radius = radius;
        this.pos = new Point(20,20);
        this.color = new Vec3(ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255));
    }

    /**
     * Return radius of circle
     * @return
     */
    public int getRadius() { return this.radius; }

    /**
     * Return area of Circle
     * @return area
     */
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    /**
     * Sets position of Circle in the interface
     * @param pos
     */
    @Override
    public void setPosition(Point pos) {
        this.pos = pos;
    }

    /**
     * Customized drawing of circle in the interface
     * @param g
     */
    @Override
    public void draw(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(color.x,color.y,color.z));
        g2d.fillOval(this.pos.x, this.pos.y, this.radius, this.radius);
    }


}
