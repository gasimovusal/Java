package day10_forloop_whileloop.practicequestions;

public class Q05 {

    public static void main(String[] args) {

        String s = "Marra";

        for( int i=s.length()-1; i>-1; i--){ //i=5-1=4; i=4-1=3; i=1-1=0

            char c = s.charAt(i); // charAt(4) is a; charAt(3) which is r
                                  // charAt(0) is M

            if(s.indexOf(c)==s.lastIndexOf(c)){ // index of a which is 1 is not equal to last index of a which is 4
                                                // index of r which is 3 is not equal to last index of a which is 3
                                                // index of M which is 0 is  equal to last index of M which is 0

                System.out.println(c); // it will not print a or r, it will only print M
            }
        }
    }
}
