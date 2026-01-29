package Chapter7.problem7_7;

public class Child extends Parent {
    private int x = 3000;

    public Child() {
        this(1000);
    }

    public Child(int x) {
        this.x = x;
    }
}
