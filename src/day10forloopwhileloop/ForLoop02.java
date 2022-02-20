package day10forloopwhileloop;

public class ForLoop02 {

    public static void main(String[] args) {


        /*  Example: Type code to check if a given String is Palindrome ==> if string is same as reversed
        String: anna  Reversed String: anna
        Intgeger: 12321  Reversed Integer: 12321
        in Palindrome cases are important so do not put equalsIgnoreCase
        */

        String s = "vusal"; // we created reserved are for vusal
        String reversedS = "";
        //we do not have reserved are for lasuv thats why we created reserved are for lasuv: reversedS = ""
        //result of reversedS will be in reserved are ""

        for(int i = s.length()-1; i>-1; i--){ //i=4 ; i=3
            reversedS = reversedS + s.charAt(i);
          //reversedS =    ""     + s.charAt(4)  ==> "" + l ==> reversedS=l
          //reversedS =    "l"    + s.charAt(3)  ==> "l" + a ==> reversedS=la
        }

        System.out.println(reversedS);

        if(s.equals(reversedS)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

        // Example: type a code to check is a given integer is Palindrome: 12321

        int num = 121;
        String reversedNum = "";
        String stringFromNum = String.valueOf(num); //it will change integer to string, to

        for(int i=stringFromNum.length()-1; i>-1; i--){

            reversedNum = reversedNum + stringFromNum.charAt(i);
        }
        if(stringFromNum.equals(reversedNum)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
