package stack.stackentry;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6); // > Stack is Full!
        stack.push(7); // > Stack is Full!

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // > Stack is Empty!
        stack.pop(); // > Stack is Empty!

    }
}
