import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 */
public class Square extends Shape {

    private int length;
    public Square() {
        this.length = ThreadLocalRandom.current().nextInt(40,80);
        this.pos = new Point(20,20);
        this.color = new Vec3(ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255));
    }

    public Square(int length) {
        this.length = length;
        this.pos = new Point(20,20);
        this.color = new Vec3(ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255));
    }


    public int getLength() {
        return this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
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
        g2d.fillRect(this.pos.x, this.pos.y, this.length, this.length);
    }

}
