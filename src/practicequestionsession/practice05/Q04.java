package practicequestionsession.practice05;

public class Q04 {

    public static void main(String[] args) {

        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1, 2).length(); //1
        total += letters.substring(6, 6).length(); //0
        total += letters.substring(6, 5).length(); // index starting from 6 and ending 5 does not exist
        System.out.println(total);


    }
}
