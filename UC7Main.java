
public class UC7Main {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        // Create Linked List
        list.append(56);
        list.append(30);
        list.append(70);

        System.out.println("Linked List:");
        list.display();

        // Search for node with value 30
        Node<Integer> result = list.search(30);

        if (result != null) {
            System.out.println("Node with value 30 found.");
        } else {
            System.out.println("Node not found.");
        }
    }
}