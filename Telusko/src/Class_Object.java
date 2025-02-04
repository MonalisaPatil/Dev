public class Class_Object {

    public static void main(String [] args)
    {
//        int num1 = 4;
//        int num2 = 5;
        Calculator calculator = new Calculator();
        int result1 = calculator.add(2,2);
        System.out.println(result1);

        int result2 = calculator.add(2,4,3);
        System.out.println(result2);
    }
}
