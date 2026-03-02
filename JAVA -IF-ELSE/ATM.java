// import java.util.Scanner;
// public class ATM{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("ENTER BALANCE");
//         double balance=sc.nextDouble();
//         System.out.println("ENTER AMOUNT");
//         double amount=sc.nextDouble();
//         if(amount<=balance)
//         System.out.println("TRANSACTION SUCCESSFUL");
//         else
//         System.out.println("INSUFFICIENT BALANCE");
//     }
// }

// import java.util.Scanner;
// public class ATM{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("ENTER BALANCE");
//         double balance=sc.nextDouble();
//         System.out.println("ENTER AMOUNT");
//         double amount=sc.nextDouble();
//         if(amount<=balance)
//         System.out.println("TRANSACTION SUCCESSFUL");
//         else
//         System.out.println("INSUFFICIENT BALANCE");
//     }
// }

import java.util.Scanner;
public class ATM{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER BALANCE");
        double balance=sc.nextDouble();
        System.out.println("ENTER AMOUNT");
        double amount=sc.nextDouble();
        if(amount<=balance)
        System.out.println("TRANSACTION SUCCESSFUL");
        else
        System.out.println("INSUFFICIENT BALANCE");
    }
}