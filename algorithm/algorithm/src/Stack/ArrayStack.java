package Stack;

public class ArrayStack {

    private int[] data;     // 데이터를 저장할 배열
    private int top;        // 스택의 최상단 인덱스 (-1이면 비어있음)
    private int capacity;   // 스택의 최대 크기

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.top = -1;  // 비어있는 상태를 -1로 표현
    }


    public void push(int item) {
        if (top >= capacity - 1) {
            throw new RuntimeException("Stack Overflow! 스택이 가득 찼습니다.");
        }
        data[++top] = item;
        System.out.println("[push] " + item + " 추가 → 현재 top 인덱스: " + top);
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow! 스택이 비어있습니다.");
        }
        int item = data[top--];
        System.out.println("[pop] " + item + " 꺼냄 → 현재 top 인덱스: " + top);
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("스택이 비어있어서 확인할 수 없습니다.");
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("[Stack] 비어있음");
            return;
        }
        System.out.print("[Stack] bottom → ");
        for (int i = 0; i <= top; i++) {
            System.out.print(data[i]);
            if (i < top) System.out.print(" → ");
        }
        System.out.println(" ← top");
    }
}