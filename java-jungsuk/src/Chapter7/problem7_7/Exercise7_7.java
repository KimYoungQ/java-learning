package Chapter7.problem7_7;

public class Exercise7_7 {
    /**
     * 부모 생성자 호출 후 자식 생성자 호출
     * Child() -> Child(intx) -> Parent() -> Parent(intx) -> Object()
     * 200
     */
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("x=" + c.getX());
    }
}
