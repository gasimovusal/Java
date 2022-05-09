package practicequestionsession.practice07.reviewquestions;

public class Q05 {

    /*
A)
public static void main(String[] args) {

		Integer z = 0;

		try {

		   String s = "1234";

		   z = Integer.parseInt(s);

		}catch(NumberFormatException e) {

			System.out.println(e);

	   }
		System.out.println(z);
}

        The output is 1234 ==> TRUE

B)
public static void main(String[] args) {

		Integer z = 0;

		try {

		   String s = "abcd";

		   z = Integer.parseInt(s);

		}catch(NumberFormatException e) {

			System.out.println("Good");

		}
		System.out.println(z);
}
        The output is: Good  ==> TRUE
                        0

C)
public static void main(String[] args) {

		Integer z = 0;

		try {

		   String s = "abcd";

		   z = Integer.parseInt(s);

		}catch(NumberFormatException e) {

			System.out.println("Good");
		}
		System.out.println(z);
}

        Gives Run Time Exception ==> FALSE will print good in the console

D
public static void main(String[] args) {

      String s = "abcd";

		try {

			Object obj = new Integer(12);

		  s = (String)obj;

		}catch(ClassCastException e){

			System.out.println("Good");
	   }
      System.out.println(s);
}

            The output is abcd ==> FLASE will print Good because it wgicw Class
     */
}
