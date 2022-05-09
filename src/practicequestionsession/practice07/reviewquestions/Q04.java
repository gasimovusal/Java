package practicequestionsession.practice07.reviewquestions;

public class Q04 {

    public static void main(String[] args) {

        try {

            run();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    private static void run() {

        throw new RuntimeException("Run more");
    }

    //what is output? Run more
}
