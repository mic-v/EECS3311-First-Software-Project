import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;
/**
 * Square shape
 * Inherits from Shape and functions from Shape are implemented for a square
 * but also has its own distinct data such as length
 */
public class Square extends Shape {

    private int length;

    /**
     * Creates Square with random length, colour, and position
     */
    public Square() {
        this.length = ThreadLocalRandom.current().nextInt(40,80);
        this.pos = new Point(20,20);
        this.color = new Vec3(ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255));
    }

    /**
     * Creates Square with specified length
     * @param length
     */
    public Square(int length) {
        this.length = length;
        this.pos = new Point(20,20);
        this.color = new Vec3(ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255));
    }


    /**
     * Returns length of square
     * @return length
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Returns area of square
     * @return area of square
     */
    @Override
    public double getArea() {
        return this.length * this.length;
    }

    /**
     * Sets position of shape in the interface
     * @param pos
     */
    @Override
    public void setPosition(Point pos) {
        this.pos = pos;
    }

    /**
     * Customized drawing of shape in the interface
     */
    @Override
    public void draw(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(color.x,color.y,color.z));
        g2d.fillRect(this.pos.x, this.pos.y, this.length, this.length);
    }

}
