import java.util.Scanner;

public class Prog2_Scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        System.out.println("Enter your name to allot number:");
        name = s.nextLine();
        int a,b,c;
        System.out.println("Enter two numbers");
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.println("Sum of two numbers"+  " = " + c );
        System.out.println("result is: "+name+ " " + c);
    }
}