package p1;

import java.util.Scanner;

class PriorityCircularQueue {

    int[] queue;
    int front, rear, size, capacity;

    PriorityCircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
            queue[rear] = data;
        } else {
            int pos = rear;

            while (pos != front &&
                   queue[(pos - 1 + capacity) % capacity] > data) {

                queue[pos] = queue[(pos - 1 + capacity) % capacity];
                pos = (pos - 1 + capacity) % capacity;
            }

            queue[pos] = data;
            rear = (rear + 1) % capacity;
        }
        size++;
        System.out.println("Inserted: " + data);
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Deleted: " + queue[front]);
        front = (front + 1) % capacity;
        size--;

        if (size == 0) {
            front = rear = -1;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue capacity: ");
        int cap = sc.nextInt();

        PriorityCircularQueue pq = new PriorityCircularQueue(cap);

        int choice, value;

        do {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    pq.enqueue(value);
                    break;

                case 2:
                    pq.dequeue();
                    break;

                case 3:
                    pq.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        sc.close();
    }
}
  
