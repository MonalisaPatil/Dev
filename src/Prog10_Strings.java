public class Prog10_Strings {
    public static void main(String [] args){
        //Strings is Class, used like data type
        String str ="Java program" ;
  //Class name reference = String Object(Literal);
//Constructors:: They are methods or functions used for creating Object
    //Constructor 1: String (char[])
        char c[] ={'A','B','C','D'};
        String str1 = new String(c);
        System.out.println(str1);
    //Constructor 1: String (byte[])
        byte b[] ={65,66,67,68};
        String str2 = new String(b);
        System.out.println(str2);
    //Constructor 1: String (String)
        String str3 = new String("Java");
        System.out.println(str3);
        //Java(heap)--Java(Constants pool)----> both are created



    }
}
//Constructor for creating Strings::
//String constant pool
//NEW is used to create in HEAP
//Literals also occupy space

