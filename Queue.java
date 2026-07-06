

public class Queue<T> {

    QueueDS<T> queue = new QueueDS<>();

    // Enqueue operation
    public void enqueue(T data) {
        queue.append(data);
    }

     // Dequeue operation
    public T dequeue() {
        return queue.pop();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        queue.display();
    
    }
}