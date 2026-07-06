

public class QueueDS<T> {

    Node<T> head;
    Node<T> tail;

    // Add node at the end
    public void append(T data) {

        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Remove first node
    public T pop() {

        if (head == null) {
            return null;
        }

        T data = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return data;
    }

    // Display Queue
    public void display() {

        Node<T> temp = head;

        while (temp != null) {

            System.out.print(temp.data);

            if (temp.next != null)
                System.out.print(" -> ");

            temp = temp.next;
        }

        System.out.println();
    }

    // Check Queue Empty
    public boolean isEmpty() {
        return head == null;
    }
}