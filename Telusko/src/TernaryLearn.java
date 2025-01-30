public class TernaryLearn {
    public static void main(String [] args){
        int x=3;
        int y=12;

        int i = (++x < 5 && y++ > 10) ? --x : y;

        //Expanded view of ternary:
//        if (++x< 5 && --y > 10){
//         --x;
//        } else {
//          y=y;
//            }
        System.out.println(x);
        System.out.println(y);
      }
    }

