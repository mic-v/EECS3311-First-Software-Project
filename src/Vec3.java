/**
 * Integer Vector with three components
 * Used to compartmentalize data that required three integer components such as
 * a position in a 3D space, or the colour of an object
 */
public class Vec3 {
    public int x,y,z;
    public Vec3() {
        x = y = z = 0;
    }

    public Vec3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
