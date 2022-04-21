package datastructure;

import java.util.*;

public class DataStructure {

    public static void main(String[] args) {
        int ch;
        String c;
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack(); // creating Stack class object
        Queue q = new Queue(); // creating Queue class object
        LinkedList l = new LinkedList(); // creating LinkedList class object
        do {
            System.out.println(" *** DATA STRUCTURE *** ");
            System.out.println(" 1. Stack \n 2. Queue \n 3. Linked List ");
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    s.stack(); // calling stack class
                    break;
                case 2:
                    q.queue(); // calling queue class
                    break;
                case 3:
                    l.linkedlist(); // calling linkedlist class
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            System.out.print("Do you want to continue(y/n) : ");
            c = sc.next();
        } while (c.equalsIgnoreCase("y"));
    }
}