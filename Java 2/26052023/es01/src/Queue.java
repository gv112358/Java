import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private List<T> queue;


    public Queue() {
        queue = new ArrayList<>();

    }
    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La coda è vuota");
        }
        return queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void clear() {
        queue.clear();
    }
    public T top() {
        if (isEmpty()) {
            throw new IllegalStateException("La coda è vuota");
        }
        return queue.get(0);
    }
    public void printQueue() {
        System.out.print("Contenuto della coda: ");
        for (T item : queue) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
