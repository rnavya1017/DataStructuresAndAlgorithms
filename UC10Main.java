
public class UC10Main {

    public static void main(String[] args) {

        OrderedLinkedList<Integer> list = new OrderedLinkedList<>();

        // Add elements in random order
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);

        System.out.println("Ordered Linked List:");

        list.display();
    }
}