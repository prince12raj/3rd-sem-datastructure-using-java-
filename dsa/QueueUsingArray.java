import java.util.Scanner;

public class QueueUsingArray {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public QueueUsingArray(int size) {
        queue = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow. Unable to enqueue " + value);
        } else {
            queue[++rear] = value;
            System.out.println(value + " added to the queue.");
        }
    }

    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow. Queue is empty.");
        } else {
            System.out.println(queue[front++] + " removed from the queue.");
        }
    }

    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public void peek() {
        if (front > rear) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element is " + queue[front]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();
        QueueUsingArray queue = new QueueUsingArray(size);

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
