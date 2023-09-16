package Stack;
import java.util.*;
public class StackUsingLL {
    static class Node{
        int data;
        Node next;
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    static class stack{
        public static Node head ;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(stack.isEmpty()){
                head = newNode;
                return;
            }
            else{
                newNode.next = head ;
                head = newNode;
            }
        }
        public static int pop(){
            if(stack.isEmpty()){
                return -1;
            }
            else{
                int top = head.data;
                head = head.next;
                return top;
            }
        }
        public static int peak(){
            if(stack.isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isEmpty()){
            System.out.println(s.peak());
            s.pop();
        }
    }
}
