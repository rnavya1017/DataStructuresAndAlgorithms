

public class QueueUC2 {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        System.out.println("Original Queue:");
        queue.display();

        while (!queue.isEmpty()) {

            System.out.println("Dequeued: " + queue.dequeue());

            System.out.print("Queue: ");

            if (queue.isEmpty()) {
                System.out.println("Empty");
            } else {
                queue.display();
            }
        }
    }
}