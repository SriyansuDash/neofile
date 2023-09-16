package Queue;
import java.util.*;
public class QueueUsingArray{
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        Queue(int length){
            arr = new int [length];
            this.size = length;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static boolean isFull(){
            return (rear == size-1);
        }
        public static void push(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return ;
            }
            rear++;
            arr[rear] = data ;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear-- ;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(55);
        q.push(0);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}