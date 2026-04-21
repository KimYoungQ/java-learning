package Stack;

public class StackDemo {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        // === 데이터 추가 ===
        stack.push(10);    // [push] 10 추가 → 현재 top 인덱스: 0
        stack.push(20);    // [push] 20 추가 → 현재 top 인덱스: 1
        stack.push(30);    // [push] 30 추가 → 현재 top 인덱스: 2
        stack.printStack(); // [Stack] bottom → 10 → 20 → 30 ← top

        // === peek으로 확인 ===
        System.out.println("peek: " + stack.peek());  // peek: 30 (꺼내지 않음!)
        System.out.println("size: " + stack.size());   // size: 3

        // === 데이터 꺼내기 ===
        stack.pop();        // [pop] 30 꺼냄 → 현재 top 인덱스: 1
        stack.pop();        // [pop] 20 꺼냄 → 현재 top 인덱스: 0
        stack.printStack(); // [Stack] bottom → 10 ← top

        // === 상태 확인 ===
        System.out.println("isEmpty: " + stack.isEmpty());  // isEmpty: false

        stack.pop();        // [pop] 10 꺼냄 → 현재 top 인덱스: -1
        System.out.println("isEmpty: " + stack.isEmpty());  // isEmpty: true
    }
}