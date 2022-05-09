package practicequestionsession.practice05;

public class Q07 {

        public static void main(String[] args) {

            //Type a code that joins the given Strings
            //input => "Dear", "Ali", "Can", "we", "miss", "you"
            //output => "Dear Ali Can we miss you"

            sentence("Dear", "Ali", "Can", "we", "miss", "you");

        }

        public static void sentence (String... str){

            String result = "";

            for(String w : str){

                result = result + w + " ";
            }
            System.out.println(result);
        }
    }

