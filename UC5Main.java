

public class UC5Main {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        // Create Linked List
        list.append(56);
        list.append(30);
        list.append(70);

        System.out.println("Before deleting first node:");
        list.display();

        // Delete first node
        list.pop();

        System.out.println("After deleting first node:");
        list.display();
    }
}