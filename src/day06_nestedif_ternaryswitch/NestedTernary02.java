package day06_nestedif_ternaryswitch;

public class NestedTernary02 {

    public static void main(String[] args) {

        /* type code to check the password
            if it has more than 8 characters, initial should be 'i'
            if it has no more than 8 characters initial should be 'K' and last character should be '!'

            Solve the task by using nested-ternary
         */

        String pwd = "ia1b3c7xy";

        String isValid = (pwd.length() > 8) ? (pwd.charAt(0) == 'i' ? "Valid password" : "Invalid password") : (pwd.charAt(0) == 'K' ? "Valid password" : "Invalid password");

        System.out.println(isValid);
    }
}
