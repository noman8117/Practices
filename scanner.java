import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        String lname = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter your first name: ");
        String fname = sc.nextLine();
        System.out.println("Last Name: " + lname );
        System.out.println("First Name: " + fname );

        String s1= sc.nextLine();
        char c1= s1.charAt(2);
        System.out.println("Character at index 2: " + c1);
        
        int x =sc.nextInt();
        float y = sc.nextFloat();
        double d= sc.nextDouble();
        System.out.println("Integer: " + x);
        System.out.println("Float: " + y);
        System.out.println("Double: " + d);

    }
    
}