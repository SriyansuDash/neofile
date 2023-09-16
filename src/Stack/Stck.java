package Stack;
import java.util.Scanner; 
public class Stck  
{ 
 static int Stack[]; 
 static int top=-1; 
 static int size; 
    public static void main(String[] args)  
    { 
     Scanner sc=new Scanner(System.in); 
     System.out.println("Enter the size of the stack"); 
     size=sc.nextInt(); 
     Stack=new int[size]; 
     boolean b=true; 
      
        while(b)  
        { 
         System.out.println("****MENU*****"); 
         System.out.println("0:Exit"); 
         System.out.println("1:Push"); 
         System.out.println("2:Pop"); 
         System.out.println("3:Display"); 
         System.out.println("Enter your choice:"); 
         int ch=sc.nextInt(); 
         switch(ch)  
         { 
          case 0: 
           b=false; 
           break; 
          case 1: 
           push(); 
           break; 
          case 2: 
           pop(); 
           break; 
          case 3: 
           display(); 
           break; 
          default: 
           System.out.println("Wrong choice"); 
         } 
        }  
    }  
     
    public static boolean isEmpty() 
    { 
     if(top==-1) 
      return true; 
     return false; 
    } 
    public static boolean isFull()  
    { 
     if(top==size-1) 
      return true; 
     return false; 
    } 
    public static void push() 
    { 
     Scanner sc=new Scanner(System.in); 
     if(isFull()) 
      System.out.println("Stack Overflow"); 
     else  
     { 
      System.out.print("Enter the elements you want to insert: "); 
      Stack[++top]=sc.nextInt(); 
     } 
    } 
    public static void pop() 
    { 
     if(isEmpty()) 
      System.out.println("Stack Underflow"); 
     else  
     { 
      System.out.println("Deleted Item is "+Stack[top]); 
      top--; 
     } 
    } 
    public static void display() 
    { 
     if(isEmpty()) 
      System.out.println("No element in the stack to display"); 
     else  
     { 
      System.out.println("Stack elements are-->"); 
      for(int i=top;i>=0;i--) 
      { 
       System.out.println(Stack[top]+"  "); 
      } 
     } 
    } 
     
} 