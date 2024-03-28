public class Tank {
    private int x;
    private int y;
    private int fuel = 100;
    private int dir;
    private int n;
    static final String MODEL = "T34";
    static int ntanks;

    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = xz;
        this.y = y;
        this.fuel = fuel;
        n = ++ntanks;
    }

    public void goForward(int i) {
        if (i > fuel) {
            i = fuel;
        }
        if (i < 0 && -i > fuel) {
            i = -fuel;
        }
        if (dir == 0) x += i;
        fuel -= Math.abs(i);
    }

    public void printPosition() {
        System.out.println("The Tank " + MODEL + "-" + n + " is at " + x + ", " + y + " now.");
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}