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

        //STRING METHOD PRACTICE::
        String str4= "Mona";
        String str5= str4.substring(1,3);
        System.out.println(str5+" "+str4);
        String str6= "I love Igloo";
        System.out.println(str6.indexOf("I",4));
        System.out.println(str4.compareTo(str6));

        String st1 ="Pyramid";
        String st2 ="pyramid";
        String st3 =new String("Pyramid");
        System.out.println(st1==st2);
        System.out.println(st1==st3);//Reference/ address will be checked
        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));//checks containts
        System.out.println(st1.compareTo(st3));
        System.out.println(st1.equalsIgnoreCase(st2));
    }
}
//Constructor for creating Strings::
//String constant pool
//NEW is used to create in HEAP
//Literals also occupy space
//One Object like "Java" can have two references
