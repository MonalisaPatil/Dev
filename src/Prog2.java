import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter two numbers");
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.println("Sum of two numbers"+  "=" + c );
    }
}

//PDT:: Integral-->> Byte1 Short2 Int4 Long8
//      FloatingPoint-->>Float4 Double8
//      Char2
//      Boolean

//Variable:: (data type) variable Name = value
//            --> Contains --> Alphabet , Numbers , _ , $ (allowed)
//            --> Initiated With --> Alphabet,_, $
//            --> Camel Cases, no limit on length of name