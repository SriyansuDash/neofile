package Stack;
import java.util.*;
public class StackArrayList {
    static ArrayList<Integer> ls = new ArrayList<>();
    public static boolean isEmpty(){
        return ls.size() == -1;
    }
    public static void push (int data ){
        ls.add(data);
    }
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = ls.get(ls.size()-1);
        ls.remove(ls.size()-1);
        return top;
    }
    public static int peek(){
        if(ls.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return ls.get(ls.size()-1);
    }
    public static void pushAtBottom(int data ,Stack<Integer> stk){
        if(stk.isEmpty()){
            stk.push(data);
            return;
        }
        int top = stk.pop();
        pushAtBottom(data, stk);
        stk.push(top);
    }
    public static void reverse(Stack<Integer> stk){
        if(stk.isEmpty()){
            return ;
        }
        int top = stk.pop();
        reverse(stk);
        pushAtBottom(top, stk);
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        pushAtBottom(4, st);
        reverse(st);
        while(!st.isEmpty()){
        System.out.println(st.peek());
            st.pop();
        }
    }
}
