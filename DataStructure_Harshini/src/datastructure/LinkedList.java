package datastructure;

import java.util.*;

/**
 * 
 * @author Harshini
 * class LinkedList gives the implementation of Linked List
 *
 */

class Node {
    int value;
    Node next;
    Node(int value)
    {
        this.value = value;
    }
}

public class LinkedList {
    int ch;
    Node head;
    Scanner sc = new Scanner(System.in);
    public void linkedlist()
    {
        while (true) {
            System.out.println();
            System.out.println(" Options in Linked List ");
            System.out.println(" 1. Add \n 2. Remove \n 3. Display \n 4. Count \n 5. Exit");
            System.out.print(" Enter your choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    add();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    count();
                    break;
                case 5:
                    return;
                default:
                    System.out.println(" Invalid Choice ");
                    break;
            }
        }
    }
    
    //Adding element inside the linked list
    public void add(){
        System.out.print(" Enter a Number : ");
        Node new_node = new Node(sc.nextInt());
        if(head == null) {
            head = new_node;
        }
        else {
            new_node.next = head;
            head = new_node;
        }
    }
    
    //Removing element from the linked list
    public void remove(){
        if(head == null) {
            System.out.println(" Linked List is Empty ");
        }
        else {
            head = head.next;
            System.out.print(" After Removing : ");
            display();
        }
    }
    
    //Displaying linked list
    public void display(){
        Node temp = head;
        System.out.print(" Linked List : ");
        while(temp.next != null) {
            System.out.print(temp.value + " , ");
            temp = temp.next;
        }
        System.out.print(temp.value);
    }
    
    public void count(){
        int count = 1;
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
            count += 1;
        }
        System.out.println(" Number of Nodes : "+count);
    }
}