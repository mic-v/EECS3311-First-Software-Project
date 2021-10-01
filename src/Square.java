import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Square extends Shape {

    private int height, width;
    public Square() {
        this.height = this.width = ThreadLocalRandom.current().nextInt(30,60);
        this.pos = new Point(20,20);
        this.color = new Vec3(ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255));
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public void setSize(Point size) {
        this.width = size.x;
        this.height = size.y;
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
