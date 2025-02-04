public class Array {
    public static void main(String[] args){

        int num1[] =  new int[5];
        int num2[] = {24,20,07,29,14,12};
        num2[4] = 30;

        System.out.println(num2[3]);

        num1[0] = 6;
        num1[1] = 8;
        num1[2] = 10;
        num1[3] = 12;
        num1[4] = 14;

        for(int i= 0; i<4; i++)
        {
            System.out.println(num1[i]);
        }

//        int num3[][] = new int[3][4];
        int num3[][] = new int[3][];  // jagged array
        num3[0] = new int[3];
        num3[1] = new int[4];
        num3[2] = new int[5];

        for(int i= 0; i<4; i++)
        {
            System.out.println(num1[i]);
        }







    }
}
