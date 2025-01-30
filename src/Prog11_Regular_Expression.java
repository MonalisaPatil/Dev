public class Prog11_Regular_Expression {
    public static void main(String [] args){

        String str1="mp";
        System.out.println(str1.matches("."));
        String str2="A";
        System.out.println(str2.matches("[a-zA-Z]"));
        String str3= "M";
        System.out.println(str3.matches("S|M"));

        //Quantifier

        String str4 = "SJ MP";
        System.out.println(str4.matches(".*"));
        String str5 = "SJ0724MP";
        System.out.println(str5.matches("[A-Z][0-9]*"));
        String str6 ="a!B$c@1#2$3%4";
        System.out.println(str6.replaceAll("[^a-zA-Z0-9]"," "));
        String str7 =" abc de   fgh   ijk";
        System.out.println(str7.replaceAll("\\s+"," ").trim());
        String word[] = str7.split("\\s");



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

//           QUANTIFIERS
//Regular Expression:: Description
//         *           0 or more time
//         +           one or more
//         ?           0 or 1 time
//        {X}          X times
//       {X,Y}         Between X and Y time