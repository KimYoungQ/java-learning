package Chapter6.problem2;

public class Exercise6_2 {
    public static void main(String[] args) {
        StudaCard card1 = new StudaCard(3, false);
        StudaCard card2 = new StudaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}
