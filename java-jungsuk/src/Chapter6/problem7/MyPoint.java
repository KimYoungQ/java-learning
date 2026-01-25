package Chapter6.problem7;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDistance(int x1, int y1) {
        int x_dt = x1 - this.x;
        int y_dt = y1 - this.y;

        return Math.sqrt(x_dt * x_dt + y_dt * y_dt);
    }
}
