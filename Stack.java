

public class Stack<T> {

    StackDS<T> stack = new StackDS<>();

    // Push operation
    public void push(T data) {
        stack.add(data);
    }

    // Display Stack
    public void display() {
        stack.display();
    }
}