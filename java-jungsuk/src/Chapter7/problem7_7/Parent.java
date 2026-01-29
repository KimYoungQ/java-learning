package Chapter7.problem7_7;

public class Parent {
    private int x = 100;

    public Parent() {
        this(200);
    }

    public Parent(int x) {
        this.x = x;
    }

    int getX() {
        return  x;
    }
}
