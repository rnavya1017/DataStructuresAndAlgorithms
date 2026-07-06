

public class StackDS<T> {

    Node<T> head;

    // Add node at beginning
    public void add(T data) {

        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    // Return top element
public T peek() {

    if (head == null) {
        return null;
    }

    return head.data;
}

// Remove top element
public T pop() {

    if (head == null) {
        return null;
    }

    T data = head.data;
    head = head.next;

    return data;
}

// Check whether stack is empty
public boolean isEmpty() {
    return head == null;
}

    // Display Stack
    public void display() {

        Node<T> temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}