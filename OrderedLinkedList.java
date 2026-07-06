
/**
 * Ordered Linked List using Generics
 */
public class OrderedLinkedList<T extends Comparable<T>> {

    Node<T> head;

    /**
     * Add elements in sorted order
     */
    public void add(T data) {

        Node<T> newNode = new Node<>(data);

        // If list is empty or new node should become head
        if (head == null || data.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node<T> temp = head;

        // Find the correct position
        while (temp.next != null && data.compareTo(temp.next.data) > 0) {
            temp = temp.next;
        }

        // Insert node
        newNode.next = temp.next;
        temp.next = newNode;
    }

    /**
     * Display Linked List
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