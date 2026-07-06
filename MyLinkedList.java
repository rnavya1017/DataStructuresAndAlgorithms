

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
     * Insert a node after a given node
     */
    public void insert(Node<T> previousNode, T data) {

        if (previousNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }

        Node<T> newNode = new Node<>(data);

        newNode.next = previousNode.next;
        previousNode.next = newNode;

        // Update tail if inserted at the end
        if (previousNode == tail) {
            tail = newNode;
        }
    }
     /**
     * Delete the first node (Head)
     */
    public void pop() {

        if (head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }

        // Move head to next node
        head = head.next;

        // If list becomes empty
        if (head == null) {
            tail = null;
        }
    }

      /**
     * Delete the last node (Tail)
     */
    public void popLast() {

        // Check if the list is empty
        if (head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }

        // If there is only one node
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        // Traverse to the second last node
        Node<T> temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        // Remove last node
        temp.next = null;

        // Update tail
        tail = temp;
    }

     /**
     * Search for a node by value
     */
    public Node<T> search(T key) {

        Node<T> temp = head;

        while (temp != null) {

            if (temp.data.equals(key)) {
                return temp;
            }

            temp = temp.next;
        }

        return null;
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
