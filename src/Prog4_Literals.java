public class Prog4_Literals {

    public static void main(String[] args) {
        //Constant value used in program=Literals
        //byte + short+int = int literal
        //long(l/L) float(f/F) double(D/d) char('')  boolean(true/false)

        byte b =15;
        short s = 15;
        int i = 15;
        System.out.println(b+s+i);

        //Number System Types:
        // Decimal(0-9),
        // Binary(0.1),
        // Octal(0-7+(10,11,12),
        // Hexadecimal(0-9)+(A-F)


        byte b1 = 10;
        byte b2 = 0b1010;
        byte b3 = 012;
        byte b4 = 0XA;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        long l=999999999999L;

        System.out.println(l);



}
}

