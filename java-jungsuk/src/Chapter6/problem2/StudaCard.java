package Chapter6.problem2;

public class StudaCard {
    private int num;
    private boolean isKwang;

    public StudaCard() {
        this.num = 1;
        this.isKwang = true;
    }

    public StudaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public int getNum() {
        return this.num;
    }

    public boolean isKwang() {
        return isKwang;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setKwang(boolean isKwang) {
        this.isKwang = isKwang;
    }

    public String info() {
        return num + (isKwang ? "K" : "");
    }
}
