package Queue;

public class CircularQueue {

    private int[] data;
    private int front;
    private int rear;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        // 한칸을 비워둬야 full과 empty를 구분할 수 있음
        this.data = new int[capacity + 1];
        this.front = 0;
        this.rear = 0;
    }

    /**
     * enqueue: 큐의 맨 뒤에 데이터 추가
     *
     * [동작 과정]
     * 1) rear 위치에 데이터를 저장한다.
     * 2) rear를 다음 위치로 이동시킨다. (순환!)
     *
     * 예) capacity=5, rear=4일 때 enqueue하면:
     *     data[4]에 저장 후 rear = (4+1) % 6 = 5
     *     rear=5일 때 다시 enqueue하면:
     *     data[5]에 저장 후 rear = (5+1) % 6 = 0  ← 처음으로 순환!
     */
    public void enqueue(int item) {
        if(isFull()) {
            throw new RuntimeException("Queue is Full! 큐가 가득 참");
        }
        data[rear] = item;
        rear = (rear + 1) % (capacity + 1); // 순환 이동
        System.out.println("[enqueue] " + item + " 추가 → front=" + front + ", rear=" + rear);
    }

    /**
     * dequeue: 큐의 맨 앞에서 데이터를 꺼내서 반환
     *
     * [동작 과정]
     * 1) front 위치의 데이터를 읽는다.
     * 2) front를 다음 위치로 이동시킨다. (순환!)
     * 3) 읽은 데이터를 반환한다.
     */
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("큐가 비어있음");
        }
        int item = data[front];
        front = (front + 1) % (capacity + 1);
        System.out.println("[dequeue] " + item + " 꺼냄 → front=" + front + ", rear=" + rear);
        return item;
    }

    /** peek: 맨 앞의 데이터를 확인만 하고 꺼내지 않음 */
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("큐가 비어있어서 확인할 수 없습니다.");
        }
        return data[front];
    }

    /**
     * isEmpty: front와 rear가 같으면 비어있음
     * isFull:  rear의 다음 위치가 front이면 가득 참
     */
    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return  (rear + 1) % (capacity + 1) == front;
    }

    public int size() {
        return (rear - front + capacity + 1) % (capacity + 1);
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("[Queue] 비어있음");
            return;
        }
        System.out.print("[Queue] front → ");
        int i = front;
        while (i != rear) {
            System.out.print(data[i]);
            i = (i + 1) % (capacity + 1);
            if (i != rear) System.out.print(" → ");
        }
        System.out.println(" ← rear");
    }
}
