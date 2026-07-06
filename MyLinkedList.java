

/**
 * Generic Linked List Class
 */
public class MyLinkedList<T> {

    Node<T> head;
    Node<T> tail;

    /**
     * Append a node at the end of the linked list
     */
    public void append(T data) {

        Node<T> newNode = new Node<>(data);

        // If linked list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // Attach new node after tail
            tail.next = newNode;

            // Move tail to new node
            tail = newNode;
        }
    }

    /**
     * Display the linked list
     */
    public void display() {

        Node<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}