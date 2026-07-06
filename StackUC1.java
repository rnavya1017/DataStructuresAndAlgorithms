
public class StackUC1 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println("Stack (Top to Bottom):");

        stack.display();
    }
}