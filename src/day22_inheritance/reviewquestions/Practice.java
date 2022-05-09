package day22_inheritance.reviewquestions;

public class Practice {

    public static void main(String[] args) {

        String st1 = "Vusal Gasimov";

        String st22 = "";

        for(int i=st1.length()-1; i>=0; i--){

            st22 = st22 + st1.charAt(i);
        }
        System.out.println(st22);
    }
}
