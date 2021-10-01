import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class Circle extends Shape {

    private int radius;

    public Circle() {
        //this.radius = ThreadLocalRandom.current().nextInt(30,60);
        this.radius = 40;
        this.pos = new Point(20,20);
        this.color = new Vec3(ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255),
                ThreadLocalRandom.current().nextInt(0,255));
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void setSize(Point size) {
        this.radius = size.x;
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
        g2d.fillOval(this.pos.x, this.pos.y, this.radius, this.radius);
    }


}
