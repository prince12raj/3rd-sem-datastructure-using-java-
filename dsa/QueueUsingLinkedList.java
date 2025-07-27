import java.util.Scanner;

public class QueueUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front, rear;

    public QueueUsingLinkedList() {
        front = rear = null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
            System.out.println(value + " added to the queue.");
        } else {
            rear.next = newNode;
            rear = newNode;
            System.out.println(value + " added to the queue.");
        }
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow. Queue is empty.");
        } else {
            System.out.println(front.data + " removed from the queue.");
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }
    }

    public void peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element is " + front.data);
        }
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            Node current = front;
            System.out.print("Queue elements: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
