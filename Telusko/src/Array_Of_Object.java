

class Student{
    int roll_no;
    String name;
    int marks;

}
public class Array_Of_Object {
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.roll_no=01;
        s1.name= "xyz";
        s1.marks= 80;


        Student s2 = new Student();
        s2.roll_no=02;
        s2.name= "mno";
        s2.marks= 50;

        Student s3 = new Student();
        s3.roll_no=03;
        s3.name= "abc";
        s3.marks= 78;


        Student[] students = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;


        for(Student stud : students)
        {
            System.out.println(stud.name+ ":" + );
        }



        //for each loop::

        int numbers[] = new int[4];
        numbers[0]=4;
        numbers[1]=8;
        numbers[2]=46;
        numbers[3]=82;

        for(int n : numbers)
        {
            System.out.println(n);
        }


    }









}
