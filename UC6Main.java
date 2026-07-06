
public class UC6Main {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        // Create Linked List
        list.append(56);
        list.append(30);
        list.append(70);

        System.out.println("Before deleting last node:");
        list.display();

        // Delete the last node
        list.popLast();

        System.out.println("After deleting last node:");
        list.display();
    }
}