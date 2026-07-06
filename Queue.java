

public class Queue<T> {

    QueueDS<T> queue = new QueueDS<>();

    // Enqueue operation
    public void enqueue(T data) {
        queue.append(data);
    }

    // Display Queue
    public void display() {
        queue.display();
    }
}