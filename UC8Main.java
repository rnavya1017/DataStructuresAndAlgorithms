
public class UC8Main {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        // Create Linked List
        list.append(56);
        list.append(30);
        list.append(70);

        System.out.println("Before Insertion:");
        list.display();

        // Search for node containing 30
        Node<Integer> node = list.search(30);

        // Insert 40 after 30
        list.insertAfter(node, 40);

        System.out.println("After Insertion:");
        list.display();
    }
}