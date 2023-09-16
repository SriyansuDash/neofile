package Stack;
import java.util.*;
class Node{
    int num;
    Node next;
}
public class stack_linklist{
    public static boolean isEmpty(Node head){
        return head == null;
    }
    public static Node push(Node head){
        Scanner in = new Scanner (System.in);
        char ch = 0;
        do{
            Node newNode = new Node();
            System.out.print("Enter number : ");
            newNode.num = in.nextInt();
            newNode.next = null;
            if(isEmpty(head)){
                head = newNode;
            }
            else{
                newNode.next = head;
                head = newNode;
            }
            System.out.println("Element "+newNode.num+" pushed ");
          
            System.out.println("Do you want to push more elements ? <y/n>");
            ch = in.next().charAt(0);
        }while(ch=='y'|| ch=='Y');
        return head;
    }
    public static Node pop (Node head){
        // Node newNode = new Node();
        Node pop = head;
        head = head.next;
        pop.next = null;
        return head;
    }
    public static void peak(Node head){
        if(isEmpty(head)){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack elements ");
            Node temp = head;
            while(temp != null){
                System.out.println(temp.num);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Node head = null; 
        while(true){
            System.out.println("0. Exit");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peak");
            System.out.println("Enter your choice : ");
            int choice = in.nextInt();
            switch(choice){
                case 0 : 
                System.exit(0);
                break;
                case 1 : 
                head = push(head);
                break;
                case 2 : 
                head = pop(head);
                break;
                case 3 :
                peak(head);
            }

        }
    }
}