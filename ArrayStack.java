import java.util.EmptyStackException;
public interface Stack<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
}

public class ArrayStack<T> implements Stack<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;

    public ArrayStack() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void push(T item) {
        if (size == array.length) {
            // Expand the array if it's full
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
        array[size++] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = (T) array[--size];
        array[size] = null; // Clear the reference
        return item;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) array[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Peek: " + stack.peek()); // Output: 3
        System.out.println("Pop: " + stack.pop());   // Output: 3
        System.out.println("Pop: " + stack.pop());   // Output: 2

        System.out.println("Is Empty: " + stack.isEmpty()); // Output: false
    }
}
