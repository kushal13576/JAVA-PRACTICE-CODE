// import java.util.Scanner;
// public class TriangleType {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("ENTER FIRST SIDE");
//         int a=sc.nextInt();
//         System.out.println("ENTER SECOND SIDE");
//         int b=sc.nextInt();
//         System.out.println("ENTER THIRD SIDE");
//         int c=sc.nextInt();

//           if(a==b && b == c) 
//            System.out.println("Equilateral"); 
//        else if(a == b || b == c || a == c) 
//            System.out.println("Isosceles"); 
//        else 
//            System.out.println("Scalene"); 
//     }
// }


// import java.util.Scanner;
// public class TriangleType {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("ENTER FIRST SIDE");
//         int a=sc.nextInt();
//         System.out.println("ENTER SECOND SIDE");
//         int b=sc.nextInt();
//         System.out.println("ENTER THIRD SIDE");
//         int c=sc.nextInt();

//           if(a==b && b == c) 
//            System.out.println("Equilateral"); 
//        else if(a == b || b == c || a == c) 
//            System.out.println("Isosceles"); 
//        else 
//            System.out.println("Scalene"); 
//     }
// }


import java.util.Scanner;
public class TriangleType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FIRST SIDE");
        int a=sc.nextInt();
        System.out.println("ENTER SECOND SIDE");
        int b=sc.nextInt();
        System.out.println("ENTER THIRD SIDE");
        int c=sc.nextInt();

          if(a==b && b == c) 
           System.out.println("Equilateral"); 
       else if(a == b || b == c || a == c) 
           System.out.println("Isosceles"); 
       else 
           System.out.println("Scalene"); 
    }
}
