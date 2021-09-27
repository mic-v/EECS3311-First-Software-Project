import java.util.Random;

public class Vec4 {
    private final Random rand;
    private int x,y,z,w;
    public Vec4() {
        rand = new Random();
        x = y = z = rand.next(250);
    }
}
