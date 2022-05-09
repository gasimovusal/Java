package day26_exception;

public class Practice {

    public static void main(String[] args) {

        String s = "vusal";
        getNumOfLength(s);

        String m = null;
        getNumOfLength(m);
    }

    public static void getNumOfLength(String str){

        try{

            System.out.println(str.length());
        } catch (NullPointerException e){

            System.out.println("cannot count character:");
            e.printStackTrace();
        }
    }

}


