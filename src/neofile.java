// import java.util.*;
// class neofile{
//     private int a,b,c;
//     Node input(){
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter 1st number : ");
//         a = in.nextInt();
//         System.out.print("Enter 2nd number : ");
//         b = in.nextInt();
//         System.out.print("Enter 3rd number : ");
//         c = in.nextInt();
//         System.out.println();
//     }
//     Node display(){
//         System.out.print("The maximum number between "+a+","+b+" & "+c+" is  : ");
//     }
//     Node maximum(){
//         if(a>b && a>c){
//             System.out.println(a);
//         }
//         else if(b>a && b>c){
//             System.out.println(b);
//         }
//         else{
//             System.out.println(c);
//         }
//     }
//     public static Node main(String...args){ 
//       neofile obj = new neofile();
//       obj.input();
//       obj.display();
//       obj.maximum();
//     }
// }


// import java.util.*;
// public class neofile{
//     public static Node main(String...args){
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter first number day of week ");
//         int s = in.nextInt();
//      switch(s){
//     //     case 1:
//     //     System.out.println("It is Sunday ");
//     //     break;
//     //     case 2 :
//     //     System.out.println("It is Monday ");
//     //     break;
//     //     case 3 : 
//     //     System.out.println("It is Wednesday ");
//     //     break;
//     //     case 4 : 
//     //     System.out.println("It is Thurseday ");
//     //     break;
//     //     case 5 : 
//     //     System.out.println("It is Friday ");
//     //     break;
//     //    default :
//     //    System.out.println("It is Saturday ");

//     case 1 -> System.out.println("Today is Sunday");
//     case 2 -> System.out.println("Today is Monday");
//     case 3 -> System.out.println("Today is Wednesday");
//     case 4 -> System.out.println("Today is Thurseday");
//     case 5 -> System.out.println("Today is Friday ");
//     default -> System.out.println("Today is Saturday");
//        }
//     }
// }


// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new  Scanner(System.in);
//         String s = in.nextLine();
//         System.out.println(s);
//         StringBuilder sb = new StringBuilder(s);
//         sb.insert(0,"Dash");
//         System.out.println("Insert -"+sb);
//         sb.delete(0,4);
//         System.out.println("Delete "+sb);
//         System.out.println(sb.charAt(3));
//         sb.replace(0,7,"New");
//         System.out.println("Replace "+sb);
//         sb.append("H");
//         sb.append("I");
//         sb.append(" ");
//         sb.append("H");
//         sb.append("O");
//         sb.append("W");
//         System.out.println("Append-"+sb);
//         sb.insert(4,"ARE YOU ?");

//     }
// }


// public class neofile{
// static Node display(int x ){
//    // System.out.println(x);
// }    
//     public static Node main(String[] args) {
//         Sriyansu s=new Sriyansu(10,20,30);
//         s.display();
//         int a = 5;
//         display(a);
//     }
// }
// class Sriyansu{
//     int x,y,z;
//     Sriyansu(){
//         System.out.println("Hello");
//     }
//     Sriyansu(int a){
//         this();
//         x=a;
//     }
//     Sriyansu(int x,int y){
//         this.x=x;
//         this.y=y;
//     }
//     Sriyansu(int x ,int y,int z){
//         this(x,y);
//         this.z=z;
//         this.display();
//     }
//     Node display(){
//         System.out.println("x="+x+" y="+y+" z="+z);
//     }
// }

// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         char ar[] = {'c','a','r'};
//         int count =0;
//         for(int i=0;i<ar.length;i++){
//             for(int j=0;j<ar.length;j++){
//                 for(int k=0;k<ar.length;k++){
//                     if(i!=j && i!=k && j!=k){
//                         System.out.println(ar[i]+" "+ar[j]+" "+ar[k]);
//                         count++;
//                     }
//                 }
//             }
//         }
//     }
// }


// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array");
//         int n=sc.nextInt();
//         System.out.println("Enter the elements in ana array");
//         int a[]=new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }
//         int max=a[0];
//         int min=a[0];
//         for(int i=0;i<n;i++){
//             if(a[i]>max)
//                 max=a[i];
//             if(a[i]<min)
//                 min=a[i];
//         }
//         int mxc=0,mic=0,lmi=-1,fma=-1;
//        for(int i=0;i<n;i++){
//         if(a[i]==max) mxc++;
//         if(a[i]==min){ mic++;lmi=i;}
//        }
//        for(int i=0;i<n;i++){
//         if(a[i]==max){ fma=i;break;
//        }
//     }
//     System.out.println("the max element is "+max+" "+"occururs "+mxc+" times"+" and first occurance is "+fma);
//     System.out.println("the min element is "+min+" "+"occurs "+mic+" times"+" and last occurance is "+lmi);
//     }}


// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the size ");
//         int n = in.nextInt();
//         // for(int i=0;i<=n;i++){
//         //  for(int j=n;j>=i;j--){
//         //     System.out.print("*"+" ");
//         //     }
//         //     System.out.println();
//         // }
//         int i=0;
//         while(i<=n){
//             int j=n;
//             while(j>=i){
//             System.out.print("*"+" ");
//             j--;      
//             }
//             System.out.println();
//             i++;
//         }
//         in.close();
//     }
// }

// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter the size of Array : ");
//         int n = in.nextInt();
//         int [] a = new int[n];
//         System.out.println("Enter the elements of Array ");
//         for(int i=0;i<a.length;i++){
//             a [i] = in.nextInt();
//         }
//         for(int i=0;i<a.length;i++){
//             System.out.println(a[i]);
//         }
//     }
// }

// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter number : ");
//         int n = in.nextInt();
//         for(int i=0;i<=Integer.MAX_VALUE;i++){
//             if(i<=n){
//                 if(i>0){
//             System.out.println(i);
//                 }
//             }
//         }
//     }
// }

// public class neofile{
//     public static Node main(String[] args) {
//         for(int i=1;i<50;i++){
//             System.out.println(i);
//             if(i==2){
//                 System.out.println("Ending the loop");
//                 break;
//             }
//         }
//         System.out.println("Loop ends here ");
//     }
// }

// abstract class N{
//     int a=5;
//     int b=8;
//     abstract Node display();
// }
// class C extends N{
//     // a=5,b=8
//     Node display(int p,int q){
//         System.out.println(p+" "+q);
//     }
//     Node display(){

//     }
// }
// public class neofile{
//     public static Node main(String[] args) {
//          C c1=new C();
//          c1.display(5,6);
//     }
// }


// abstract class s{
//     int a = 3;
//     int b= 2;
//     abstract Node display();
// }
// class c extends s{
//     Node display(){
//         System.out.println(a+" "+b);
//     }
//     public Node display(int p,int q){
//         System.out.println(a+" "+b);
//     }
// }
// public class neofile{
//     public static Node main(String[] args) {
//         c c1=new c();
//         c1.display(4,5);
//         System.out.println(c1.b);
//     }
// }


// abstract class a {
//     Scanner in = new Scanner (System.in);
//     int a = in.nextInt();
//     int b = in.nextInt();
//     abstract Node display();
// }
// class c1 extends a {
//     Node display(){
//         System.out.println(a+" "+b);
//     }
// }
// public class neofile{
//     public static Node main(String[] args) {
//         c1 obj = new c1();
//         obj.display();
//     }
// }


// import  java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         int m = in.nextInt();
//         float [] n = new float[m];
//         float sum =0;
//         for(int i = 0;i<n.length;i++){
//             n[i] = in.nextFloat();
//         }
//         for(int i=0;i<n.length;i++){
//             System.out.println(n[i]);
//             sum+=n[i];
//             System.out.println(sum);
//         }
//     }
// }



// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         float f[] = {12.22F,78.11f,355.0f};
//         float sum=0;
//         for(float elements : f){
//             sum+=elements;
//             System.out.println(elements);
//         } 
//         System.out.println("Sum of the elements is "+sum);
//     }
// }


// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter arrays ");
//         int n = in.nextInt();
//         float s = in.nextFloat();
//         int count=0;
//         boolean isInArray=false; ;
//         float f[] = new float[n];
//         for(Float elements : f){
//             System.out.println(elements);
//             count++;
//             if(elements == s){
//                 isInArray=true;
//                 System.out.println(count);
//                 break;
//             }
//         }
//         if(isInArray){
//             System.out.println(s);
//         }
//         else{
//             System.out.println(s);
//         }
//     }
// }


// abstract class c1 {
//     int a = 33;
//     int b = 44;
//     abstract Node display();
// }
// class c2 extends c1{
//     Node display(){
//         System.out.println(a+" "+b);
//     }
//     public static Node display(int p ,int q){
//         System.out.println(p+" "+q);
//     }
// }
// public class neofile{
//     public static Node main(String[] args){
//         cls c3 = new cls();
//         c3.display();
//     }
// }
// import java.util.*;
// abstract class c1 {
//     int n = 7;
//     int m = 9;
//     abstract Node display();

// }
// class c2 extends c1{
//     Node display(){
//         System.out.println(n+" "+m);
//     }
//     public Node display(int r ,int s){
//         System.out.println(r+","+s);
//     }
// }
// public class neofile{
//     public static Node main(String[] args){
//        c2 c3 = new c2();
//        c3.display(5, 6);
//     }
// }


// import java.util.*;
// abstract class ne{
//     Scanner in = new Scanner (System.in);
//     int n = in.nextInt();
//     int m = in.nextInt();
//     abstract Node display();
// }
// class na extends ne {
//     Node display(){
//         System.out.println(n+","+m);
//     }
//     public Node display(int a ,int b ){
//         System.out.println(a+","+b);
//     }
// }
// public class neofile{
//     public static Node main(String[] args){
//         na n = new na();
//         n.display();
//     }
// }

// import java.util.*;
// class Employee{
//     Scanner in = new Scanner(System.in);
//     int n,salary ;
//     String nam;
//     public Node printdetails(){
//     System.out.println("My id is "+n);
//     System.out.println("My name is "+nam);
//     }
//     public int getSalary(){
//         return salary;
//     }
// }
// public class neofile{
//     public static Node main(String[] args){
//         Employee name = new Employee();
//         Employee j = new Employee();
//         name.n = 12;
//         name.nam = "Sriyansu";
//         name.printdetails();;
//         j.n = 123;
//         j.nam = "Jonny";
//         j.printdetails();
//         j.getSalary();
//     }
// }


// import java.util.*;
// class Employee {
//     int empid,salary;
//     String name;
//     public Node setdetails(){
//         System.out.println("Name of the employee is "+name);
//         System.out.println("Employee id is "+empid);
//         System.out.println("Employee salary is "+salary);
//     }
// }
// public class neofile{
//     public static Node main(String[] args){
//         Scanner in = new Scanner (System.in);
//         Employee one = new Employee ();
//         System.out.print("Enter the name of the employee : ");
//         one.name = in.nextLine();
//         System.out.print("Enter the employee id : ");
//         one.empid = in.nextInt();
//         System.out.print("Enter the salary of thr employee : ");
//         one.salary = in.nextInt();
//         System.out.println("Name of employee is "+one.name);
//         System.out.println("Employe id is "+one.empid);
//         System.out.println("Salary of the employee is "+one.salary );
//     }
// }

// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         int a = in.nextInt();
//         int b = in.nextInt();
//         int c = Integer.compare(a, b);
//        System.out.println(c);
//     }
// }

// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter the length : ");
//         int n = in.nextInt();
//         System.out.println("Enter the String : ");
//         String str = in.nextLine();
//         int count = 0 ;
//        for(int i=1;i<=n;i++){
//             count = str.length();
//             System.out.println(count);
//         }
//         if(n==count){
//             System.out.println("YES");
//         }
//         else{
//             System.out.println("NO");
//         }
//     }
// }
// import java.util.*;
// class Stock{
// String item ;
// int quantity;
// double rate;
// double ammount ;
// Stock(String i , int q , double r , int a ){
// this.item=i;
// this.quantity=q;
// this.rate=r;
// this.ammount=a;
//     }
//     Node display(){
//         System.out.println("Item : "+item+"\n"+"Quantity : "+quantity+"\n"+"Rate : "+rate+"\n"+"Ammount : "+ammount);

//     }
// }
// class Purchase extends Stock{
//     int pqty;
//     double prate;
//     Purchase(String i, int q, double r, int a,int pq,double qr) {
//         super(i, q, r, a);
//         this.pqty=pq;
//         this.prate=qr;
//     }
// Node upDate(int pq,double pr){
//     this.quantity=pq;
//     if(rate!=prate){
//         this.rate=prate;
//         this.ammount=quantity*rate;
//         }
//     }
//     Node display(){
//         System.out.println("Before updation of stock : ");
//         super.display();
//         System.out.println("After updation of stock : ");
//         System.out.println("Item : "+item+"\n"+"Quantity : "+quantity+"\n"+"Rate : "+rate+"\n"+"Ammount : "+ammount);
//     }
// }
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("ITEM : ");
//         String i = sc.nextLine() ;
//         System.out.println("Quantity : ");
//         int q = sc.nextInt();
//         System.out.println("Rate : ");
//         double r = sc.nextDouble();
//         System.out.println("Ammount : ");
//         double a = sc.nextDouble();
//         System.out.println("After ");
//         int pq = sc.nextInt();
//         double qr = sc.nextDouble();
//         Purchase p = new Purchase(i, q, r, q, pq, qr);
//         p.upDate(pq, r);
//         p.display();
//     }
// }


// import java.util.*;
// public class neofile{
//   public static Node main(String[] args) {
//     Scanner in =new Scanner(System.in);
//     System.out.println("Enter Elements ");
//     int n = in.nextInt();
//     int ar[] = new int[n];
//     //this loop for inputing array elements 
//    for(int i=1;i<ar.length;i++){
//           ar[i]=in.nextInt();
//      }
//      //output loop
//    for(int i=1;i<ar.length;i++){
//     System.out.print(ar[i]+" ");
//    }
//   }
// }


// import java.util.*;
// public class neofile{
//   public static Node main(String[] args) {
//     Scanner in = new Scanner (System.in);
//     int i=in.nextInt();int j=in.nextInt();
//     Integer a = new Integer(i);
//     Integer b = new Integer(j);
//     System.out.println((a.intValue())+(b.intValue()));
//   }
// }

// import java.util.*;
// public class neofile{
//   static int max (int x , int y , int z){
//   if(x>y && x>z){
//     return x;
//   }
//   else if (y>z && y>x ){
//     return y;
//   }
//   else{
//     return z;
//   }
//   }
//   public static Node main(String[] args) {
//     Scanner in = new Scanner (System.in);
//     System.out.println("Enter 1st number : ");
//     int a = in.nextInt();
//     System.out.println("Enter 2nd number : ");
//     int b = in.nextInt();
//     System.out.println("Enter 3rd number : ");
//     int c = in.nextInt();
//     System.out.println("Maximum number is "+max(a,b,c));
//   }
// }

// import java.util.*;
// public class neofile{
//   public static Node main(String[] args) {
//     Scanner in = new Scanner (System.in);
//     int n = in.nextInt();
//     int a[] =new int[n];
//     for(int i=0;i<a.length;i++){
//       a[i]=in.nextInt();
//     }
//     System.out.println("Array is ");
//      for(int i=0;i<a.length;i++){
//     //  for(int i:a){
//       System.out.println(+a[i]);
//     }
//   }
// }


// import java.util.*;
// public class neofile{
//   public static Node main(String[] args) {
//     Scanner in = new Scanner (System.in);
//     int a[] ={2,4,5,6,7,8,1,0,3};
//     int k = in.nextInt();
//   for(int i=0;i<a.length;i++){
//     if(k==a[i]){
//       System.out.print(i);
//       System.exit(0);
//     }
//    }
//    System.out.println("Not found");
//   }
// }


