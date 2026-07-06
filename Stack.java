

public class Stack<T> {

    StackDS<T> stack = new StackDS<>();

    // Push operation
    public void push(T data) {
        stack.add(data);
    }

    public T peek() {
        return stack.peek();
    }

    public T pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }



    // Display Stack
    public void display() {
        stack.display();
    }
}