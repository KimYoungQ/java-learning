package Queue;

public class QueueDemo {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        // === 데이터 추가 ===
        queue.enqueue(10);  // [enqueue] 10 추가 → front=0, rear=1
        queue.enqueue(20);  // [enqueue] 20 추가 → front=0, rear=2
        queue.enqueue(30);  // [enqueue] 30 추가 → front=0, rear=3
        queue.printQueue();  // [Queue] front → 10 → 20 → 30 ← rear

        // === peek으로 확인 ===
        System.out.println("peek: " + queue.peek());  // peek: 10 (맨 앞!)
        System.out.println("size: " + queue.size());   // size: 3

        // === 데이터 꺼내기 (먼저 넣은 순서대로!) ===
        queue.dequeue();     // [dequeue] 10 꺼냄 → front=1, rear=3
        queue.dequeue();     // [dequeue] 20 꺼냄 → front=2, rear=3
        queue.printQueue();  // [Queue] front → 30 ← rear

        // === 순환 동작 확인 ===
        queue.enqueue(40);   // [enqueue] 40 추가 → front=2, rear=4
        queue.enqueue(50);   // [enqueue] 50 추가 → front=2, rear=5
        queue.enqueue(60);   // [enqueue] 60 추가 → front=2, rear=0  ← 순환!
        queue.printQueue();  // [Queue] front → 30 → 40 → 50 → 60 ← rear
    }
}