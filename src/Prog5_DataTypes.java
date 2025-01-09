public class Prog5_DataTypes {
    public static void main(String[] args) {
        int x = 15;
        System.out.println(Integer.toBinaryString(x));
        int y =-15;
        System.out.println(Integer.toBinaryString(y));
        //Binary value of 5::

        Float f = 163.52f;
        System.out.println(Float.floatToRawIntBits(f));


        char cr = 65;
        for(char c = 65; c <=90; c++) {
            System.out.print(c+"");
        }

    }
}

//PDT:: Integral-->> Byte1 Short2 Int4 Long8
//      FloatingPoint-->>Float4 Double8
//      Char2
//      Boolean

// BYte---> 0-7
// Byte = 00000000
    //5 = 00000101

// CHAR---->>  Unicode::  ASCII chart (0-127)
//A= 65 , Z = 90



