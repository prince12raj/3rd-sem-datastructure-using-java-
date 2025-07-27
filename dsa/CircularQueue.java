import java.util.Scanner;

public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int capacity) {
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = capacity;
    }

    public void enqueue(int value) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue Overflow. Unable to enqueue " + value);
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            queue[rear] = value;
            System.out.println(value + " added to the queue.");
        }
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow. Queue is empty.");
        } else {
            System.out.println(queue[front] + " removed from the queue.");
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
        }
    }

    public void peek() {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element is " + queue[front]);
        }
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            int i = front;
            while (true) {
                System.out.print(queue[i] + " ");
                if (i == rear) {
                    break;
                }
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the circular queue: ");
        int capacity = scanner.nextInt();
        CircularQueue queue = new CircularQueue(capacity);

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
