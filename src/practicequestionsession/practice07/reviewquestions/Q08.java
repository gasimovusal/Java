package practicequestionsession.practice07.reviewquestions;

public class Q08 {

    public class Test2 {

        public static void main(String[] args){

            try {

                int a[]= {7, 8, 9};

                for (int i = 1; i <= 3; i++){

                    System.out.println(a[i]); // a[1] => 8 ; a[2] =>9 ; a[3] => does mot exist

                }

            } catch(Exception e) {

                System.out.println ("Out of index"); // a[3] => does mot exist, its out of index so it will execute "Out of index"

            } finally {

                System.out.println("Done!");

            }

        }

    }
    //What is the output?
}