// import java.util.*;
// public class neofile{
//   public static Node main(String[] args) {
//     Scanner in = new Scanner (System.in);
//     int a[] = {1,2,3,4,5,6,7,8,9,0};
//     int max1,max2;
//     max1=max2=a[0];
//     for(int i=0;i<a.length;i++){
//       if(a[i] > max1){
//         max2=max1;
//         max1=a[i];
//       }
//       else if(a[i]>max2){
//         max2=a[i];
//       }
//     }
//     System.out.println("Second maximum element is "+max2);
//   }
// }



// import java.util.*;
// class emp{
//     String name;
//     long empid;
//     int age;
//     static String getname(String name){
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter the name: ");
//         return name = in.nextLine();
//     }
//     static long getempid(long empid){
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter empid");
//         return empid = in.nextLong();
//     }
//     static int getage(int age){
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter the age of employee ");
//         return age = in.nextInt();
//     }
// }
// public class neofile{
//     public static Node main(String[] args){
//         emp e1 = new emp();
//         e1.name = emp.getname(e1.name);
//         e1.empid = emp.getempid(e1.empid);
//         e1.age = emp.getage(e1.age);
//         emp e2 = new emp();
//         e2.name = emp.getname(e2.name);
//         e2.empid = emp.getempid(e2.empid);
//     }
// }



// import java.util.*;
// class emp{
//     String name;    
//     long empid;
//     int age;
//     String getname(String nm){
//     Scanner in = new Scanner (System.in); 
//     System.out.println("Enter the employee name : ");
//     this.name = nm;
//     return name = in.nextLine();
//    }
//    public long getempid(Long n){
//     Scanner in = new Scanner (System.in);
//     System.out.println("Enter the employee id ");
//     this.empid = n;
//     return n = in.nextLong();
//    }
//    public int getage(int a ){
//     Scanner in = new Scanner (System.in);
//     System.out.println("Enter the age of employee ");
//     this.age = a;
//     return a = in.nextInt();
//    }
//    public Node printdetails(){
//     System.out.println("Name: " + name);
//     System.out.println("Empid: "+empid);
//     System.out.println("Age: "+age);
//    }
// }
// public class neofile extends emp{
//     public static Node main(String[] args) {
//         emp e1 = new emp();
//         e1.name = e1.getname(e1.name);
//         e1.empid = e1.getempid(e1.empid);
//         e1.age = e1.getage(e1.age);
//         e1.printdetails();
//         emp e2 = new emp();
//         e2.name = e2.getname(e2.name);
//         e2.empid = e2.getempid(e2.empid);
//         e2.age = e2.getage(e2.age);
//         e2.printdetails();

//     }
// }

// import java.util.*;
// class employee{
//     String name ;
//     long empid ;
//     int age;
//     public employee (String nm ,long id ,int a ){
//         // Scanner in = new Scanner(System.in);
//         // this.name = nm;
//         // this.empid = id;
//         // this.age = a;
//         // System.out.print("Entrer employee name : ");
//         // nm = in.nextLine();
//         // System.out.print("Enter employee id : ");
//         // id = in.nextLong();
//         // System.out.print("Enter the age of the employee : ");
//         // a = in.nextInt();   
//         this.name = nm;
//         this.empid = id;
//         this.age = a;
//         System.out.println("hello sriyansu bhai");
//     }
//     public Node printempi(String name){
//         System.out.println(name);
//     }
//     public Node printempi(long empid){
//         System.out.println(empid);
//     }
//     public int age(){
//         return age ;
//     }
// }
// public class neofile{
//     public static Node main(String[] args) {
//         employee e1 = new employee("Sriyansu", 44, 19);
//         e1.printempi(e1.name);
//         e1.printempi(e1.empid);
//         System.out.println("The age of sriyanshu is "+e1.age());
//     }
// }


// import java.util.*;
// class Student {
//     String name;
//     Long regnum;
//     int section;
//     static String getname(String name){
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter student name : ");
//         return name = in.nextLine();
//     } 
//     static Long getregnum(Long reg){
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter Registrartion number of the Student ");
//         return reg = in.nextLong();
//     }
//     static int getsec(int section){
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the section of the sutudent ");
//         return section = in.nextInt();
//     }
// }
// public class neofile{
//     public static Node main(String[] args) {
//         for(int i=1;i<4;i++){
//         Student std = new Student();
//         std.name = Student.getname(std.name);
//         std.regnum = Student.getregnum(std.regnum);
//         std.section = Student.getsec(std.section);
//         }
//     }
// }

// import java.util.*;
// class Circle{
//     double radius;
//     public double area(){ 
//         return Math.PI*radius;
//     }
//      public double perimeter(){
//         return 2*Math.PI*radius;
//      }
//      public double circumference(){
//         return perimeter();
//      }
// }
// public class neofile{
//     public static Node main(String[] args) {
//         Circle c1 = new Circle();
//         Circle c2 = new Circle();
//         c1.radius=4;
//         System.out.println("Area "+c1.area());
//         System.out.println("Perimeter " +c1.perimeter());
//         System.out.println("Circumference "+c1.circumference());

//         c2.radius =5;
//         System.out.println("Area "+c2.area());
//         System.out.println("Perimeter " +c2.perimeter());
//         System.out.println("Circumference "+c2.circumference());
//     }
// }

// import java.util.*;
// class Rectangle {
//     double breadth,length;
//     public double Area(){
//         return breadth*length;
//     }
//     public double perimeter(){
//         return 2*(breadth+length);
//     }
//     public boolean isEqual(){
//         if(length==breadth){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
// }
// public class neofile{
//     public static Node main(String[] args) {
//         Rectangle r1 = new Rectangle();
//         Rectangle r2 = new Rectangle();
//         r1.breadth=5;
//         r1.length=5;
//         System.out.println("Area "+r1.Area());
//         System.out.println("Perimeter " +r1.perimeter());
//         System.out.println("Circumference "+r1.perimeter());
//         r2.breadth =5;  
//         r2.length =4;
//         System.out.println("Area "+r2.Area());
//         System.out.println("Perimeter " +r2.perimeter());
//         System.out.println("Circumference "+r2.perimeter());
//         System.out.println(r1.isEqual());
//     }
// }


// import java.util.*;
// class Base{
//     int x ;
//     public int getx(){
//         return x;
//     }
//     public Node setx(int x){
//         this.x = x;
//     }
//     Base(){
//         System.out.println("I am a constructor ");
//     }
// }
// class derive extends Base{
//     int y;
//     public int gety(){
//         return y;
//     }
//     public Node sety(int y){
//         this.y = y;
//     }
// }
// public class neofile {
//     public static Node main(String[] args) {
//       //  Base b = new Base();
//         derive d = new derive();
//         d.setx(5);
//         d.sety(5);
//        // System.out.println(d.getx());
//         System.out.println(d.gety());
//     }
// }


// import java.util.*;
// class Student {
//     String name ;
//     int age ;
//     public String getDetails(String nm){
//         this.name = nm;
//         return nm; 
//     }
//     public int getAge(int a){
//         this.age = a;
//         return a ;
//     }
// }
// class College extends Student{
//    int marks ;
//    public int getMarks(int m){
//     this.marks = m;
//    return m;
//    }
//    Node printDetails(){
//     System.out.println("Name of the student is "+name);
//     System.out.println("Age of the "+name+" is "+age);
//     System.out.println("Marks of the "+name+" is "+marks);
//    }
// }
// public class neofile{
//     public static Node main(String[] args){
//         Scanner in = new Scanner (System.in);
//         College s = new College();
//         System.out.print("Enter name of the Student : ");
//         s.getDetails(in.nextLine()) ;
//         System.out.print("Enter the age of the Student : ");
//         s.getAge(in.nextInt());
//         System.out.print("Enter the marks of the Student : ");
//         s.getMarks(in.nextInt());
//         // System.out.println(s.name);
//         // System.out.println(s.age);
//         // System.out.println(s.marks);
//         s.printDetails();
//     }
// }

// import java.util.*;
// class bsnum{
//     bsnum(){
//         System.out.println("This is base class constuctor ");
//     }
//     bsnum(int a){
//         System.out.println("The base class number is "+a);
//     }
// }
// class derive extends bsnum{
//     derive(){
//         //super(2);
//         System.out.println("This is derive class constuctor ");
//     }
//     derive(int b){
//      //   super();
//         System.out.println("The derive class number is "+b);
//     }
// }
// public class neofile{
//     public static Node main(String[] args) {
//        // derive obj = new derive();
//         derive obj1 = new derive(6);
//     }
// }

// import java.util.*;
// class One{
//     public Node greet(){
//         System.out.println("Good morning ");
//     }
//     public Node name(){
//         System.out.println("Turning on Phone..");
//     }
// }
// class Two extends One{
//     public Node Swagat(){
//         System.out.println("Aapka swagat hai ");
//     }
//     @Override
//     public Node name(){
//         System.out.println("Turning on Smartphone.....");
//     }
// }

// public class neofile{
//     public static Node main(String[] args) {
//         One obj = new Two();
//         obj.name(

//         );
//     }
// }

// import java.util.*;
// class Circle{
//   int radius;
//   Circle(){
//     System.out.println("This is non parameterized Constructor ");   
//   }
//   Circle(int a ){
//     System.out.println("This is a circle parameterized constructor ");
//     this.radius = a;
//   }
//   public double area(){
//     return Math.PI*radius*radius;
//   }
// }
//  class Cylinder1 extends Circle{
//     public int height;
//     Cylinder1(int a , int h){
//         super(a);
//         System.out.println("This is cylinder parameterized constructor ");
//         this.height = h;
//     }
   
//     double volume(){
//         return Math.PI*radius*radius;
//     }
//  }
//  public class neofile{
//     public static Node main(String[] args) {
//         Cylinder1 obj = new Cylinder1(12, 23);
//     }
//  }

// import java.util.*;
// class Circle {
//     int radius;
//     Circle(){
//         System.out.println("This is not a parameterized constructor in class Circle");
//     }
//     Circle(int a){
//         this.radius = a;
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the radius of the circle : ");
//         a = in.nextInt();
//         System.out.println("This is a parameterized Constructor in class Circle");
//     }
//     double area(){
//         return Math.PI*radius*radius;
//     }
// }

// class Cyl extends Circle{
//     double height;
//     Cyl(int a ,double h){
//         super(a);
//         this.height = h;
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the height of the cylinder : ");
//         h = in.nextDouble();
//         System.out.println("This is a prameterized Constructor in class Cylinder ");
//     }
//     double display(){
//         return Math.PI*this.radius*this.height;   
//     }
// }
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         Cyl obj = new Cyl(2,4);
//         System.out.println("Area of the circle is "+obj.area());
//         System.out.println("Area of the Cylinder is "+obj.display());
//     }
// }


// import java.util.*;
// //import CWH_JAVA.Abstract;
// abstract class Student{
//     String name ;
//     long roll ;
//     String section ;
//     Node getName(){
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the name of the student ");
//         name = in.nextLine();
//     }
//     abstract Node getRollnum();
//     abstract Node getSection();
// }
// class Cls extends Print{
//     Node getRollnum(){
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the roll num of the "+name+" ");
//         roll = in.nextLong();
//     }
// }
// abstract class Sec extends Student{
//     Node getSection(){
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter "+name+"'s section :");
//         section = in.nextLine();
//     }
//     abstract Node printDetails();
// }
// abstract class Print extends Sec{
//     Node printDetails(){
//         System.out.println("Name : "+name);
//         System.out.println("Roll number : "+roll);
//         System.out.println("Section : "+section);
//     }
// }
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         int n = in.nextInt();
//         Cls obj[] = new Cls[n];
//         for(int i=0;i<obj.length+1;i++){
//         obj[i].getName();
//         obj[i].getRollnum();
//         obj[i].getSection();
//         }
//         for(int i=1;i<obj.length+1;i++){
//             obj[i].printDetails();
//         }
//     }
// }

// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter weight : ");
//         double weight = in.nextDouble();
//         System.out.println("Enter height : ");
//         double h = in.nextDouble();
//         double bmi = (weight/(h*h));
//         System.out.println(bmi);
//         if(bmi<18.5){
//             System.out.println("Underweight");
//         }
//         else if(bmi>18.5 && bmi<24.9){
//             System.out.println("Normal Weight ");
//         }
//         else if(bmi<29.0 && bmi>25.0){
//             System.out.println("Overweight");
//         }
//         else if(bmi>=30.0){
//             System.out.println("Obese");
//         }
//         else{
//             System.out.println("Void");
//         }
//     }
// }


// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter a number : ");
//         int a = in.nextInt();
//         int num = a;
//         int s = 0 ,p = 1;
//         while(a>0){
//             int rem = a%10;
//             s+=rem;
//             p*=rem;
//             a/=10;
//         }
//         System.out.println("Sum of the digits is "+s);
//         System.out.println("Product of the digit is "+p);
//         if(s==p){
//             System.out.print(num+" is a spy number ");
//         }
//         else{
//             System.out.print(num+" is not a spy number ");
//         }
//     }
// }

