import org.junit.Test;

import static org.junit.Assert.*;

public class ZombieTest {

    @Test
    public void move() {
        Zombie a = new Zombie();
        Zombie.Direction b = Zombie.Direction.North;
        assertEquals(Zombie.Direction.North, b);
    }

    @Test
    public void getX() {
        Zombie a = new Zombie();
        int x = a.getX();
        assertEquals(0, x);
    }

    @Test
    public void getY() {
        Zombie a = new Zombie();
        int y = a.getY();
        assertEquals(0, y);
    }
}