 
public class UC4Main {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        // Create initial Linked List
        list.append(56);
        list.append(70);

        // Insert 30 between 56 and 70
        list.insert(list.head, 30);

        System.out.println("Linked List after insertion:");

        list.display();
    }
}