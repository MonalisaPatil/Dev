public class Prog9_printMethod {
    public static void main(String [] args){

        int a =10;
        float b =12.55f;
        char c='A';
        String str= "Java Program";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //Format Specifiers:: %___Conversion
        System.out.printf("Amount %d %f %c \n", a, b, c );
        //Format Specifiers:: %___Conversion--->String
        System.out.printf(" %s \n", str );
        //Argument Index::
        System.out.printf("%1$d %2$f %3$c %4$s \n", a,b,c,str);
       //Flag: 5 is width-->5th index.
        System.out.printf("%5d", a);
        //0 fills empty places with 0.
        System.out.printf("%05d", a);
        // ( helps negative number -10 written as (10)

        System.out.printf("%20s", str);





    }
}
//Overloaded Methods: Same name different parameter.
//Format Specifiers:: %___Conversion
//Argument Index::
//Flag::'-', '+', '0 ,'', '('


