package day13statickeywordvariabletypes.reviewquestions;

public class Q10 {

    public class Test03 {

        public static void main(String[] args) {

            int x = add(2, 8); //value of x is 2+8=10
            double y = add(3, 4.5); // y=3+4.5=7.5
            double z = add(x, y, 20); // x=10; y=7.5

            System.out.println(z);
        }
//if you dont type any access modifier, java will accept as default
        static int add(int i, int j){
            return i + j;
        }

        static double add(double i, double j){ //is is 3; i 9s 4.5
            return i + j; //3+4.5=7.5
        }

        static double add(int i, double j, int k) { //i=10; j=7.5; k=20
            return i + j + k;
        }

    }

}
    //If the methods are in the same class what is the output?
