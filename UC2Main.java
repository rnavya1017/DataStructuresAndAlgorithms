

public class UC2Main {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        // First create node 70
        list.addFirst(70);

        // Add 30 before 70
        list.addFirst(30);

        // Add 56 before 30
        list.addFirst(56);

        System.out.println("Linked List after Adding:");

        list.display();
    }
}