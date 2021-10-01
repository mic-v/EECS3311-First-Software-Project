import javax.swing.*;
import java.awt.*;

public abstract class Shape implements Comparable<Shape>{

    protected Vec3 color;
    protected Point pos;

    public abstract double getArea();
    public Point getPos() {
        return this.pos;
    }

    public abstract void setSize(Point size);
    public abstract void setPosition(Point pos);

    public abstract void draw(Graphics g);

    @Override
    public int compareTo(Shape otherShape)
    {
        //System.out.println("Shape1 area:" + this.getArea() + " Shape2 area: " + otherShape.getArea());
        if(this.getArea() < otherShape.getArea())
            return -1;
        else if(this.getArea() > otherShape.getArea())
            return 1;
        else
            return 0;
    }



}
