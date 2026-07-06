
public class UC1Main {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(56);
        list.add(30);
        list.add(70);

        System.out.println("Linked List:");

        list.display();
    }
}