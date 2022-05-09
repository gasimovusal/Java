package practicequestionsession.practice08;

import java.util.*;

public class Q01 {

        public static void main(String[] args) {

        /*
   Create a list by getting the list elements from user
   If there is duplicated elements remove them from the list(you can use sets)
   Note: Give a message to the user as "Enter list elements, to stop entrance press '*'"
*/

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter list elements, when you finish entering, press *");

            List<String> list = new ArrayList<>();

            String str = "";

            while( !str.equals("*")){

                str = scan.next();
                if(!str.equals("*")){
                    list.add(str);
                }
            }
            System.out.println(list);

            // if they ask you to remove duplicate elements, you can use sets

            Set<String> listSet = new HashSet<>(list);

            System.out.println(listSet);

        }
    }
