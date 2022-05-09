package day17_multi_dimensional_split.practicequestions;

public class Q07 {
    public static void main(String[] args) {


        String phoneNumber = "+1-407-640-1256";

//        Which ones print just 407 on the console ?

  String arr[] = phoneNumber.split("-");

        System.out.println(arr[1]); //==> 407   TRUE

  System.out.println(phoneNumber.substring(3)); //==> 407-640-1256

  String arr1[] = phoneNumber.split("407");

        System.out.println(arr[0]); //==> +1-

  System.out.println(phoneNumber.substring(3, 6)); //==> 407    TRUE


    }
}
