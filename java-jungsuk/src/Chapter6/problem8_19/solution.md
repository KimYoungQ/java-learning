```java
class PlayingCard {
    int kind;
    int num;
    static int width;
    static int height;
   
    PlayingCard(int k, int n) {
        kind = k;
        num = n;
        public static void main(String args[]) {
            PlayingCard card = new PlayingCard(1,1);
        }
    }
}
```

- 클래스변수 (static 변수) : width, height
- 인스턴스변수 : kind, num
- 지역변수 : k, n, card, args

10~ 19 문제 틀린거 정리
- 생성자는 객채를 생성하기 위한것이다 (X) => 생성자 생성은 new 연산자이고, 객체를 초기화할 목적으로 사용되는 것이다.
- this는 클래스 내에서라면 어디서든 사용 가능 (X) => 인스턴스메서드에서만 사용 가능, 클래스 멤버(static이 붙은 변수나 메서드) 에서는 사용할 수 없다.
- 인스턴스 변수의 초기화 순서 ( 기본값  - 명시적초기화 - 초기화블럭 - 생성자)