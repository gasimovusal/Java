package day11_dowhile_constructors.reviewquestions;

public class Q08 {
    public static void main(String[] args) {

        int x = 0;     // 0      1      ... 9       10
        while(x < 10){ // 0<10   1<10   ... 9<10    10<10 is false code will broken
            x++;       // 0+1=1  1+1=2  ... 9+1=10
        }

        String message = x > 10 ? "Greater than" : "Less than";
        //last value of x was 10, 10>10 is false so it will print "Less than"

        System.out.println(message+","+x); //Les than,10





        // outputLess than,10

    }


}
