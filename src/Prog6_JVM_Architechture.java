public class Prog6_JVM_Architechture {
    public static void main(String [] args){
        int x =1, y = 20;
        int z;
        z = x+y;
        String str = new String("Sum is : ");
        System.out.println(str+ z);

    }
}
//MEMORY(3 element)::-
//1.Heap---> Objects are created inside heap
//2.Stack---> Normal variable and references are created
//3.Code Section/ Method Area
//4.Execution Engine: Interpreter + Compiler
//5.Garbage Collector: Object created in heap will be collected by it when discarded
//JVM
//Class Loader: Brings byte code in memory for execution
// 1..class loading ---> [main memory]---->1.Code section
//                     [print]
//Interpreter/JIT Compiler: converts byte code in machine code and get it executed in CPU.
// 2...After execution by CPU : 2.Stack will have x,y,z , str
//Whenever a new method is called a new stack frame is created.
// 3....main method has string object so String object created inside 3.Heap
// Dynamic objects are created in Heap like whenever we use NEW
