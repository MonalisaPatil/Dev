import java.util.Scanner;

public class Prog8_Calculate_Area {
    public static void main(String [] args){

        //Area of a Triangle:: 1/2 b*h.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        double h= sc.nextDouble();
        System.out.println("Enter base: ");
        double b= sc.nextDouble();
        Double Area = (b*h)/2;
        System.out.println("Area of Traingle: " + Area);


        //Area of a Triangle:: 1/2 b*h.




    }
}
