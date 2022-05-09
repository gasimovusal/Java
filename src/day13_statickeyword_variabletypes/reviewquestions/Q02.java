package day13_statickeyword_variabletypes.reviewquestions;

public class Q02 {
    public static void main(String[] args) {
        updateWord("john", "black");
    }

    public static void updateWord(String s, String t) {
        //            "j"       "J"             "ack"
        s=s.substring(0,1).toUpperCase() + t.substring(2);
        System.out.println(s);

    }
}
