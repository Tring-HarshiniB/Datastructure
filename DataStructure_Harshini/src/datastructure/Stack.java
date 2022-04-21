package datastructure;

import java.util.*;

/**
 * 
 * @author Harshini
 *         class Stack gives the implementation of Stack
 *
 */

public class Stack {

    int size;
    int top, ch;
    int arr[] = new int[size];
    Scanner sc = new Scanner(System.in);

    Stack() {
        top = -1;
    }

    public void stack() {
        System.out.print("Enter the size of the Stack : ");
        size = sc.nextInt();
        while (true) {
            System.out.println();
            System.out.println(" Options in Stack ");
            System.out.println(" 1. Push \n 2. Pop \n 3. Display \n 4. Exit");
            System.out.print(" Enter your choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
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

    // Pushing element inside the stack
    public void push() {
        int val;
        if (top == size - 1) {
            System.out.println(" Stack Overflowed ");
        } else {
            System.out.print(" Enter a value to be pushed : ");
            val = sc.nextInt();
            top += 1;
            arr[top] = val;
        }
    }

    // Poping out element from the stack
    public void pop() {
        if (top == -1) {
            System.out.println(" Stack is Empty ");
        } else {
            System.out.print(" Poped element : " + arr[top]);
            top -= top;
        }
    }

    // Displaying Stack
    public void display() {
        if (top == -1) {
            System.out.println(" Stack is Empty ");
        } else {
            System.out.print(" Stack : ");
            for (int i = top; i >= 0; --i) {
                System.out.print(arr[i]);
            }
        }
    }
}