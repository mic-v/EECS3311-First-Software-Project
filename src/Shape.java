import java.awt.*;

/**
 * Abstraction of a "Shape" object
 * Basic abstraction of a what a shape is including its positioning, colour, etc.
 *
 */
public abstract class Shape implements Comparable<Shape>{

    protected Vec3 color;
    protected Point pos;

    public abstract double getArea();
    public Point getPosition() {
        return this.pos;
    }

    public abstract void setPosition(Point pos);

    public abstract void draw(Graphics g);

    @Override
    public int compareTo(Shape otherShape)
    {
        if(this.getArea() < otherShape.getArea())
            return -1;
        else if(this.getArea() > otherShape.getArea())
            return 1;
        else
            return 0;
    }



}
