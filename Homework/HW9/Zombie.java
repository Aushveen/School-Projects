
//Q5 and Q6
public class Zombie {
    public enum Direction { North, East, South, West };
    private int x, y;
    public Zombie() { x = 0; y = 0; }
    public void move(Direction d) {
        switch (d) {
            case North: x += 1; break;
            case East: y += 1; break;
            case South: x -= 1; break;
            case West: y -= 1; break;
        }
    }
    static void g(int x, Zombie z) {
        x = 5;
        z.move(Zombie.Direction.North);
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public static void main(String[] args){
        int a = 0;
        Zombie z = new Zombie();
        g(a, z);
        System.out.println(a);
        System.out.println(z.getX());
        // 0, and then 1 is outputted because the method only moves x up by 1, and the value a doesn't change
    }

}


