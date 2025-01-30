import java.util.Scanner;

public class Prog12_Conditional_Statements {
    public static void main(String [] args){

        // IF - Else::
        int x= 5;
        if(x>0){
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
        // IF- IF- Else- Else::

        int a=5, b=6,c=7;
        if(a>b && a>c){
            System.out.println(a);
        }
        else{
            if(b>c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
        //Challenge 01:
        //Odd/ Even program::

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int::");
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        //Challenge 02:
        //Age
        System.out.println("Enter your age:");
        int age = sc.nextInt();
            if(age>=14 && age<=55){
                System.out.println("Young");
            }
            else{
                System.out.println("Old");
            }
        //Challenge 03:
        //Average
        System.out.println("Number of subjects:");
        int sub = sc.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks 1:");
        float m1 = sc.nextFloat();
        System.out.println("Enter marks 2:");
        float m2 = sc.nextFloat();
        System.out.println("Enter marks 3:");
        float m3 = sc.nextFloat();

        float avg = (m1+m2+m3)/sub;

        if(avg>=70){
            System.out.println("Grade A");
        }
            else if(avg>=60 && avg <70){
                System.out.println("Grade B");
            }

    }
}
// Relational Operators:: Comparing values/data ....Returns Boolean as result
//     <
//     <=
//     >
//     >=
//     ==
//     !=

//  Logical Operators:: Combining two conditional statements
//          &&
//          ||
//           !

// AB   A&&B  A||B  !A
// TT    T     T     F
// TF    F     T     F
// FT    F     T     T
// FF    F     F     T

//