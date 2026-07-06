

public class StackDS<T> {

    Node<T> head;

    // Add node at beginning
    public void add(T data) {

        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
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