package day26_exception;

public class E03 {

    public static void main(String[] args) {

        String v = "";
        getNumOfCharactersInAString(v);

        String s = "Ali";
        getNumOfCharactersInAString(s);

        String t = null;
        getNumOfCharactersInAString(t);
    }

    public static void getNumOfCharactersInAString(String str){

        try {
            System.out.println(str.length());

        } catch (NullPointerException e){
            System.err.println("Issue occurred when counting number of characters ==> ");
            e.printStackTrace(); // if you want to see problem with details, use printStackTrace()
        }
    }
}