// public class neofile{
//     public static Node main(String[] args) {
//         char [] a = {'c','a','r','b','o','n'};
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<a.length;j++){
//                 for(int k=0;k<a.length;k++){
//                     if(i!=j && i!=k && j!=i && j!=k && k!=i && k!=j){
//                         System.out.println(a[i]+""+a[j]+""+a[k]);
//                     }
//                 }
//             }
//         }
//         // System.out.println(a);
//     }
// }



// import java.util.*;
// public class neofile{
//     public static int sum_Of_Digits(int n){
//         int sum = 0;
//         while(n>0){
//             int rem = n%10;
//             sum+=rem;
//             n/=10;
//         }
//         n=sum;
        
//         while(n<9 && n>0){
//             int rem = n%10;
//             sum+=rem;
//             n/=10;
//         }
//         return sum;
//     }
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter a number : ");
//         int n = in.nextInt();
//         System.out.println("Te sum of digits in a single digit is "+sum_Of_Digits(n));
//     }
// }

// import java.util.*;
// public class neofile{
//     public static boolean isOdd (int a){
//         while(a>0){
//             if(a!=0){
//                 a-=2;
//             }
//         }
//         if((a & 1)==1){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter a number : ");
//         int a = in.nextInt();
//         System.out.println(a+" is a odd number "+isOdd(a));
//     }
// }
// import java.util.*;
// public class neofile{
//     public static boolean isOdd(int a ){
//         while(a>0){
//             if(a!=0){
//                 a-=2;
//             }
//         }
//         if((a & 1)==1){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     public static Node main(String[] args){
//         Scanner in = new Scanner (System.in);
//         int a = in.nextInt();
//         System.out.println(a+" is a odd number "+isOdd(a));
//     }
// }

// import java.util.*;
// public class neofile{
//     public static boolean isOdd(int a){
//         while(a>0){
//             if(a!=0){
//                 a-=2;
//             }
//         }
//         if((a&1)==1){
//             return true ;
//         }
//         else{
//             return false;
//         }
//     }
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter a number ");
//         int a = in.nextInt();
//         System.out.println(a+" is a odd number "+isOdd(a));
//     }
// }

// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         char [] a = {'c','a','r','b','o','n'};
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<a.length;j++){
//                 for(int k=0;k<a.length;k++){
//                     if(i!=k && i!=j && j!=k && j!=i && k!=i && k!=j){
//                         System.out.println(a[i]+""+a[j]+""+a[k]);
//                     }
//                 }
//             }
//         }
//     }
// }

// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter the number of element of Array : ");
//         int n = in.nextInt();
//         int a [] = new int[n];
//         System.out.println("Enter elements of the Array : ");
//         for(int i=0;i<n;i++){
//             a[i] = in.nextInt();
//         }
//         int max = a[0] , min = a[0];
//         int maxCount=1,minCount=1,maxFirst=0,minLast=0;
//         for(int i=1;i<a.length;i++){
//             if(a[i]>max){
//                 max=a[i];
//                 maxCount++;
//                 maxFirst=i;
//             }
//             else if(a[i]==max){
//                 maxCount++;
//                 if(a[i]<min){
//                     min = a[i];
//                     minCount++;
//                     minLast=i;
//                 }
//                 else if(a[i]==min){
//                     minCount++;
//                     minLast=i;
//                 }
//             }
//         }
//             System.out.println("Maximum value : "+max);
//             System.out.println("Minimum value : "+min);
//             System.out.println("Maximum count : "+maxCount);
//             System.out.println("Minimum count : "+minCount);
//             System.out.println("Maximum first element : "+maxFirst);
//             System.out.println("Minimum last element : "+minLast);        
//     }
// }


// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter the number of elements of Array ");
//         int n = in.nextInt();
//         int [] a = new int[n];
//         System.out.println("Enter the elements of The Array ");
//         for(int i=0;i<a.length;i++){
//             a[i] = in.nextInt();
//         }
//         int max = a[0] , min = a[0];
//         int maxCount=1,minCount=1,minLast=0,maxFirst=0;
//         for(int i=1;i<a.length;i++){
//             if(a[i]>max){
//                max=a[i];
//                maxFirst=i;
//             }
//             else if(a[i]==max){
//                maxCount++;
//                 if(a[i]<min){
//                     min=a[i];
//                     minCount++;
//                     minLast=i;
//                 }
//                 else if(a[i]==min){
//                     minCount++;
//                     minLast=i;
//                 }
//             }
//         }
//         System.out.println("Maximum value : "+max);
//         System.out.println("Minimum value : "+min);
//         System.out.println("Maximum count : "+maxCount);
//         System.out.println("Minimum count : "+minCount);
//         System.out.println("Maximum first element : "+maxFirst);
//         System.out.println("Minimum last element : "+minLast);
//     }
// }

// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.println("row ");
//         int r = in.nextInt();
//         System.out.println("Coloumn ");
//         int c = in.nextInt();
//         int [][] m = new int[r][c];
//         for(int i=1;i<r;i++){
//             for(int j=1;j<c;j++){
//                 System.out.print(i+","+j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// abstract class Std {
//     String name ;
//     Long roll;
//     int age ;
//     public String setname(){
//         return name ;
//     }
//     public Node getName(String n ){
//         this.name = n;
//     }
//     abstract int setroll();
//     abstract int setSec();
// }
// class Cls extends Std{
//     int roll;
//     int sec ;
//     public Node getroll(int r){
//         this.roll = r;
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the roll number of "+name+" : ");
      
//     }
//     public int setroll(){
//         return roll;
//     }
//     public Node getSec(int s){
//         this.sec = s;
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the section of the "+name+ " : ");
//         s = in.nextInt();
//     }
//     public int setSec(){
//         return sec;
//     }
//     // public Node input(){
//     // Scanner in = new Scanner (System.in);
//     // System.out.print("Enter the Name of the student : ");
//     // name = in.nextLine();
//     // System.out.print("Enter the roll number of the student : ");
//     // roll = in.nextInt();
//     // System.out.print("Enter the section of the student : ");
//     // sec = in.nextInt();
//     // }
//     public Node display(){
//         System.out.println("Name : "+name);
//         System.out.println("Roll number "+roll);
//         System.out.println("Section : "+sec);
//     }
// }
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         Cls obj = new Cls();
//         obj.getName(in.nextLine());
//         obj.getroll(in.nextInt());
//         obj.getSec(in.nextInt());
//         obj.display();
//     }
//} 


// import java.util.*;
// public class neofile {

// 	public static Node main(String[] args) {
// 	Scanner sc = new Scanner (System.in);
// 	System.out.println("Enter your lucky number");
// 	int n=sc.nextInt();
// 	try {
// 		if( n < 0 )
// 			throw new NumberFormatException(": Negative number");
// 		else 
// 			System.out.println("Your lucky number is "+n);
// 	}
// 	catch(NumberFormatException a) {
// 			System.out.println(a);
// 	}
// 	}

// }



// import java.util.*;
// class Student{
//     String name;
//     Long roll;
//     int marks;
//     public Node getDetails(){
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the name of the Student ");
//         name = in.nextLine();
//         System.out.print("Enter the roll number of "+name+" : ");
//         roll = in.nextLong();
//         System.out.print("Enter the marks of "+name+" : ");
//         marks = in.nextInt();
//     }
//     public Node setDetails(){
//         System.out.println("Name : "+name);
//         System.out.println("Rollno : "+roll);
//         System.out.println("Marks : "+marks);
//     }
// }
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter the number of Student : ");
//         int n = in.nextInt();
//         Student s[] = new Student[n];
//         int dsamark =0 ;
//         for(int i=0;i<s.length;i++){
//             s[i] = new Student();
//             s[i].getDetails();
//         }
//         for(int i=0;i<s.length;i++){
//             s[i].setDetails();
//            dsamark=s[0].marks;
//            if(s[i].marks>dsamark){
//             dsamark=s[i].marks;
//            }
//         }
//         for(int i=0;i<n;i++){
//             if(s[i].marks == dsamark){
//                 System.out.println("The name who secured highest marks is "+s[i].name+" & secured "+s[i].marks);
//             }
//         }
//     }
// }   

// public class neofile{
//     public static <p> Node printing(p a[]) {
//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i]+" ");
//         }
//         System.out.println();
//     }
//     // public static Node print(int a[]) {
//     //     for(int i=0;i<a.length;i++){
//     //         System.out.print(a[i]+" ");
//     //     }
//     // }
//     public static Node main(String[] args) {
//         String s[]={"Sriyanshu","utf"};
//          printing(s);
//         Integer a[]={1,2,3,4};
//         printing(a);
//         Double b[]={1.2,3.4,5.6};
//         printing(b);
//         Boolean c[]={true,false};
//         printing(c);
    

//     }
//     }


// interface Sriyansu{
// Node buysupra();
// Node buyM8();
// }
// class Bmw implements Sriyansu{
// public Node buysupra(){
// System.out.println("Sriyanshu bought Supra ");
// }
// public Node buyM8(){
// System.out.println("Sriyanshu bought m8 coupe");
// }
// }
// public class neofile{
//     public static Node main(String[] args) {
//         Bmw b1=new Bmw();
//         b1.buyM8();
//         b1.buysupra();
//     }
// }

// import java.util.*;
// class Phone{
//     int areacode;
//     int exchange ;
//     int number;
//     public Node input(){
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the areacode : ");
//         areacode = in.nextInt();
//         System.out.println("Enter the exchange code : " );
//         exchange = in.nextInt();
//         System.out.print("Enter the number : ");
//         number = in.nextInt();
//     }
//     public Node display(){
//         System.out.println("My number is ("+areacode+") "+exchange+"-"+number);
//     }
// }
// public class neofile{
//     public static Node main(String[] args) {
//         Phone p1 = new Phone();
//         p1.input();
//         p1.display();
//     }
// }


// import java.util.*;
// class Complex{
//     int real ;
//     int img;
//     public Node setdata(){
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter real number : ");
//         real = in.nextInt();
//         System.out.print("Enter imaginary number : ");
//         img = in.nextInt();
//     }
//     public Node display(){
//         System.out.println(real+" "+img);
//     }
//     public Complex add(Complex c1 ,Complex c2){
//         Complex c = new Complex();
//         c.real = c1.real+c2.real;
//         c.img = c1.img+c2.img;
//         return c;
//     }
// }
// public class neofile{
//     public static Node main(String[] args) {
//         Complex c1 = new Complex();
//         c1.setdata();
//         Complex c2 = new Complex();
//         c2.setdata();
//         Complex c = c2.add(c1,c2);
//         c.display();
        
//     }
// // }
// import java.util.*;
// class Complex{
//     int real;
//     int img;
//     public Node setData(){
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter real number : ");
//         real = in.nextInt();
//         System.out.print("Enter imaginary number : ");
//         img = in.nextInt();
//     }
//     public Node display(){
//         System.out.println(real+" "+img);
//     }
//     public Complex add (Complex c1, Complex c2){
//         Complex c = new Complex();
//         c.real = c1.real+c2.real;
//         c.img = c2.img+c2.img;
//         return c;
//     }
// }
// public class neofile{
//     public static Node main(String[] args) {
//         Complex c1 = new Complex();
//         c1.setData();
//         Complex c2 = new Complex();
//         c2.setData();
//         Complex c = c2.add(c1,c2);
//         c.display();
//     }
// }

// import java.util.*;
// public class neofile{
//     public static boolean isOdd(int a ){
//         while(a>0){
//             if(a!=0){
//                 a-=2;
//             }
//         }
//         if((a&1)==1){
//             return true ;
//         }
//         else{
//             return false;
//         }
//     }
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter a number : ");
//         int a = in.nextInt();
//         System.out.println(a+" is a odd number "+isOdd(a));
//     }
// }


// import java.util.*;
// public class neofile{
//     public static int sum_Of_Digits(int a){
//         int sum =0;
//         while(a>9){
//             while(a>0){
//                int rem = a%10;
//                sum+=rem;
//                a/=10;
//             }
//             a=sum;
//             sum=0;
//         }
//         return a;
//     }
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter a number : ");
//         int a = in.nextInt();
//         System.out.println("Sum of the digits is "+sum_Of_Digits(a));
//     }
// }


// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the number of elements of Array : ");
//         int n =in.nextInt();
//         System.out.println("Enter the elements of Array : ");
//         int a[] = new int[n];
//         for(int i=0;i<a.length;i++){
//             a[i] = in.nextInt();
//         }
//        int max = a[0];
//        int min = a[0];
//        int maxCount=1,minCount=1,maxFirst=0,minLast=1;
//        for(int i=0;i<a.length;i++){
//         if(a[i]>max){
//             maxFirst=i;
//             max=a[i];
//         }
//         else if(a[i]==max){
//             maxCount++;
//             if(a[i]<min){
//                 minLast=i;
//                 min = a[i];
//             }
//             else if(a[i]==min){
//                 minCount++;
//                 minLast=i;
//             }
//         }
//        }
//        System.out.println("Maximum value : "+max);
//        System.out.println("Minimum value : "+min);
//        System.out.println("Maximum count : "+maxCount);
//        System.out.println("Minimum count : "+minCount);
//        System.out.println("Maximum first element : "+maxFirst);
//        System.out.println("Minimum last element : "+minLast);
//     }
// }


// import java.util.*;
// public class neofile{
//     public static double sumColoumn(int [][] m ,int coloumnindex){
//         double sum =0;
//     for(int i=0;i<m.length;i++){
//             sum+=m[i][coloumnindex];
//         }
//         return sum;           
//     }
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the elements of row : ");
//         int r = in.nextInt();
//         System.out.print("Enter the elements of coloumn : ");
//         int c = in.nextInt();
//         System.out.println("Enter the elements of Matrix ");
//         int mat[][] = new int[r][c];
//         for(int i=0;i<mat.length;i++){
//             for(int j=0;j<mat[i].length;j++){
//                 mat[i][j] = in.nextInt();
//             }
//         }
//         System.out.println("Matrix is .....");
//         for(int i=0;i<mat.length;i++){
//             for(int j=0;j<mat.length;j++){
//                 System.out.print(mat[i][j]+" ");
//             }
//             System.out.println();
//         }
//         for(int i=0;i<mat.length;i++){
//             System.out.println("Sum of column "+i+" "+sumColoumn(mat, i));
//         }
//     }
// }


// import java.util.*;
// public class neofile{
//     public static double sumcoloumn(int [][] m ,int coloumnindex){
//         double sum=0;
//         for(int i=0;i<m.length;i++){
//             sum+=m[i][coloumnindex];
//         }
//         return sum;
//     }
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the elements of row : ");
//         int r = in.nextInt();
//         System.out.print("Enter the elemmets of coloumn : ");
//         int c = in.nextInt();
//         System.out.println("Enter the elements of matrix ");
//         int mat[][] = new int [r][c];
//         for(int i=0;i<mat.length;i++){
//             for(int j=0;j<mat.length;j++){
//                 mat[i][j] = in.nextInt();
//             }
//         }
//         for(int i=0;i<mat.length;i++){
//             for(int j=0;j<mat.length;j++){
//                 System.out.print(mat[i][j]+" ");
//             }       
//             System.out.println();
//         }
//         for(int i=0;i<mat.length;i++){
//             System.out.println("Sum of coloumn "+i+" "+sumcoloumn(mat, i));
//         }
//     }
// }

// import java.util.*;
// public class neofile {
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter how many lines you want to enter : ");
//         int n = in.nextInt();
//         System.out.println("Enter Lines : ");
//         String[] str = new String[n];
//         for(int i=0;i<n;i++){
//             str[i] = in.nextLine();
//         } 
//         for(int i=n-1;i>=0;i--){
//             System.out.println(str[i]);
//         }
//     }
// }
// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter the lines you want to enter : ");
//         int n = in.nextInt();
//         System.out.println("Enter the lines .....");
//         String st [] = new String[n];
//         for(int i=0;i<st.length;i++){
//             st[i] = in.nextLine();
//         }
//         for(int i=n-1;i>=0;i++){
//             System.out.println(st[i]);
//         }
//     }
// }

// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the elements of Array A : ");
//         int n = in.nextInt();
//         System.out.println("Enter the element of Array A ");
//         int a[] = new int [n];
//         for(int i=0;i<n;i++){
//             a[i] = in.nextInt();
//         }
//         System.out.print("Enter the elements of Array B : ");
//         int m = in.nextInt();
//         System.out.println("Enter the element of Array B : ");
//         int b[] = new int [m];
//         for(int i=0;i<n;i++){
//             b[i] = in.nextInt();
//         }
//         int c[] = new int [a.length];
//         System.out.println("Product is : ");
//         for(int i=0;i<a.length;i++){
//             c[i]=a[i]*b[i];
//         }
//         for(int i=0;i<a.length;i++){
//             System.out.print(c[i]+" ");
//         }
//     }
// // }

// import java.util.*;
// class New{
//     String name ;
//     int section ;
//     Long registrationnum;
//      New(String nm,int sec, long regnum ){
//         this.name = nm;
//         this.registrationnum = regnum;
//         this.section = sec;        
//     }
//     Node Display(){
//         System.out.println("The name is "+name);
//         System.out.println("Section is "+section);
//         System.out.println("Registration Number is "+registrationnum);
//     }
// }
// public class neofile{
//     public static Node main(String...args){
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter name : ");
//         String name = in.next();
//         System.out.print("Enter section : ");
//         int sec = in.nextInt();
//         System.out.print("Enter registration number : ");
//         Long reg = in.nextLong();
//         New c1 = new New(name ,sec , reg);
//         c1.Display();
//     }


// import java.util.*;
// class Node{
//     protected int reg_num;
//     protected float mark;
//     protected Node next;
// }
// public class neofile{
//     public static Node create (Node start){
//         Scanner in = new Scanner (System.in);
//         char ch = 0;
//         do{
//             Node nd = new Node();
//             System.out.print("Enter the registration number : ");
//             nd.reg_num = in.nextInt();
//             System.out.print("Enter the marks : ");
//             nd.mark = in.nextFloat();
//             nd.next = null;
//             if(start == null){
//                 start = nd;
//             }
//             else{
//                 Node temp = start ;
//                 while(temp.next != null){
//                     temp = temp.next;
//                 }
//                 temp.next = nd;
//             }
//             System.out.println("Do you want to add new Node ? (y/n )");
//         }while(ch == 'y');
//         ch = in.next().charAt(0);
//     }
//     public static Node display(Node start){
//         Node temp = start;
//         while(temp != null){
//         System.out.println("Registration number : "+temp.reg_num);
//         System.out.println("Mark is "+temp.mark);
//         break;
//         }
//     }
//     public static Node main(String[] args) {
//         Node start = new Node();
//         Scanner in = new Scanner (System.in);
//         while(true){
//             System.out.println("****MENU*****");
// 			System.out.println("0:Exit");
// 			System.out.println("1:Creation");
// 			System.out.println("2:Display");
// 			System.out.println("Enter the choice");
//             int choice = in.nextInt();
//             switch(choice){
//                 case 0 : 
//                 System.exit(0);
//                 case 1 : 
//                 create(start);
//                 case 2 : 
//                 display(start);
//                 default : 
//                 System.out.println("Wrong choice");
//             }
//             break;
//         }
//     }
// }

// import java.util.*;

// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         Arraylist<String> cars = new Arraylist<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Mercedese Benz ");
//         cars.add("Lamborghini");
//         System.out.println(cars);
//     }
//}


// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter your lucky number : ");
//         int n = in.nextInt();
//         try{
//             if(n<0){
//                 throw new NumberFormatException("Negetive number ");
//             }
//             else{
//                 System.out.println("My lucky number is "+n);
//             }
//         }catch(NumberFormatException s){
//             System.out.println(s);
//         }

//     }
// }

// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter the number of elements of Array : ");
//         int n = in.nextInt();
//         System.out.println("Enter the elements of Array : ");
//         String ar[] = new String[n];
//         for(int i=0;i<n;i++){
//             ar[i] = in.next();
//         }
//         try{
//             int j = Integer.parseInt(ar[0]);
//         }catch(NumberFormatException S){
//             System.out.println(S);
//         }
//         try{
//             ar[n+1]="Violet";
//         }catch(ArrayIndexOutOfBoundsException p){
//             System.out.println(p);
//         }
//         System.out.println("Enter colors are : ");
//         for(int i=0;i<ar.length;i++){
//             System.out.println(ar[i]);
//         }
//     }
// }

// import java.util.*;
// class Student{
//     String name;
//     int mark;
// }
// class MarksOutOfBoundException extends Exception{
//     MarksOutOfBoundException(String s){
//     super(s);
//     System.out.println(s);
//     }
// }
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         Student s1 = new Student();
//         // System.out.println("Enter the name of the Student : ");
//         // s1.name = in.next();
//         // System.out.println("Enter the mark of "+s1.name+" : ");
//         // s1.mark = in.nextInt();
//         s1.name = "Sriyansu";
//         s1.mark = -882;
//         try{
//             if(s1.mark>100 && s1.mark<0){
//                 throw new MarksOutOfBoundException("Invalid Entries ");
//             }
//             else{
//                 System.out.println("Mark of "+s1.name+" is "+s1.mark);
//             }
//         }catch(MarksOutOfBoundException s){
//             System.out.println(s);
//         }
//     }



// import java.util.*;
// class Student{
//     String name ;
//     int marks;
// }
// class MarksOutOfBoundException extends Exception{
//     MarksOutOfBoundException(String s){
//         super(s);
//     }
// }
// public class neofile{
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         Student s1 = new Student();
//         System.out.print("Enter the name of the student : ");
//         s1.name = in.next();
//         System.out.println("Enter the mark of "+s1.name+" : ");
//         s1.marks = in.nextInt();
//         try{
//             if(s1.marks > 100 )
//             throw new MarksOutOfBoundException("Invalid Number ");
//         }catch(MarksOutOfBoundException q){
//             System.out.println(q);
//         }
//     }
// }


// import java.util.*;
// public class neofile{
//     public static Node main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         list.add(12);
//         list.add(123);
//         list.add(1234);
//         list.add(1345);
//         list.add(12356);
//         list.add(1234567);
//         list2.add(9);
//         list2.add(89);
//         list2.add(789);
//         list2.add(6789);
//         list2.add(56789);
//         list2.add(456789);
//         list2.addAll(0, list);
//     for(int i=0;i<list2.size();i++){
//             System.out.println(list2.get(i));
//         }
//     }
// }


// import java.util.*;
// class Node{
//     int reg_num;
//     float mark;
//     Node next;
// }
// public class neofile{
//     public static Node create (Node start){
//         Scanner in = new Scanner (System.in);
//         Node nd = new Node();
//         char ch = 0;
//         do{
//             System.out.print("Enter the registration number : ");
//             nd.reg_num = in.nextInt();
//             System.out.print("Enter the mark : ");
//             nd.mark = in.nextFloat();
//             if(start == null){
//             start = nd ;
//             }
//             else{
//             Node temp = start;
//             while(temp.next != null){
//                 temp = temp.next;
//                 }
//                 temp.next=nd;
//             }
//             System.out.println("\nDo you want to enter more data? y/n");
//         }while(ch =='y');
//         ch = in.next().charAt(0);
//     }
//     public static Node display(Node start){
//         Node temp = start;
//         while(temp != null){
//             System.out.printf("%d %f\t",temp.reg_num,temp
//             .mark);
//         }
//     }
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         Node start = new Node();
//         while(true){
//             System.out.println("****MENU*****");
// 			System.out.println("0:Exit");
// 			System.out.println("1:Creation");
// 			System.out.println("2:Display");
// 			System.out.println("Enter the choice");
//             int choice = in.nextInt();
//             switch(choice){
//                 case 0 : 
//                 System.exit(0);
//                 case 1 : 
//                 create(start);
//                 case 2 : 
//                 display(start);
//                 break;
//                 default : 
//                 System.out.println("You entered \"Wrong Choice \" ");
//             }
//             break;
//         }
//     }
// }


// import java.util.*;
// public class neofile{
//     public static long fact(Long a){
//         if(a==0 || a==1){
//             return 1;
//         }
//         else{
//             return a*fact(a-1);
//         }
//     }
//     public static double power(Long a , Long b){
//        double pow =1;
//        if(b == 0 ){
//         return 1;
//        }
//        pow = Math.pow(a, b);
//        return pow;
//     }
//     public static long GCD(Long a , long b){
//         while(a%b != 0){
//             Long rem = a%b ;
//             a=b;
//             b=rem;
//         }
//         return b;
//     }
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter 1st number : ");
//         long a = in.nextLong();
//         System.out.print("Enter the 2nd number : ");
//         long b = in.nextLong();
//         System.out.println("Factorial : "+fact(a));
//         System.out.println("Power : "+power(a, b));
//         System.out.println("GCD "+GCD(a, b));
//         System.out.println("The binary format of "+a+" is "+((byte)a));
//         System.out.println("Product of two numbers : "+(a*b));
//     }
// }



// import java.util.*;
// public class neofile{
//     public static int reverse(int n , int rev){
//         if(n==0)
//         return rev;
//         else
//             return reverse(n/10, rev = (rev*10)+(n%10));
       
//     }
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter a number : ");
//         int a = in.nextInt();
//         System.out.println(reverse(a, 0));
//     }
// }

// import java.util.*;
// public class neofile {
// public  static int fibo(int n) {
// 	if(n==0||n==1)return n;
// 	return fibo(n-1)+fibo(n-2);
// }
// 	public static Node main(String[] args) {
// 		Scanner sc = new Scanner (System.in);
// 		System.out.println("Enter a number ");
// 		int n=sc.nextInt();
// 		System.out.println("The fibonacci series  of "+n+" is "+fibo(n));

// 	}
// }


// import java.util.*;
// public class neofile {
// public static String reverse(String s,String ans) {
// 	if(s.length()==0)return ans;
// 	return reverse(s.substring(0,s.length()-1),ans+s.charAt(s.length()-1));
// }
// 	public static Node main(String[] args) {
// 		Scanner sc = new Scanner (System.in);
// 		System.out.println("Enter a String ");
// 		String s=sc.next();
// 		System.out.println("the reverse of  given string is "+reverse(s,""));
// 	}

// }

// import java.util.*;
// class Bank{
//     String name ;
//     int acc;
//     long blnc;
//     int w;
// }
// class InvalidBalanceException extends Exception{
//     public InvalidBalanceException(String s){
//         super(s);
//     }
// }
// public class neofile{
//     public static Node main(String[] args) {
//         Bank n = new Bank();
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the name : ");
//         n.name = in.next();
//         System.out.print("Enter Account number : ");
//         n.acc = in.nextInt();
//         System.out.print("Enter the Balance : ");
//         n.blnc = in.nextInt();
//         System.out.print("Enter the Money you want to withdraw : ");
//         n.w = in.nextInt();
//         try{
//             if((n.blnc-n.w)<0){
//                 throw new InvalidBalanceException("Balance cant be less than 0 ");
//             }
//             else{
//                 System.out.println("Remaining balance is : "+(n.blnc - n.w));
//             }
//         }catch(InvalidBalanceException s){
//             System.out.println(s);
//         }
//     }
// }

// import java.util.*;
// public class neofile{
//     public static int BinSer(int ar[] , int x){
//         int mid = (ar[0]+ar.length-1)/2;
//         if(ar[mid]==x){
//             return mid;
//         }
//         else if(ar[mid]<x){
//             ar[mid] = ar[mid+1];
//             return BinSer(ar, x);
//         }
//         else{
//             ar[mid]=ar[mid-1];
//             return BinSer(ar, x);
//         }
//     }
//     public static Node main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter the number of element of Array : ");
//         int n = in.nextInt();
//         System.out.println("Enter the element of Array : ");
//         int ar []=new int [n];
//         for(int i=0 ;i<ar.length;i++){
//             ar[i]=in.nextInt();
//         }
//         System.out.print("Enter the element you want to search : ");
//         int a = in.nextInt();
//        System.out.println(BinSer(ar, a));
//     }
// }

  
// public class neofile {
//     public static int binarySearch(int[] arr, int target) {
//         return binarySearchRecursive(arr, target, 0, arr.length - 1);
//     }

//     private static int binarySearchRecursive(int[] arr, int target, int low, int high) {
//         if (low > high) {
//             return -1; // Target element not found
//         }

//         int mid = low + (high - low) / 2;

//         if (arr[mid] == target) {
//             return mid; // Target element found at mid index
//         } else if (arr[mid] > target) {
//             return binarySearchRecursive(arr, target, low, mid - 1); // Target element is in the left half
//         } else {
//             return binarySearchRecursive(arr, target, mid + 1, high); // Target element is in the right half
//         }
//     }

//     public static Node main(String[] args) {
//         int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
//         int target = 199;

//         int index = binarySearch(arr, target);

//         if (index != -1) {
//             System.out.println("Element found at index " + index);
//         } else {
//             System.out.println("Element not found in the array");
//         }
//     }
// }


// import java.util.*;
// class Node
// {
// 	protected int regd_no;
// 	protected float mark;
// 	protected Node next;
// }
// public class neofile {
//     public static Node create(Node start)
//     {
//     	Node last = null;
//     	Scanner sc = new Scanner(System.in);
//     	char ch;
//     	do
//     	{
//     		System.out.println("Enter the registration number of new node: ");
//     		int regd_no = sc.nextInt();
//     		System.out.println("Enter the roll number of node: ");
//     		float mark = sc.nextFloat();
//     		Node node = new Node();
//     		node.regd_no = regd_no;
//     		node.mark = mark;
//     		node.next = null;
//     		if(start == null)
//     		{
//     			start = node;
//     			last = node;
//     		}
//     		else
//     		{
//     			last.next = node;
//     			last = node;
//     		}
//     		System.out.println("Do you want to create another node: ");
//         	ch = sc.next().charAt(0);
//     	}while(ch=='Y'||ch=='y');
//     	return start;
//     }
//     public static Node display(Node start)
//     {
//     	Node p = start;
//     	System.out.println("Regis. no \t Marks");
//     	while(p!=null)
//     	{
//     		System.out.println(p.regd_no+" \t\t "+p.mark);
//     		p = p.next;
//     	}
//     }
//     public static Node InsBeg(Node start)
//     {
//     	Scanner sc = new Scanner(System.in);
//     	System.out.println("Enter the registration number of new node: ");
// 		int regd_no = sc.nextInt();
// 		System.out.println("Enter the roll number of node: ");
// 		float mark = sc.nextFloat();
// 		Node node = new Node();
// 		node.regd_no = regd_no;
// 		node.mark = mark;
// 		node.next = start;
// 		start = node;
//     	return start;
//     }
//     public static Node InsEnd(Node start)
//     {
//     	Scanner sc = new Scanner(System.in);
//     	System.out.println("Enter the registration number of new node: ");
// 		int regd_no = sc.nextInt();
// 		System.out.println("Enter the roll number of node: ");
// 		float mark = sc.nextFloat();
// 		Node node = new Node();
// 		node.regd_no = regd_no;
// 		node.mark = mark;
// 		node.next = null;
// 		Node q = start;
// 		while(q.next!=null)
// 		{
// 			q = q.next;
// 		}
// 		q.next = node;
//     	return start;
//     }
//     public static Node InsAny(Node start)
//     {
//     	Scanner sc = new Scanner(System.in);
//     	System.out.println("Enter the registration number of new node: ");
// 		int regd_no = sc.nextInt();
// 		System.out.println("Enter the roll number of node: ");
// 		float mark = sc.nextFloat();
// 		Node node = new Node();
// 		node.regd_no = regd_no;
// 		node.mark = mark;
// 		System.out.println("Enter position of new node: ");
//         int pos = sc.nextInt();	
//         if(start == null)
//         {
//         	start = node;
//         	node.next = null;
//         	System.out.println("Node add first position: ");
//         }
//         else if(pos>count(start))
//         {
//         	Node q = start;
//         	while(q.next!=null)
//     		{
//     			q = q.next;
//     		}
//         	q.next = node;
//         	node.next = null;
//         	System.out.println("position not found, so ne Node add last position: ");
//         }
//         else
//         {
//         	Node q = start;
//         	for(int i=1;i<pos-1;i++)
//         	{
//         		q = q.next;
//         	}
//         	node.next = q.next;
//         	q.next = node;
//         	System.out.println("New node add "+pos+" position");
//         }
//     	return start;
//     }
//     public static Node DelBeg(Node start)
//     {
//     	if(start==null)
//     	{
//     		System.out.println("Empty linked list, delete not possible");
//     	}
//     	else
//     	{
//     		Node q = start;
//     		start = start.next;
//     		System.out.println("Deleted node info-- registration no: "+q.regd_no+" and mark: "+q.mark);
//     	}
//     	return start;
//     }
//     public static Node DelEnd(Node start)
//     {
//     	if(start==null)
//     	{
//     		System.out.println("Empty linked list, delete not possible");
//     	}
//     	else
//     	{
//     		Node q = start;
//     		Node r = start;
//     		while(q.next!=null)
//     		{
//     			r = q;
//     			q = q.next;
//     		}
//     		r.next = null;
//     		System.out.println("Deleted node info-- registration no: "+q.regd_no+" and mark: "+q.mark);
//     	}
//     	return start;
//     }
//     public static Node DelAny(Node start)
//     {
//     	Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter position of deleted node: ");
//         int pos = sc.nextInt();	
//         if(start == null)
//         {
//         	System.out.println("Empty linkedlist, delete not posible");
//         }
//         else if(pos>count(start))
//         {
//         	System.out.println("position not found, delete not posible ");
//         }
//         else
//         {
//         	Node q = start;
//         	Node r = start;
//         	for(int i=1;i<pos;i++)
//         	{
//         		r = q;
//         		q = q.next;
//         	}
//         	r.next = q.next;
//         	System.out.println("Deleted node info-- registration no: "+q.regd_no+" and mark: "+q.mark);
//         }
//     	return start;
//     }
//     public static Node DelNode_regNumber(Node start)
//     {
//     	Scanner sc = new Scanner(System.in);
//     	System.out.println("Enter the student registration no: ");
//     	int regno = sc.nextInt();
//     	Node q = start;
//     	int f = 0;
//     	if(q.regd_no == regno && q == start)
//     	{
//     		start = start.next;
//     		f = 1;
//     		System.out.println("Deleted node info-- registration no: "+q.regd_no+" and mark: "+q.mark);
//     	}
//     	else
//     	{
//     		Node p = q;
//     		q = q.next;
//     		while(q!=null)
//     		{
//     			if(q.regd_no == regno)
//     			{
//     				p.next = q.next;
//     				System.out.println("Deleted node info-- registration no: "+q.regd_no+" and mark: "+q.mark);
//     				f = 1;
//     				break;
//     			}
//     			p = q;
//     			q = q.next;
//     		}
//     	}
//     	if(f==0)
//     	{
//     		System.out.println("Error: registration number not found");
//     	}
//     	return start;
//     }
//     public static int count(Node start)
//     {
//     	int c = 0;
//     	Node q = start;
//     	while(q!=null)
//     	{
//     		c++;
//     		q=q.next;
//     	}
//     	return c;
//     }
//     public static Node search(Node start)
//     {
//     	int f = 0;
//     	Scanner sc = new Scanner(System.in);
//     	System.out.println("Enter the student registration no: ");
//     	int regno = sc.nextInt();
//     	Node q = start;
//     	while(q!=null)
//     	{
//     		if(q.regd_no == regno)
//     		{
//     			System.out.println("Registration number found, enter the updated marks: ");
//     			float m = sc.nextFloat();
//     			q.mark = m;
//     			System.out.println(m+" marks updated at registration no. "+regno);
//     			f = 0;
//     			break;
//     		}
//     		q=q.next;
//     	}
//     	if(f==0)
//     	{
//     		System.out.println("Error: registration number not found");
//     	}
//     }
//     public static Node reverse(Node start)
//     {
//     	Node q = start.next;
//     	Node p = start.next;
//     	start.next = null;
//     	while(q!=null)
//     	{
//     		p = q;
//     		q = q.next;
//     		p.next = start;
//     		start = p;
//     	}
//     	System.out.println("Linkedlist reversed");
//     	return start;
//     }
//     public static Node sort(Node start)
//     {
//     	Node m = start;
//     	while(m.next!=null)
//     	{
//     		Node q = start;
//     		Node p = q.next;
//     		while(p!=null)
//     		{
//     			if(q.mark<p.mark)
//     			{
//     				int reg = q.regd_no;
//     				float mark= q.mark;
//     				q.regd_no = p.regd_no;
//     				q.mark = p.mark;
//     				p.regd_no = reg;
//     				p.mark = mark;
//     			}
//     			q = p;
//     			p = p.next;
//     		}
//     		m = m.next;
//     	}
//     	System.out.println("Linkedlist sorted based on marks");
//     	return start;
//     }
// 	public static Node main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		Node start = null;
// 		System.out.println("Program for creating single linkedlist");
// 		while(true)
// 		{
// 			System.out.println("Manu for different operation");
// 			System.out.println("Press 0: Exit");
// 			System.out.println("Press 1: Creation Linkedlist");
// 			System.out.println("Press 2: Display Linkedlist");
// 			System.out.println("Press 3: Add node at begining");
// 			System.out.println("Press 4: Add node at end");
// 			System.out.println("Press 5: Add node at any position");
// 			System.out.println("Press 6: Delete first node");
// 			System.out.println("Press 7: Delete last node");
// 			System.out.println("Press 8: Delete node from any position");
// 			System.out.println("Press 9: Delete node based on registration no.");
// 			System.out.println("Press 10: count of linkedlist");
// 			System.out.println("Press 11: search a node from linkedlist");
// 			System.out.println("Press 12: sort the linkedlist");
// 			System.out.println("Press 13: reverse the linkedlist");
// 			System.out.println("Enter your choice: ");
// 			int choice = sc.nextInt();
// 			switch(choice)
// 			{
// 			case 0: System.exit(0);
// 			case 1: start = create(start);
// 			        break;
// 			case 2: display(start);
// 			        break;
// 			case 3: start = InsBeg(start);
// 	        		break;
// 			case 4: start = InsEnd(start);
// 	        		break;
// 			case 5: start = InsAny(start);
// 			        break;
// 			case 6: start = DelBeg(start);
// 	        		break;
// 			case 7: start = DelEnd(start);
// 	        		break;
// 			case 8: start = DelAny(start);
// 					break;
// 			case 9: start = DelNode_regNumber(start);
// 					break;
// 			case 10: int c = count(start);
// 					System.out.println("Number of node in linked is: "+c);
// 					break;
// 			case 11: search(start);
// 					break;
// 			case 12: start = sort(start);
// 					break;
// 			case 13: start = reverse(start);
// 					break;
// 			default: System.out.println("Wrong choice, try again");
// 			}
// 		}
// 	}
// }


// import java.util.Scanner;
// class Node
// {
// 	int info;
// 	Node next;
// }
// public class neofile {
// 	public static Node push(Node top)
// 	{
// 		Scanner sc = new Scanner(System.in);
//     	System.out.println("Enter the number of new node: ");
// 		int data = sc.nextInt();
// 		Node node = new Node();
// 		node.info = data;
// 		node.next = top;
// 		top = node;
// 		return top;
// 	}
// 	public static Node pop(Node top)
// 	{
// 		if(top==null)
//     	{
//     		System.out.println("Stack underflow, delete not possible");
//     	}
//     	else
//     	{
//     		Node q = top;
//     		top = top.next;
//     		System.out.println("Deleted node info-- data value: "+q.info);
//     	}
// 		return top;
// 	}
// 	public static Node display(Node top)
//     {
//     	Node p = top;
//     	if(top==null)
//     	{
//     		System.out.println("Stack underflow");
//     	}
//     	else
//     	{
//     		System.out.println("Node details: \t value");
//     		while(p!=null)
//     		{
//     			System.out.println(" \t\t "+p.info);
//     			p = p.next;
//     		}
//     	}
//     }
// 	public static Node main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		Node top = null;
// 		System.out.println("Program for creating single linkedlist");
// 		while(true)
// 		{
// 			System.out.println("Manu for different operation");
// 			System.out.println("Press 0: Exit");
// 			System.out.println("Press 1: push");
// 			System.out.println("Press 2: pop");
// 			System.out.println("Press 3: display");
// 			System.out.println("Enter your choice: ");
// 			int choice = sc.nextInt();
// 			switch(choice)
// 			{
// 				case 0: System.exit(0);
// 				case 1: top = push(top);
// 			        	break;
// 				case 2: top = pop(top);
// 			        	break;
// 				case 3: display(top);
// 	        			break;
// 				default: System.out.println("Wrong choice, try again");
// 			}
// 		}
// 	}
// }


// import java.util.*;
// public class neofile
// {
//     public static boolean isPalindrome(String s)
//     {
//         if (s.length() <= 1)
//             return true; 
//         char firstChar = Character.toLowerCase(s.charAt(0));
//         char lastChar = Character.toLowerCase(s.charAt(s.length() - 1));
//         if (firstChar != lastChar) 
//             return false; 
//         String subString = s.substring(1, s.length() - 1);
//         return isPalindrome(subString);
//     }
//     public static Node main(String[] args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the String : ");
//         String s1 = sc.nextLine();
//         System.out.println(s1 + " is a palindrome: " + isPalindrome(s1));
//     }
// }

// import java.util.*;
// public class neofile 
// {
//     public static Node rearrangeArray(int[] arr, int k) 
//     {
//         rearrangeArrayRecursive(arr, k, 0, arr.length - 1);
//     }
//     public static Node rearrangeArrayRecursive(int[] arr, int k, int left, int right) 
//     {
//         if (left >= right) 
//             return; 
//         int pivotIndex = partition(arr, k, left, right);
//         rearrangeArrayRecursive(arr, k, left, pivotIndex - 1);
//         rearrangeArrayRecursive(arr, k, pivotIndex + 1, right);
//     }
//     public static int partition(int[] arr, int k, int left, int right) 
//     {
//         int pivot = arr[right];
//         int i = left - 1;
//         for (int j = left; j < right; j++) 
//         {
//             if (arr[j] <= k) 
//             {
//                 i++;
//                 swap(arr, i, j);
//             }
//         }
//         swap(arr, i + 1, right);
//         return i + 1;
//     }
//     public static Node swap(int[] arr, int i, int j) 
//     {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
//     public static Node main(String[] args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the Range of the Array : ");
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         System.out.print("Enter the Elements in Array : ");
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         System.out.print("Enter the Value Of 'K' : ");
//         int k = sc.nextInt();
//         rearrangeArray(arr, k);
//         System.out.println("Rearranged Array: ");
//         for(int i=0;i<n;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// public class neofile
// {
// 	static Node towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod)
// 	{
// 		if (n == 1)
// 		{
// 			System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
// 			return;
// 		}
// 		towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
// 		System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
// 		towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
// 	}
// 	public static Node main(String args[])
// 	{
// 		int n = 4; 
// 		towerOfHanoi(n, 'A', 'C','B');
// 	}
// }

// import java.util.*;
// public class neofile{
// 	public static Node main(String[] args) {
// 		Scanner in = new Scanner (System.in);
// 		ArrayList<String> n = new ArrayList<>();
// 		n.add("Apple");
// 		n.add("Samsung");
// 		n.add("Google");
// 		n.add("IQOO");
// 		n.add("REALME");
// 		n.add("Vivo");
// 		n.add("Oppo");
// 		n.add("Asus");
// 		n.add("Oneplus");
// 		n.add(3,"Nothing");
// 		n.add("Xiaomi");
// 		n.set(0, "IPhone");
// 		Collections.sort(n);
// 		for(String i : n)
// 		System.out.println(i);
// 	}
// }


// import java.util.*;
// class Node{
// 	protected int reg_num;
// 	protected float mark;
// 	protected Node next;
// }
// public class neofile{
// 	public static Node creation(Node start){
// 		//Node last = null;
// 		Scanner in = new Scanner (System.in);
// 		char ch = 0;
// 		do{
// 			Node newNode = new Node();
// 			System.out.print("Enter the registration number : ");
// 			newNode.reg_num = in.nextInt();
// 			System.out.print("Enter mark : ");
// 			newNode.mark = in.nextFloat();
// 			newNode.next=null;
// 			if(start == null){
// 				start = newNode;
// 			}
// 			else{
// 				Node temp = start;
// 				while(temp.next != null){
// 					temp = temp.next;
// 				}
// 				temp.next = newNode;
// 			}
// 			System.out.print("Do you want to add more Node :(y/n)");
// 			ch = in.next().charAt(0);
// 		}while(ch=='Y'|| ch=='y');
// 	}
// 	public static Node display(Node start){
		
// 	}
// 	public static Node InsBeg(Node start){
// 		Scanner in = new Scanner (System.in);
// 		Node insNode = new Node();
// 		System.out.println("Enter the registration numebr : ");
// 		insNode.reg_num = in.nextInt();
// 		System.out.println("Enter the mark : ");
// 		insNode.mark = in.nextFloat();
// 		insNode.next = start;
// 		start = insNode;
// 		return start;
// 	}
// 	public static Node main(String[] args) {
// 		Scanner in = new Scanner (System.in);
// 		Node start = null;
// 		System.out.println("0.Exit");
// 		System.out.println("1.Creation");
// 		System.out.println("2.Deletion");
// 		System.out.println("3.Insertion");
// 		System.out.println("Enter your choice : ");
// 		int choice = in.nextInt();
// 		switch(choice){
// 			case 0 : 
// 			System.exit(0);
// 			break;
// 			case 1: 
// 			creation(start);
// 			break;
// 			case 2:
// 			display(start);
// 			break;
// 			case 3:
// 			InsBeg(start);
// 			break;
// 		}
// 	}
// }

// import java.util.*;
// class Node{
// 	protected int reg_num;
// 	protected float mark;
// 	protected Node next;
// }
// public class neofile{
// 	public static Node create(Node start){
// 		char ch = 0;
// 		Scanner in = new Scanner (System.in);
// 		do{
// 		Node newNode = new Node();
// 		System.out.print("Enter the registration number : ");
// 		newNode.reg_num = in.nextInt();
// 		System.out.print("Enter the mark : ");
// 		newNode.mark = in.nextFloat();
// 		if(start == null){
// 			start = newNode;
// 		}
// 		else{
// 			Node temp = start;
// 			while(temp.next != null){
// 				temp = temp.next;
// 			}
// 			temp.next = newNode;
// 		}
// 		System.out.println("Do you wnat to add more ? (y/n)");
// 		ch = in.next().charAt(0);
// 	}while(ch == 'y'|| ch =='Y');
// }
// 	public static Node display(Node start){
// 		Node temp = start;
// 		while(temp!=null){
// 			System.out.println("Registration number : "+temp.reg_num);
// 			System.out.println("Marks : "+temp.mark);
// 			temp = temp.next;
// 		}
	
// 	}
// 	public static Node insbeg(Node start){
// 		Scanner in = new Scanner (System.in);
// 		Node newNode = new Node();
// 		System.out.print("Enter the regnum :");
// 		newNode.reg_num = in.nextInt();
// 		System.out.println("Enter marks : ");
// 		newNode.mark = in.nextFloat();
// 		if(start==null){
// 			start = newNode;
// 		}
// 		else{
// 			start.next = start;
// 			start = newNode;
// 		}
// 		return start;
		
// 	}
// 	public static Node InsLast(Node start){
// 		Scanner in = new Scanner (System.in);
// 		Node nxt = new Node();
// 		System.out.print("Enter the registratio number : ");
// 		nxt.reg_num = in.nextInt();
// 		System.out.print("Enter the mark : ");
// 		nxt.mark = in.nextFloat();
// 		Node temp = start;
// 		while(temp.next!=null){
// 			temp = temp.next;
// 		}
// 		temp = start;
// 		return start;
// 	}
// 	public static Node InsAny(Node start){
// 		Scanner in = new Scanner (System.in);
// 		Node nxt = new Node();
// 		System.out.print("Enter the REG num : ");
// 		nxt.reg_num = in.nextInt();
// 		System.out.print("Enter mark : ");
// 		nxt.mark= in.nextFloat();
// 		System.out.println("Enter position : ");
// 		int pos = in.nextInt();
// 		int count = 0;
// 		Node temp = start;
// 		if(start == null){
// 			start = nxt;
// 			nxt.next = null;
// 			System.out.println("Node added at 1st position. ");
// 		}
// 		while(temp!=null){
// 			count++;
// 			temp=temp.next;
// 		}
// 		if(pos>count){
// 			System.out.println("\nPosition is greater than total nodes.");
// 			return nxt;
// 		}
// 		else {
// 			temp = start;
// 			for(int i=1;i<pos;i++){
// 				temp = temp.next;
// 			}
// 			nxt.next=temp.next;
// 			temp.next=nxt;
// 		}
// 		return start;
// 	}
// 	public static Node DelBeg(Node start){
// 		if(start == null){
// 			System.out.println("Deletion not possible");
// 			return start;
// 		}
// 		else{
// 			Node nxt= start;
// 			start = start.next;
// 			System.out.println("1st node deleted ");
// 		}
// 		return start;
// 	}
// 	public static Node DelLast(Node start){
// 		if(start == null){
// 			System.out.println("No element to delete ");

// 		}
// 		else{
// 			Node temp = start;
// 			Node temp2 = start;
// 			if(start == temp){
// 				start = null;
// 				System.out.println("Only one Element in the list Deleted!");
// 			}
// 			else{
// 				while(temp.next!=null){
// 					temp2=temp;
// 					temp = temp.next;
// 				}
// 				temp2.next=null;
// 				System.println("Delete node : "+temp2.reg_num);
// 			}
// 		}
// 	}
// 	public static Node main(String[] args) {
		
// 	}
// // }

// import java.util.*;
// class Node {
// 	protected int reg_num;
// 	protected float mark;
// 	protected Node next;
// }
// public class neofile{
// 	public static Node create(Node start){
// 		Scanner in = new Scanner (System.in);
// 		char ch = 0;
// 		do{
// 		Node newNode = new Node ();
// 		System.out.print("Enter the registration number : ");
// 		newNode.reg_num = in.nextInt();
// 		System.out.print("Enter the mark : ");
// 		newNode.mark = in.nextFloat();
// 		if(newNode == null ){
// 			start = newNode;
// 		}
// 		else{
// 			Node temp = newNode;
// 			while(temp.next != null){
// 				temp = temp.next;
// 			}
// 			temp.next =newNode ; 
// 		}
// 		System.out.println("Do you want o add more ?? (y/n)");
// 		ch = in.next().charAt(0);
// 		}while(ch == 'y' || ch == 'Y');
// 	}
// 	public static Node display(Node start){
// 		if(start != null){
// 			System.out.println("Linked list is empty.......");
// 		}
// 		System.out.println("Registration number : "+start.reg_num);
// 		System.out.println("Mark "+start.mark);
// 	}
// 	public static Node InsBeg(Node start){
// 		Scanner in = new Scanner (System.in);
// 		Node newNode= new Node();
// 		System.out.println("Enter the registaration number : ");
// 		newNode.reg_num = in.nextInt();
// 		System.out.println("Enter the mark : ");
// 		newNode.mark = in.nextFloat();
// 		if(newNode == null){
// 			System.out.println("Linked list is emtpy");
// 		}
// 		newNode.next = newNode;
// 		start = newNode;
// 		return newNode;
// 	}
// 	public static Node InsLas(Node start){
// 		Scanner in = new Scanner (System.in);
// 		Node newNode = new Node();
// 		System.out.print("Emter reginum : ");
// 		newNode.reg_num = in.nextInt();
// 		System.out.print("Enter the mark : ");
// 		newNode.mark = in.nextFloat();
// 		if(start == null){
// 			System.out.println("Linkd list is empty");
// 			if(start.next == null){
// 				start.next = newNode;
// 			}
// 		}
// 		Node temp = start;
// 		while(temp.next == null){
// 			temp = temp.next;
// 		}
// 		temp = newNode;
// 		return start;
// 	}
// 	public static Node InsAny(Node start){
// 		Node newNode = new Node();
// 		Scanner in = new Scanner (System.in);
// 		System.out.println("Enter the registaration number : ");
// 		newNode.reg_num =in.nextInt();
// 		System.out.print("Enter mark : ");
// 		newNode.mark = in.nextFloat();
// 		System.out.print("Enter the position ");
// 		int pos = in.nextInt()-1 ; 
// 		if(start == null){
// 			start= newNode;
// 			newNode.next = null;
// 			System.out.println("Element is inserted at 1st position "); 
// 		}
// 		else if(pos>count(start)){
// 		Node temp = start;
// 		while(temp.next == null){
// 			temp = temp.next;
// 		}
// 		temp.next = newNode;
// 		newNode.next = null;
// 		System.out.println("Postion not found so the Node is inserted in last ");	
// 		}
// 	else{
// 		Node temp = start;
// 		for(int i=1;i<=pos-1;i++){
// 			temp = temp.next;
// 		}
// 		temp.next = newNode;
// 		newNode.next = null;
// 		System.out.println("Node is inserted at postion "+pos);
// 	}
// 	return start;
// }
// 	private static int count(Node start) {
// 		return 0;
// 	}
// 	public static Node DelBeg(Node start){
// 		Node newNode = new Node();
// 		if(start == null){
// 			System.out.println("Linked list is empty ");
// 		}
// 		else{
// 			Node temp = start;
// 			start = start.next;
// 			System.out.println("First node deleted ");
// 		}
// 		return start;
// 	}
// 	public static Node DelEnd(Node start){
// 		Node newNode = new Node();
// 		if (start==null || start.next==null ) 
// 		System.out.println("\n Linked List Is Empty");
// 		Node temp1 = start;
// 		Node temp2 = start;

// 		while(temp1 != null && temp1.next != null){
// 			temp2 = temp1;
// 			temp1 = temp1.next;
// 			System.out.println("Last Node deleted ");
// 		}
// 		return start;
// 	}
// 	public static Node DelAny(Node start){
// 		Node temp1 = start;
// 		Node temp2 = start;
// 		Scanner in = new Scanner (System.in);
// 		System.out.print("Enter the position of the node you want to delete : ");
// 		int pos = in.nextInt()-1;
// 		if(start == null){
// 			System.out.println("Linked list is empty ");
// 		}
// 		else if(pos>count(start)){
// 			System.out.println("Position out of range!");
// 		}
// 		for(int i=1;i<pos;i++){
// 			temp2 = temp1;
// 			temp1 = temp1.next;
// 			System.out.println("Node is deleted ");
// 		}
// 		return start;
// 	}
// 	public static Node main(String[] args) {
// 		Scanner in = new Scanner (System.in);
// 		Node start = null;
// 		while(true){
// 			System.out.println("0. Exit");
// 			System.out.println("1. Creation");
// 			System.out.println("2. Display ");
// 			System.out.println("3. Insert @first ");
// 			System.out.println("4. Insert @last ");
// 			System.out.println("5. Insert @AnyPostion");
// 			System.out.println("6. Delete @First ");
// 			System.out.println("7. Delete @Last");
// 			System.out.println("8. Delete @AnyPosition");
// 			System.out.println();
// 			System.out.println("Enter your choice ");
// 			int choice = in.nextInt();
// 			switch(choice){
// 				case 0 :
// 				System.exit(0);
// 				case 1 :
// 				create(start);
// 			}
// 		}
// 	}
// }
// import java.util.*;
// public class neofile 
// {   snode  head;
// 	static class snode
// 	{
// 		int data;
// 		snode next;
// 		snode(int d)
// 		{
// 			data = d;
// 			next = null;
// 		}
// 	}
// 	public static neofile create(neofile List)
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		int num;
// 		char ch;
// 		do
// 		{
// 			System.out.println("enter a number");
// 			num = sc.nextInt();
// 			snode newnode = new snode(num);
// 			if(List.head == null)
// 			{
// 				List.head = newnode;
// 			}
// 			else
// 			{
// 				snode tail = List.head;
// 				while(tail.next != null)
// 				{
// 					tail = tail.next;
// 				}
// 				tail.next= newnode;
				
// 			}
// 			System.out.println("Do you want to add more");
// 			ch = sc.next().charAt(0);
			
// 		}while(ch == 'y');
// 		return List;
		
// 	}
// 	public static neofile insertFirst(neofile List, int num)
// 	{
//         snode newnode = new snode(num);
//         if(List.head == null)
//         {
//         	List.head = newnode;
//         }
//         else
//         {
//         	newnode.next = List.head;
//         	List.head = newnode;
        	
//         }
// 		return List;
// 	}
// 	public static neofile delFirst(neofile List)
// 	{
        
//         if(List.head == null)
//         {
//         	System.out.println("Deletion is not possible as List is Empty");
//         	List.head = null;
//         }
//         else 
//         {
//         	List.head = List.head.next;
//         	System.out.println("Deleted Succefully");
//         }
// 		return List;
// 	}
// 	public static neofile insertLast(neofile List, int num)
// 	{
//         snode newnode = new snode(num);
//         if(List.head == null)
//         {
//         	List.head = newnode;
//         }
//         else
//         {
//         	snode tail = List.head;
// 			while(tail.next != null)
// 			{
// 				tail = tail.next;
// 			}
// 			tail.next= newnode;
        	
//         }
// 		return List;
// 	}
// 	public static neofile delLast(neofile List)
// 	{
// 		if(List.head == null)
//         {
//         	System.out.println("Deletion is not possible as List is Empty");
//         	List.head = null;
//         }
//         else
//         {
//         	snode temp = List.head;
//         	snode prevtemp = null;
// 			while(temp.next != null)
// 			{
// 				prevtemp = temp;
// 				temp = temp.next;
// 			}
// 			prevtemp.next= null;
// 			System.out.println("Deleted Succefully");
//         }
// 		return List;
// 	}
// 	public static neofile insertAtAnyPos(neofile List, int num, int pos)
// 	{
        
// 		int nodecount = 0;
// 		snode tail = List.head;
// 		while(tail != null)
// 		{
// 			nodecount++;
// 			tail = tail.next;
// 		}
// 		if( pos < 1 || pos > nodecount)
// 		{
// 			System.out.println("Invalid Position to insert a node in the Link List");
// 			return List;
// 		}
// 		snode newnode = new snode(num);
// 		if( pos == 1)
// 		{
//         	List.head = newnode;
        	
//         }
//         else
//         {
//         	snode temp = List.head;
//         	snode prevtemp = temp;
//         	int i = 1;
// 			while(i < pos)
// 			{
// 				prevtemp = temp;
// 				temp = temp.next;
// 				i++;
// 			}
// 			prevtemp.next = newnode;
// 			newnode.next = temp;
// 		}
// 		return List;
		
// 	}
// 	public static neofile delAtAnyPos(neofile List, int pos)
// 	{
// 		int nodecount = 0;
// 		snode temp = List.head;
// 		while(temp != null)
// 		{
// 			nodecount++;
// 			temp = temp.next;
// 		}
// 		if( pos < 1 || pos > nodecount)
// 		{
// 			System.out.println("Invalid Position to insert a node in the Link List");
// 			return List;
// 		}
// 		if(List.head == null)
//         {
//         	System.out.println("Deletion is not possible as List is Empty");
//         	List.head = null;
//         }
// 		else if(pos == 1)
// 		{
// 			List.head = List.head.next;
// 			System.out.println("Deleted Succefully");
// 		}
//         else
//         {
//         	int i = 1;
//         	temp = List.head;
//         	snode prevtemp = null;
// 			while(i < pos)
// 			{
// 				prevtemp = temp;
// 				temp = temp.next;
// 				i++;
// 			}
// 			prevtemp.next= temp.next;
// 			System.out.println("Deleted Succefully");
//         }
// 		return List;
// 	}
	
// 	static Node display(neofile List)
// 	{
// 		snode temp = List.head;
// 		System.out.println("Single Link List");
// 		while(temp != null)
// 		{
// 			if(temp.next == null)
// 				System.out.print(temp.data);
// 			else
// 			System.out.print(temp.data+"->");
// 			temp = temp.next;
// 		}
// 		System.out.println();
// 	}
// 	static Node search(neofile List, int srno)
// 	{
// 		snode temp = List.head;
// 		if(List.head == null)
// 		{
// 			System.out.println("Link list is Empty, so searching is not possible");
// 			return;
// 		}
// 		int pos=0;
// 		while(temp != null)
// 		{
// 			pos++;
// 			if(temp.data == srno)
// 			{
// 				System.out.print("Element is found at "+pos+" position in the LinkList");
// 			    break;
// 			}   
// 			temp = temp.next;
// 		}
// 		if( temp == null)
// 		System.out.println("The given element is not found in the Link List");
// 	}
// 	static neofile sort(neofile List)
// 	{
		
// 		int nodecount = 0;
// 		snode temp = List.head;
// 		while(temp != null)
// 		{
// 			nodecount++;
// 			temp = temp.next;
// 		}
// 		if(nodecount == 0)
// 		{
// 			System.out.println("Link list is Empty, so sorting is not possible");
			
// 		}
// 		else 
// 		{
			
// 			for(int i=0;  i < nodecount;  i++)
// 			{
// 			   	snode itemp = List.head;
// 				snode jtemp = List.head.next;
// 				for(int j=1; j < nodecount-i; j++)
// 				{  if(itemp.data > jtemp.data)
// 					{
// 						int extravnm = itemp.data;
// 						itemp.data = jtemp.data;
// 						jtemp.data = extravnm;
// 					}
// 				    itemp = jtemp; 
// 				    jtemp=jtemp.next;
// 				}
// 			}
			
// 		}
// 		return List;
// 	}
// 	static int count(neofile List)
// 	{
// 		snode temp = List.head;
// 		int ctr=0;
// 		while(temp != null)
// 		{
// 			ctr++;
// 			temp = temp.next;
// 		}
// 		return ctr;
// 	}
	
// 	public static Node main(String[] args) 
// 	{
	
// 		Scanner sc = new Scanner(System.in);
// 		neofile list = new neofile();
// 		int choice;
// 		do
// 		{
// 		System.out.println("Single Link Menu: List of Operations");
// 		System.out.println("1. Creation");
// 		System.out.println("2. Display");
// 		System.out.println("3. Total node counts");
// 		System.out.println("4. Insertion at Begining");
// 		System.out.println("5. Insertion at Last");
// 		System.out.println("6. Insertion at any position");
// 		System.out.println("7. Deletion at Begining");
// 		System.out.println("8. Deletion at Last");
// 		System.out.println("9. Deletion at any position");
// 		System.out.println("10. Searching of a node in a Link List");
// 		System.out.println("11. Sorting of node values in Link List");
// 		System.out.println(" Enter your choice");
// 		choice = sc.nextInt();
// 		switch(choice)
// 		{
// 		case 1: 
// 			      	list = create(list);
// 			      		break;
// 		case 2: 
// 					display(list);
// 		      			break;
// 		case 3: 
//       				System.out.println("Total number of nodes in Link List : "+count(list));
//       					break;      			
// 		case 4: 
// 					System.out.println("enter the number which you want to add it at first position of the List");
// 					int num = sc.nextInt();
// 					list = insertFirst(list, num);
// 		      			break;
// 		case 5: 
// 					System.out.println("enter the number which you want to add it at last position of the List");
// 					num = sc.nextInt();
// 					list = insertLast(list, num);
// 		      			break;
// 		case 6: 
// 					System.out.println("enter the number and its position to be added into the Link List");
// 					num = sc.nextInt();
// 					int pos = sc.nextInt();
// 					list = insertAtAnyPos(list, num, pos);
// 		      			break;
// 		case 7: 
// 					System.out.println("Delete a node at first position of the List");
// 					list = delFirst(list);
// 						break;
// 		case 8: 
// 					System.out.println("Delete a node at last position of the List");
// 					list = delLast(list);
// 		      			break;
// 		case 9: 
// 					System.out.println("enter the position from where you want to delete a node from the Link List");
// 					pos = sc.nextInt();
// 					list = delAtAnyPos(list,pos);
// 		      			break;
// 	    case 10: 
// 					System.out.println("enter the number which you want to search in the List");
// 					int srno = sc.nextInt();
// 					search(list, srno);
//       			break;  
// 	    case 11: 
// 					System.out.println("List is now sorted based on Data Values");
// 					sort(list);
// 					break; 			
// 		default: 
// 			        System.out.println("Exit from Menu");
// 			      	return;	
		
// 		 }
// 		}while(choice <= 12);
//     }
// }
// }

// import java.util.*;
// class Node{
//     protected int reg_num;
//     protected float mark;
//     protected Node next;
// }
// public class neofile {
//     public static Node create(Node start){
//         Scanner in = new Scanner (System.in);
//         char ch  ;
//         do{
//             Node newNode = new Node();
//             System.out.print("ERnter the reg num : ");
//             newNode.reg_num = in.nextInt();
//             System.out.print("Enter the mark :");
//             newNode.mark = in.nextFloat();
//             newNode.next = null;
//             if(start == null) {
//                 start = newNode;
//             }
//             Node temp = start;
//             while(temp.next != null){
//                 temp= temp.next;
//             }
//             temp.next = start;
//             start = newNode;
//             System.out.println("Do you want to add more ? (y/n)");
//             ch = in.next().charAt(0);
//         }while(ch == 'y'|| ch =='Y' );
//         return start;
//     }
//     public static Node display(Node start){
//         Node temp = start;
//         System.out.println("Reg num\tmark");
//         while(temp != null){
//             System.out.println(temp.reg_num+"\t"+temp.mark);
//         }
//     }
//     public static Node InsBeg(Node start){

//         Scanner in = new Scanner (System.in);
//         return InsBeg(start);
//     }
//     public static Node main(String[] args) {
//         // TODO code application logic here
//         Scanner in = new Scanner (System.in);
//         Node start = null;
//         while(true){
//             System.out.println("0. Exit");
//             System.out.println("1. Create");
//             System.out.println("2. Display");
//             System.out.print("Enter your choice ");
//             int choice = in.nextInt();
//             switch(choice){
//                 case 0 :
//                 System.exit(0);
//                 case 1 : 
//                 start = create(start);
//                 break;
//                 case 2 : 
//                 display(start);
//             }
//         }
//     }
// }


// import java.util.*;
// class Node{
//     protected int reg_num;
//     protected float mark;
//     protected Node next;
// }
// public class neofile{
//     public static Node create(Node start){
//         Scanner in = new Scanner (System.in);
//         char ch;
//         do{
//             Node newNode = new Node();
//             System.out.print("Enter the registartion number : ");
//             newNode.reg_num=in.nextInt();
//             System.out.print("Enter Mark : ");
//             newNode.mark = in.nextFloat();                 
//             if(start == null){
//                 start = newNode;
//             }
//             else{
//                 Node temp = start;
//                 while(temp.next!=null){
//                     temp = temp.next;
//                 }
//                 temp.next = newNode;
//             }
//             System.out.println("Do you want to create more ? (y/n)");
//             ch = in.next().charAt(0);
//         }while(ch=='y'||ch=='Y'); 
//         return start;
//     }
//     public static void display(Node start){
//         Node temp = start;
//         while(temp.next!=null){
//             System.out.println("Regnum "+temp.reg_num);
//             System.out.println("Mark: " +temp.mark );
//             temp = temp.next;
//         }
//     }
//     public static Node InsBeg(Node start){
//         Scanner in = new Scanner (System.in);
//         char ch ;
//         do{
//             Node newNode = new Node();
//             System.out.println("Enter the reg num  : ");
//             newNode.reg_num = in.nextInt();
//             System.out.println("Enter the mark : ");
//             newNode.mark = in.nextFloat();
//             if(start == null){
//                 start = newNode;
//             }
//             else{
//                 newNode.next = start;
//                 start = newNode;
//             }
//             System.out.println("Add ?");
//             ch = in.next().charAt(0);
//         }while(ch == 'y'|| ch == 'Y');
//         return start;
//     }
//     public static Node InsEnd(Node start){
//         Scanner in = new Scanner (System.in);
//         char ch ;
//         do{
//             Node newNode = new Node();
//             System.out.print("Enter the reg num   : ");
//             newNode.reg_num = in.nextInt();
//             System.out.println("Mark : ");
//             newNode.mark = in.nextFloat();
//             if(start == null){
//                 start = newNode;
//                 System.out.println("Node is entere at first because LinkedList is empty");
//             }
//             else{
//                 Node temp = start;
//                 while(temp.next!= null){
//                     temp = temp.next;
//                 }
//                 temp.next = newNode;
//                 System.out.println("New Node is Inserted @Last position ");
//             }
//             System.out.println("Do you want to add more ? ");
//             ch = in.next().charAt(0);
//         }while(ch == 'y' || ch == 'Y');
//         return start;
//     }
//     public static int count(Node start){
//         Node temp = start;
//         int count = 0;
//         while(temp!=null){
//             count++;
//             temp = temp.next;
//         }
//         return count;
//     }
//     public static Node InsAny(Node start){
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the postion you want to insert the Node ");
//         int pos = in.nextInt();
//         Node newNode = new Node();
//         System.out.println("Enter the reg : ");
//         newNode.reg_num = in.nextInt();
//         System.out.println("Enter mark : ");
//         newNode.mark = in.nextFloat();
//         Node temp1 = start;
//         Node temp2 = start;
//         if(start == null){
//             System.out.println("Node is Inserted @first (LinkedList is not created)");
//             start = newNode;
//         } 
//         else if(pos>count(start)){
//             while(temp1.next!=null){
//                 temp1= temp1.next;
//             }
//             temp1.next = newNode;
//         }
//         else{
//             for(int i=1;i<pos;i++){
//                temp1 = temp1.next;
//             }
//             temp1.next = newNode;
//             newNode.next = temp1.next;
//         }
//         return start;
//     }
//     public static Node Delbeg(Node start){
//         if(start == null){
//             System.out.println("LinkedList is empty ");
//         }
//         else{
//             start = start.next;   
//         }
//         return start;
//     }
//     public static Node DelEnd(Node start){
//         Node temp1 = start;
//         Node temp2 = start;
//         while(temp1.next != null){
//             temp2 = temp1;
//             temp1 = temp1.next;
//         }
//         temp2.next = null;
//         System.out.println("Last Node is deleted ");
//         return start ;
//     }
//     public static Node DelAny(Node start){
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the position ");
//         int pos = in.nextInt();
//         Node temp1 = start;
//         Node temp2 = start;
//         if(start == null){
//             System.out.println("LinkedList is empty ");
//         }
//         else if(pos>count(start)){
//             System.out.println("Position out of range");
//         }
//         else{
//             while(temp1.next != null){
//                 temp2 = temp1;
//                 temp1 = temp1.next;
//             }
//         }
//         temp2.next = null;
//         System.out.println("Last node deleted");
//         return start;
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         Node start = null;
//         while(true){
//             System.out.println("0. Exit");
//             System.out.println("1. Create");
//             System.out.println("2. Display");
// 			System.out.println("3. Insert first");
//             System.out.println("4. Insert Last ");
//             System.out.println("5. Insert Any");
//             System.out.println("6. Delete first");
//             System.out.println("7. Delete Last");
//             System.out.println("8. Delete Any");
//             System.out.println("9. Size of the LinkedList\f");
//             System.out.println();
//             System.out.print("Enter your choice ");
//             int choice = in.nextInt();
//             switch(choice){
//                 case 0 :
//                 System.exit(0);
//                 case 1 : 
//                 start = create(start);
//                 break;
//                 case 2 : 
//                 display(start);
// 				System.exit(0);
// 				break;
// 				case 3:
// 				start = InsBeg(start);
// 				break;
//                 case 4 :
//                 start = InsEnd(start);
//                 break;
//                 case 5 :
//                 start = InsAny(start);
//                 break;
//                 case 6 :
//                 start = Delbeg(start);
//                 break;
//                 case 7 :
//                 start = DelEnd(start);
//                 break;
//                 case 8 :
//                 start = DelAny(start);
//                 break;
//                 case 9 :
//                 count(start);
//                 break;
//                 default :
//                 System.out.println("Invalid choice ");
//                 break;
//             }
//         }
//     }
// }

// import java.util.*;
// public class neofile{
//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter a number : ");
//         int n = in.nextInt();
//         int p=1,s=0;
//         while(n!=0){
//             int rem = n%10;
//             s+=rem;
//             p*=rem;
//             n/=10;
//         }
//         System.out.println("Sum of the digits is "+s);
//         System.out.println("Product of digits is "+p);
//         if(s==p){
//             System.out.println("This is a spy number ");
//         }
//         else{
//             System.out.println("This is not a spy number ");
//         }
//     }
// }



// import java.util.*;
// public class neofile{
//     public static int MAX = 5;
//     public static int push (int S[], int top){
//         Scanner in = new Scanner (System.in);
//         if(isFull(top)){
//             System.out.println("Stack overFlow");
//         }
//         else{
//             top++;
//             S[top] = in.nextInt();
//         }
//         return top;
//     }
//     public static int pop(int S[],int top){
//         if(isEmpty(top)){
//             System.out.println("Stack underflow");
//         }
//         else{
//             top--;
//             System.out.println();
//         }
//         return top;
//     }
//     public static void display(int S[],int top){
//         if(top==-1){
//             System.out.println("Empty");
//         }
//         else{
//             int i = top;
//             System.out.println("Array elements are ");
//             while(i>=0){
//                 System.out.print(S[i]+ "   ");
//                 i--;
//             }
//             System.out.println();
//         }
//     }
//     public static boolean isFull(int top){
//         return top== MAX -1;
//     }
//     public static boolean isEmpty(int top){
//         return top ==-1 ;
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         int [] S = new int[MAX];
//         int top =-1;
//         while(true){
//             System.out.println("Manu for different operation");
// 			System.out.println("Press 0: Exit");
// 			System.out.println("Press 1: Push");
// 			System.out.println("Press 2: Pop");
// 			System.out.println("Press 3: Display");
// 			System.out.println("Enter your choice: ");
// 			int choice = in.nextInt();
//             switch(choice){
//                 case 0 :
//                 System.exit(0);
//                 case 1 : 
//                 top = push(S,top);
//                 break;
//                 case 2 : 
//                 top = pop(S,top);
//                 break;
//                 case 3 :
//                 display(S,top);
//                 break;
//                 default : System.out.println();
//             }
//         }
//     }
// }


// import java.util.*;
// public class neofile{
//     Node head;
//     class Node{
//         String data;
//         Node next;
//         Node (String d ){
//             this.data = d;
//             this.next=null;
//         }
//     }
//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         else{
//             newNode.next = head;
//             head = newNode;
//         }
//     }
//     public void addLast(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         else{
//             Node temp = head;
//             while(temp.next != null){
//                 temp = temp.next;
//             }
//             temp.next = newNode;
//         }
//     }
//     public void deleteFirst(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             System.out.println("LinkedList is empty");
//             return;
//         }
//         else{
//             head = head.next;
//         }
//     }
//     public void deleteLast(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             System.out.println("LinkedList is empty");
//             return;
//         }
//         if(head.next == null){
//             head = head.next;  //Or we can write " head == null; "
//             return;
//         }
//         else{
//             Node temp1 = head;
//             Node temp2 = head;
//             while(temp1.next == null){
//                temp1 = temp1.next;
//                temp2 = temp2.next;
//             }
//             temp2.next = null;
//         }
//     }
//     public void printList(){
//        if(head == null){
//         System.out.println("LinkedList is empty");
//         return;
//         }
//         Node temp = head;
//         while(temp!= null){
//             System.out.print(temp.data);
//             temp = temp.next;
//         }
//     }
//     public void reverseIterrate(){
//         if(head == null  || head.next == null){
//             return;
//         }
//         Node prev = head;
//         Node temp = head.next;
//         while(temp != null){
//             Node next = temp.next;
//             temp.next = prev;
            
//             prev = temp;
//             temp = next;
//         }
//         head.next = null;
//         head = prev;
//     }
//      public static void main(String[] args) {
//         neofile neo = new neofile();
//         neo.addLast("Dash");
//         neo.addFirst("U"); 
//         neo.addFirst("S");
//         neo.addFirst("N");
//         neo.addFirst("A");
//         neo.addFirst("Y");
//         neo.addFirst("I");
//         neo.addFirst("R");
//         neo.addFirst("S");
//         neo.printList();
//     }
// }



// import java.util.*;
// public class neofile{
//     static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Stack{
//         public static Node head;
//         public static boolean isEmpty(){
//             return head == null;
//         }
//         public static void push(int data){
//             Node newNode = new Node(data);
//             if(Stack.isEmpty()){
//                 head = newNode ;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//         }
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             else{
//                 int top = head.data;
//                 head = head.next;
//                 return top;
//             }
//         }
//         public static int peak(){
//             if(isEmpty()){
//                 return -1;
//             }
//             else{
//                 return head.data;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Stack s1 = new Stack();
//         s1.push(1);
//         s1.push(2);
//         s1.push(3);
//         s1.push(4);
//         s1.push(5);
//         while(!s1.isEmpty()){
//             System.out.println(s1.peak());
//             s1.pop();
//         }
//     }
// }

// public class neofile{
//     static class Node{
//         int data ;
//         Node next;
//         public Node (int d){
//             this.data = d;
//             this.next = null;
//         }
//     }
//     static class stack{
//         public static Node head;
//         public static boolean isEmpty(){
//             return head == null;
//         }
//         public static void push(int data){
//             Node newNode = new Node(data);
//             if(stack.isEmpty()){
//                 head = newNode;
//             }
//             else{
//                 newNode.next = head ;
//                 head = newNode;
//             }
//         }
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             else{
//                 int top = head.data;
//                 head = head.next;
//                 return top;
//             }
//         }
//         public static int peak(){
//             if(isEmpty()){
//                 return -1;
//             }
//             else{
//                 return head.data;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         stack s1 = new stack();
//         s1.push(8);
//         s1.push(7);
//         s1.push(6);
//         s1.push(5);
//         s1.push(4);
//         s1.push(3);
//         s1.push(2);
//         s1.push(1);
//         while(!s1.isEmpty()){
//             System.out.println(s1.peak());
//             s1.pop();
//         }
//     }
// }

// import java.util.*;
// class Node {
//     String name ;
//     int mark ;
//     Node next;
// }
// public class neofile{
//     public static boolean isEmpty(Node head){
//         return head == null;
//     }
//     public static Node push(Node head){
//         Scanner in = new Scanner (System.in);
//         char ch = 0 ;
//         do{
//             Node newNode = new Node();
//             System.out.print("Enter name : ");
//             newNode.name = in.next();
//             System.out.print("Enter "+newNode.name+"'s mark : ");
//             newNode.mark = in.nextInt();
//             if(isEmpty(head)){
//                 head = newNode;
//             }
//             else{
//                 newNode.next = head;
//                 head = newNode;
//             }
//             System.out.println("Element is pushed at first position ");
//             System.out.println("Do you want to push more elements ? >y/n<");
//             ch = in.next().charAt(0);
//         }while(ch == 'y' || ch == 'Y');
//         return head;
//     }
//     public static Node pop(Node head){
//         if(isEmpty(head)){
//             System.out.println("Stack is underflow");
//             return null;
//         }
//         else{
//           Node new
//         }
//     }
//     public static void peak(Node head){
//         if(isEmpty(head)){
//             System.out.println("Stack is underflow");
//         }
//         else{
//             Node temp = head;
//             while(temp != null){
//                 System.out.println("Name is : "+temp.name );
//                 System.out.println("Mark is : "+temp.mark);
//                 temp = temp.next;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         Node head = null;
//         while(true){
//             System.out.println("0. Exit");
//             System.out.println("1. Push");
//             System.out.println("2. Pop");
//             System.out.println("3. Peak");
//             System.out.println("Enter your choice : ");
//             int choice = in.nextInt();
//             switch(choice){
//                 case 0 : 
//                 System.exit(0);
//                 break;
//                 case 1 : 
//                 head = push(head);
//                 break;
//                 case 2 :
//                 head = pop(head);
//                 break;
//                 case 3 : 
//                 peak(head);
//                 break;
//                 default : 
//                 System.out.println(" Wrong choice ");
//             }
//         }
//     }
// }

// import java.util.*;
// class Student{
// 	String name;
// 	long roll_num;
// 	int mark;
// 	public String getname(){
// 		// this.name = name;
// 		Scanner in = new Scanner (System.in);
// 		System.out.println("Enter name : ");
// 		name = in.nextLine();
// 		return name;
// 	}
// 	public long roll_num(long rollnum){
// 		this.roll_num = rollnum;
// 		return rollnum;
// 	}
// 	public int mark(){
// 		System.out.println("Enter tha mark : ");
// 		Scanner in = new Scanner(System.in);
// 		String mrk = in.nextLine();
// 		mark = Integer.parseInt(mrk);
// 		return mark;
// 	}
// 	public void printDetails(){
// 		System.out.println("Name is : "+name);
// 		System.out.println("Roll number is "+roll_num);
// 		System.out.println("Mark is : "+mark);
// 	}
// }
// public class neofile{
// 	public static void main(String[] args) {
// 		Scanner in = new Scanner (System.in);
// 		Student s1 = new Student();
// 		s1.getname();
// 		System.out.println("Enter the Roll number : ");
// 		String roll = in.next();
// 		s1.roll_num(Long.parseLong(roll));
// 		s1.mark();
// 		s1.printDetails();
// 	}
// }


// import java.util.*;

// import LinkedList.linkedlist;
// class Student{
// 	private String name ;
// 	private long roll_num;
// 	private int mark;
// 	public String name(){
// 		Scanner in = new Scanner (System.in);
// 		System.out.println("Enter name ");
// 		name = in.next();
// 		try{
// 			if(name.matches("[a-zA-z]+"))
// 			return name;
// 			else
// 			throw new InputMismatchException("Please enter a name");
// 		}catch (InputMismatchException s){
// 			System.out.println(s);
// 		}
// 		return null;
// 	}
// 	public Long roll_num(){
// 		Scanner in = new Scanner (System.in);
// 		System.out.println("Enter roll number : ");
// 		String n = in.next();
// 		try{
// 			roll_num = Long.parseLong(n);
// 			return roll_num;
// 		}catch(NumberFormatException e){
// 			System.out.println("Wrong input");
// 		}
// 		return null;
// 	}
// 	public void mark(){
// 		Scanner in = new Scanner (System.in);
// 		System.out.println("Enter mark : ");
// 		String mrk = in.next();
// 		try {
// 			mark = Integer.parseInt(mrk);
// 		}catch(NumberFormatException e){
// 			System.out.println("Wrong input");
// 		}
// 	}
// 	public void printdetails(){
// 		System.out.println("Name : "+name);
// 		System.out.println("Roll number : "+roll_num);
// 		System.out.println("Mark : "+mark);
// 	}
// }
// public class neofile{
// 	public static void main(String[] args){
// 		Scanner in = new Scanner(System.in);
// 		Student s = new Student();
// 		System.out.println("Enter the number of Students you want to enter ");
// 		int n = in.nextInt();
// 		for(int i=0;i<n;i++){
// 			s.name();
// 			s.roll_num();
// 			s.mark();
// 		}		
// 		System.out.println("\n"+"Output : ");
// 		for(int i=0;i<n;i++){
// 			s.printdetails();
// 		}
// 	}
// }

// public class neofile{
//     public static void main(String[] args) {
//         int n = 5;
//         int pos = 1;
//         int bitmask = 1<<pos;
//         if((bitmask | n ) == 0){
//             System.out.println("Zero");
//         }
//         else{
//             System.out.println("Non-zero");
//         }
//     }
// }

// public class neofile{
//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = {0,9,8,7,6,5,4,3,2,1};
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if (arr[j] > arr [j+1]){
//                     //swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;

//                 }
//             }
//         }
//         printArray(arr);
//     }
// }

// import java.util.*;
// public class neofile {
//     // public static void printArray(int arr[]){
//     //     for(int i=0;i<arr.length;i++){
//     //         System.out.print(arr[i]+" ");
//     //     }
//     //     System.out.println();
//     // }
//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the size of Array : ");
//         int n = in.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = in.nextInt();
//         }
//         for(int i=0;i<arr.length-1;i++){
//             for (int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         System.out.println("After Bubble Sort : ");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         // printArray(arr);
//     }
// }

// public class neofile{
//     public static void main(String[] args) {
//         int arr[] ={7,8,2,3,1};
//         for(int i=0;i<arr.length-1;i++){
//             int smallest = i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[smallest]>arr[j]){
//                     smallest = j;
//                 }
//             }
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = temp;
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }

// import java.util.*;
// public class neofile{
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the size of Array : ");
//         int n = in.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter tthe elements of Array : ");
//         for(int i=0;i<arr.length;i++){
//             arr[i] = in.nextInt();
//         }
//         for(int i=0;i<arr.length-1;i++){
//             int smallest = i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[smallest]>arr[j]){
//                     int temp = arr[smallest];
//                     arr[smallest] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//         System.out.println();
//         for (int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }

// import java.util.*;
// public class neofile{
//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] ={7,8,3,1,2};
//         for(int i=1;i<arr.length;i++){
//             int current = arr[i];
//             int j = i-1;
//             while(j>=0 && current < arr[j]){
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1] = current;
//         }
//         printArray(arr);
//     }
// }

// import java.util.*;
// public class neofile{
//     public static void printArray(int arr[] ){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the size of Array : ");
//         int n  = in.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the elements of Array : ");
//         for(int i=0;i<arr.length;i++){
//             arr[i] = in.nextInt();
//         }
//         System.out.println("After Insertion sort : ");
//         for(int i=1;i<arr.length;i++){
//             int current = arr[i];
//             int j = i-1;
//             while(j>=0 && current < arr[j]){
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1] = current;
//         }
//         // for(int i=0;i<arr.length;i++){
//         //     System.out.print(arr[i]+" ");
//         // }
//         // System.out.println();
//         printArray(arr);
//     }
// }

// import java.util.*;
// public class neofile{
//     static class Node{
//         int data ;
//         Node next;
//         public Node(int data){
//             this.data = data ;
//             this.next = null;
//         }
//     }
//     static class stack{
//         public static Node head;
//         public static boolean isEmpty(){
//             return head == null;
//         }
//         public static void push(int data){
//             Node newNode = new Node(data);
//             if(stack.isEmpty()){
//                 head = newNode;
//             } 
//             else{
//                 newNode.next = head ;
//                 head = newNode;
//             }
//         }
//         public static int pop(){
//             if(stack.isEmpty()) {
//                 return -1;
//             }
//             else{
//                 int top = head.data;
//                 head  = head.next;
//                 return   top;
//             }
//         }
//         public static int peak(){
//             if(stack.isEmpty() ){
//                 return -1;
//             }
//             else{
//                 return head.data;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         stack s = new stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);
//         while(!s.isEmpty()){
//             System.out.println(s.peak());
//             s.pop();
//         }
//     }
// }


// import java.util.*;
// class Node{
//     String name;
//     int roll;
//     Node next;
// }
// public class neofile{
//     public static Node create(Node start){
//         Scanner sc=new Scanner (System.in);
//         char ch = 0;
//         do{
//             Node newNode = new Node();
//             System.out.print("Enter the name of the Student : ");
//             newNode.name = sc.next();
//             System.out.print("Enter roll number : ");
//             newNode.roll = sc.nextInt();
//             if(start == null){
//                 start = newNode;
//             }
//             else{
//                 Node temp = start;
//                 while(temp.next != null){
//                     temp = temp.next;
//                 }
//                 temp.next = newNode;
//                 System.out.println("Do you want to add more ? (y/n)");
//                 ch = sc.next().charAt(0);
//             }
//         }while(ch == 'y' || ch =='Y');
//         return start;
//     }
//     public static void display(Node start){
//         if(start == null){
//             System.out.println("Linkedlist is empty");
//         }
//         else{
//             Node temp = start;
//             while(temp.next == null){
//                 System.out.println(temp.name);
//                 System.out.println(temp.roll);
//                 temp = temp.next;
//             }
//         }
//     }
//     public static Node addFirst(Node start){
//         Scanner sc=new Scanner (System.in);
//         Node newNode = new Node();
//         System.out.print("Enter the name : ");
//         newNode.name = sc.next();
//         System.out.print("Enter roll no :");
//         newNode.roll = sc.nextInt();
//         start.next = start;
//         start = newNode;
//         return start;
//     } 
//     public static Node addLast(Node start){
//         return create(start);
//     }
//     public static int count(Node start){
//         int c =0;
//         Node temp = start;
//         while(temp != null){
//             c++;
//             temp = temp.next;
//         }
//         return c;
//     }
//     public static Node InsAny(Node start){
//         Scanner in = new Scanner (System.in);
//         Node newNode = new Node();
//         System.out.print("Enter the position : ");
//         int pos = in.nextInt();
//         System.out.println("Enter name : ");
//         newNode.name = in.next() ;
//         System.out.print("Enter roll no : ");
//         newNode.roll = in.nextInt();
//         if(start == null){
//             System.out.println("New Node is added at 1st pos ");
//             start = newNode;
//         }
//         else if(pos>count(start)){
//             Node temp = start;
//             while(temp.next != null){
//                 temp = temp.next;
//             }
//             temp.next = newNode;
//             System.out.println("Node is added at last postion (Entered position is greater than LinkedList size )");
//         }
//         else{
//             Node temp = start;
//             for(int i=0;i<count(start);i++){
//                 temp = temp.next;
//             }
//             newNode.next = temp.next;
//             temp.next = newNode;
//         }
//         return start;
//     }
//     public static Node delBeg(Node start){
//         if(start == null){
//             System.out.println("LinkedList is empty");
//         }
//         else{
//             start = start.next;
//         }
//         return start;
//     }
//     public static Node delEnd(Node start){
//         Node temp = start;
//         Node temp1 = start;
//         while(temp.next != null){
//             temp1 = temp;
//             temp = temp.next;
//         }
//         temp1.next = null;
//         return start;
//     }
//     public static Node delAny(Node start){
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the postion you want to remove : ");
//         int pos = in.nextInt();
//         Node temp1 = start;
//         Node temp2 = start;
//         if(start == null){
//             System.out.println("LinkedList is empty ");
//             return start;
//         }
//         else if(pos>count(start)){
//             System.out.println("Position not found (Last Node is removed)");
//             while(temp1.next != null){
//                 temp2 = temp1;
//                 temp1 = temp1.next;
//             }
//             temp2.next =null;
//         }
//         else{
//             for(int i=0;i<count(start);i++){
//                 temp2 = temp1;
//                 temp1 = temp1.next;
//             }
//             temp2.next = temp1.next;
//         }
//         return start;
//     }
//     public static Node reverseIterrate(Node start){
//         if(start == null || start.next == null){
//             return start;
//         }
//         else{
//             Node prevNode = start;
//             Node currNode = start.next;
//             while(currNode.next != null){
//                 Node nextNode = currNode.next;
//                 currNode.next = prevNode;
//                 prevNode = currNode;
//                 currNode = nextNode;
//             }
//         }
//     }
//     public static void main(String[] args) {
        
//     }
// }


// import java.util.*;
// class Student{
//     private String name ;
//     public String getName(){
//         return this.name;
//     }
//     public void setName(String nm){
//         Scanner in = new Scanner(System.in);
//         this.name =nm;
//         System.out.print("Enter name : ");
//         nm = in.next();
//     }
// }
// public class neofile{
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.setName("New");
//         System.out.println(s1.getName());
//     }
// }

// import java.util.*;
// public class neofile{
//     static ArrayList<Integer> ls = new ArrayList<>();
//     public static boolean isEmpty(){
//         return ls.size() == -1;
//     }
//     public static void push(int data){
//         ls.add(data);
//     }
//     public static int pop (){
//         int top = ls.get(ls.size()-1);
//         ls.remove(top);
//         return top;
//     }
//     public static int peek(){
//         return ls.get(ls.size()-1);
//     }
//     public static void pushAtBottom(int data ,Stack<Integer> n){
//        if(n.isEmpty()){
//         n.push(data);
//         return ;
//        }
//         int top = n.pop();
//         pushAtBottom(data, n);
//         n.push(top);
//     }
//     public static void reverse(Stack<Integer> s){
//         if(s.isEmpty()){
//             return;
//         }
//         int top = s.pop();
//         reverse(s);
//         pushAtBottom(top, s);
//     }
//     public static void main(String[] args) {
//         Stack n = new Stack();
//         n.push(50);
//         n.push(220);
//         pushAtBottom(60, n);
//         reverse(n);
//         while(!n.isEmpty()){
//             System.out.println(n.peek());
//             n.pop();
//         }
//     }
// }


// import java.util.*;
// public class neofile{
//     static ArrayList<Integer> list = new ArrayList<>();
//     public static boolean isEmpty(){
//         return list.size() ==-1;
//     }
//     public static void push(int data ){
//         list.add(data);
//     }
//     public static int pop(){
//         if(isEmpty()){
//             return -999;
//         }
//         int top = list.get(list.size()-1);
//         list.remove(list.size()-1);
//         return top;
//     }
//     public static int peek(){
//         if(isEmpty()){
//             return -1;
//         }
//         return list.get(list.size()-1);
//     }
//     public static void pushAtBottom(int data ,Stack<Integer> st){
//         if(st.isEmpty()){
//             st.push(data);
//             return ;
//         }
//         int top = st.pop();
//         pushAtBottom(data , st);
//         st.push(top);
//     }
//     public static void reverse(Stack <Integer> stk){
//         if(stk.isEmpty()){
//             return;
//         }
//         int top = stk.pop();
//         reverse(stk);
//         pushAtBottom(top, stk);
//     }
//     public static void main(String[] args) {
//         Stack stk = new Stack();
//         stk.push(1);
//         stk.push(2);
//         stk.push(3);
//         stk.push(4);
//         stk.push(5);
//         stk.push(6);

//         pushAtBottom(0, stk);
//         reverse(stk);

//         while(!stk.isEmpty()){
//             System.out.print(stk.peek()+" ");
//             stk.pop();
//         }
        
//     }
// }


// import java.util.*;
// public class neofile{
//     static int Stack[];
//     static int top = -1;
//     static int size;
//     public static boolean isEmpty(){
//         if(top == -1){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     public static boolean isFull(){
//         if(top == size-1){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     public static void push(){
//         if(isFull()){
//             System.out.println("Stack Overflow");
//         }
//         else{
//             Scanner in = new Scanner (System.in);
//             System.out.println("Enter the element you want : ");
//             Stack[++top] = in.nextInt();
//         }
//     }
//     public static void pop(){
//         if(isEmpty()){
//             System.out.println("Stack Underflow");
//         }
//         else{
//             System.out.println("Deleted element is : "+Stack[top]);
//             top-- ;
//         }
//     }
//     public static void peek(){
//         if(isEmpty()){
//             System.out.println("Stack Underflow");
//         }
//         else{
//             for(int i=0;i<top;i++){
//                 System.out.println(Stack[top]+" ");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter the size of stack : ");
//         size = in.nextInt();
//         Stack = new int[size];
//         while(true){
//          System.out.println("****MENU*****"); 
//          System.out.println("0:Exit"); 
//          System.out.println("1:Push"); 
//          System.out.println("2:Pop"); 
//          System.out.println("3:Display"); 
//          System.out.println("Enter your choice:"); 
//          int ch=in.nextInt(); 
//          switch(ch){
//                 case 0:
//                 System.exit(0);
//                 break;
//                 case 1 :
//                 push();
//                 break;
//                 case 2:
//                 pop();
//                 break;
//                 case 3:
//                 peek();
//                 break;
//                 default:
//                 System.out.println("Wrong choice");
//             }
//         }
//     }
// }


import java.util.*;
public class neofile{
    static class Queue{
        static int arr[];
        static int size ;
        static int rear= -1;
        Queue(int length){
            arr = new int[length];
            this.size = length;
        }
        public static boolean isEmpty(){
            return rear ==-1 ? true : false;
        }
        public static Boolean isFull(){
            return rear == size-1 ?true : false;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is empty");
                return ;
            }
            rear++;
            arr[rear] = data;
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
        public static int show(){
            return arr[0];
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
        while(!q.isEmpty()){
            System.out.println(q.show());
            q.remove();
        }
    }
}