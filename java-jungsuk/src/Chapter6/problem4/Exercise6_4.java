package Chapter6.problem4;

import Chapter6.problem3.Student;

public class Exercise6_4 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("홍길동");
        s.setBan(1);
        s.setNo(1);
        s.setKor(100);
        s.setEng(60);
        s.setMath(76);

        System.out.println("이름:" + s.getName());
        System.out.println("총점:" + s.getTotal());
        System.out.println("평균:" + s.getAverage());
    }
}
