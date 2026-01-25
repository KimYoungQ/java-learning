package Chapter6.problem3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
    private String name; // 이름
    private int ban; // 반
    private int no; // 번호
    private int kor; // 국어점수
    private int eng; // 영어점수
    private int math; // 수학점수

    public Student() {
        this("", 0, 0, 0, 0, 0);
    }

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTotal() {
        return this.kor + this.eng + this.math;
    }

    public float getAverage() {
        float avg = ((float)this.kor + this.eng + this.math) / 3;
        BigDecimal bd = new BigDecimal(Float.toString(avg));
        bd = bd.setScale(1, RoundingMode.HALF_UP); // 소수점 둘째 자리 반올림
        return bd.floatValue();
    }

    public String info() {
        return this.name + "," + this.ban + "," + this.no + "," + this.kor + "," + this.math + "," + this.eng + "," + getTotal() + "," + getAverage();
    }
}


