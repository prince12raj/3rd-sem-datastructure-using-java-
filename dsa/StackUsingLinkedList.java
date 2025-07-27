import java.util.Scanner;

public class StackUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public StackUsingLinkedList() {
        top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println(value + " pushed to stack.");
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack Underflow. Stack is empty.");
        } else {
            System.out.println(top.data + " popped from stack.");
            top = top.next;
        }
    }

    public void peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element is " + top.data);
        }
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
