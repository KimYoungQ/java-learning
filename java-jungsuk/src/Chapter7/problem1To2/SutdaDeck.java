package Chapter7.problem1To2;

public class SutdaDeck {
    private final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    public SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            boolean isKwang = false;
            int num = i % 10 + 1;

            if (i < 10 && (i == 1 || i == 3 || i == 8)) {
                isKwang = true;
            }

            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int randomIndex = (int)(Math.random() * (cards.length));
            SutdaCard temp = null;
            temp = cards[i];
            cards[i] = cards[randomIndex];
            cards[randomIndex] = temp;
        }
    }

    public SutdaCard pick(int index) {
        if(index >= 0 && index <= CARD_NUM){
            return cards[index];
        } else {
            return null;
        }
    }

    public SutdaCard pick() {
        int randomIndex = (int)((Math.random() * (cards.length)));
        return cards[randomIndex];
    }
}
