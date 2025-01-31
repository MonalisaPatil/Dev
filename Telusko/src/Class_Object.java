public class Class_Object {

    public static void main(String [] args)
    {
//        int num1 = 4;
//        int num2 = 5;
        Calculator calculator = new Calculator();
        int result = calculator.add(4,5);
        System.out.println(result);
    }
}
