public class Prog11_Regular_Expression {
    public static void main(String [] args){

        String str1="mp";
        System.out.println(str1.matches("."));
        String st2="A";
        System.out.println(st2.matches("[a-zA-Z]"));

    }
}

//Regular Expression:: Description
//         .           Any character
//      [abc]          Exactly given letters
//    [abc][vz]        Either first or second set
//      [^abc]         Except abc
//     [a-z1-7]         a-z or 1-7
//       A|B            A or B
//       XZ             Exactly XZ
