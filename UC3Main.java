

public class UC3Main {

    public static void main(String[] args) {

        // Create Linked List object
        MyLinkedList<Integer> list = new MyLinkedList<>();

        // First create node 56
        list.append(56);

        // Append 30 to 56
        list.append(30);

        // Append 70 to 30
        list.append(70);

        System.out.println("Linked List:");

        list.display();
    }
}