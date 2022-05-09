package day26_exception;

public class E02 {

    public static void main(String[] args) {

        String arr[] = {"Ali", "Can", "Veli", "Han"};

        getAnElement(arr, 2);
        getAnElement(arr, 0);
        getAnElement(arr, 4); //exception
    }

    public static void getAnElement(String arr[], int idx){

        try {
            System.out.println(arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e){ // ArrayIndexOutOfBoundsException is a class, you can use as data type, e is variable name
            System.err.println("An error occurred in array operation ==> " + e.getMessage()); // if you want error message to print red, use err instead of out
        }
    }
}
