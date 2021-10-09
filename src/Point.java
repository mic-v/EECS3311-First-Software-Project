/**
 * Integer Vector with two components
 * Used to compartmentalize data that required two integer components such as
 * a position in a 2D space
 */

public class Point {
    public int x,y;
    public Point() {
        x = y = 0;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}