import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 */
public class Rectangle extends Shape {

    private int height,width;

    public Rectangle() {
        this.height = ThreadLocalRandom.current().nextInt(20,60);
        this.width = this.height + ThreadLocalRandom.current().nextInt(40,80);

        this.pos = new Point(20,20);
        this.color = new Vec3(ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255));

    }

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;

        this.pos = new Point(20,20);
        this.color = new Vec3(ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255));

    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public void setPosition(Point pos) {
        this.pos = pos;
    }

    @Override
    public void draw(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(color.x,color.y,color.z));
        g2d.fillRect(this.pos.x, this.pos.y, this.width, this.height);
    }

}
