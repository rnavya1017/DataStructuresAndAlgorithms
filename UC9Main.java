

public class UC9Main {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        // Create Linked List
        list.append(56);
        list.append(30);
        list.append(40);
        list.append(70);

        System.out.println("Before Deletion:");
        list.display();

        // Delete node with value 40
        list.delete(40);

        System.out.println("After Deletion:");
        list.display();

        System.out.println("Size of Linked List: " + list.size());
    }
}