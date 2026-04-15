package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class JavaQueueExample {
    public static void main(String[] args) {

        // === 방법 1: LinkedList로 Queue 구현 ===
        Queue<String> queue1 = new LinkedList<>();
        queue1.offer("첫 번째");    // enqueue (add도 가능하지만 offer 권장)
        queue1.offer("두 번째");
        queue1.offer("세 번째");
        System.out.println(queue1.poll());  // "첫 번째" - dequeue
        System.out.println(queue1.peek());  // "두 번째" - 확인만

        // === 방법 2: ArrayDeque로 Queue 구현 (✅ 성능 권장) ===
        Queue<String> queue2 = new ArrayDeque<>();
        queue2.offer("A");
        queue2.offer("B");
        queue2.offer("C");
        System.out.println(queue2.poll());  // "A"
        System.out.println(queue2.peek());  // "B"
    }
}
