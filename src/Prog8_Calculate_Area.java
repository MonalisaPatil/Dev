import java.util.Scanner;

public class Prog8_Calculate_Area {
    public static void main(String [] args){

        //Area of a Triangle:: 1/2 b*h.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        double height= sc.nextDouble();
        System.out.println("Enter base: ");
        double base= sc.nextDouble();
        Double Area = (base*height)/2;
        System.out.println("Area of Traingle: " + Area);


        //Area of a Triangle::
        // s= 1/2(a+b+c);
        //Area = square root of s(s-a)(s-b)(s-c)
        System.out.println("Enter the side a: ");
        double a = sc.nextDouble();
        System.out.println("Enter the side b: ");
        double b = sc.nextDouble();
        System.out.println("Enter the side c: ");
        double c = sc.nextDouble();
        Double s = (a+b+c)/2;
        System.out.println(s);
        Double AreaS = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is "+ AreaS);





    }
}
