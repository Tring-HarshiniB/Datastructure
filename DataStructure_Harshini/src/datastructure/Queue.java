package datastructure;

import java.util.Scanner;

/**
 * 
 * @author Harshini
 *         class Queue gives the implementation of Queue
 *
 */

public class Queue {

    int size;
    int ch, front, rear;
    int arr[] = new int[size];
    Scanner sc = new Scanner(System.in);

    Queue() {
        front = -1;
        rear = -1;
    }

    public void queue() {
        System.out.print("Enter the size of the Queue : ");
        size = sc.nextInt();
        while (true) {
            System.out.println();
            System.out.println(" Options in Queue ");
            System.out.println(" 1. Enqueue \n 2. Dequeue \n 3. Display \n 4. Exit ");
            System.out.print(" Enter your choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    enqueue();
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    return;
                default:
                    System.out.println(" Invalid Choice ");
                    break;
            }
        }
    }

    // Inserting element inside the queue
    public void enqueue() {
        int val;
        if (rear == size - 1) {
            System.out.println(" Queue Overflowed ");
        } else {
            if (front == -1) {
                front = 0;
            }
            System.out.print(" Enter a value to be added : ");
            val = sc.nextInt();
            rear += 1;
            arr[rear] = val;
        }
    }

    // Deleting element from the queue
    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println(" Queue is Empty ");
        } else {
            System.out.print(" Deleted element : " + arr[front]);
            front -= front;
        }
    }

    // Displaying Queue
    public void display() {
        if (front == -1) {
            System.out.println(" Queue is Empty ");
        } else {
            System.out.print(" Queue : ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i]);
            }
        }
    }
}