package Queue;
import java.util.*;
public class QueueUsingCircularArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;
        Queue(int length){
            this.size = length;
            arr = new int[length];
        }
        public static boolean isEmpty(){
            return rear == -1 ? true : false;
        }
        public static boolean isFull(){
            return (rear+1)%size == -1 ? true : false;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return ;
            }
            if(front == -1){
                front = 0 ;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];
            if(rear == front){
                rear = front =-1;
            }
            else{
                front = (front+1) % size;
            }
            return result;
        }
        public static int show(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(Short.MAX_VALUE);
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        System.out.println(q.remove());
        q.add(8);
        System.out.println(q.remove());
        q.add(9);
        while(!q.isEmpty()){
            System.out.println(q.show());
            q.remove();
        }
    }
}
