import java.util.EmptyStackException;

public class Stack {
    private int value;
    private int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int value) {
        this.value = value;
        size++;
    }

    public int top() {
        return value;
    }

    public int size() {
        return size;
    }

    public void pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
    }
}