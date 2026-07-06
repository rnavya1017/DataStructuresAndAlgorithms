
/**
 * Generic Linked List
 */
public class MyLinkedList<T> {

    Node<T> head;
    Node<T> tail;

    /**
     * Add node at end of Linked List
     */
    public void add(T data) {

        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * Display Linked List
     */
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
}