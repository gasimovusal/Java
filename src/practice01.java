public class practice01 {

    public static void main(String[] args) {

        String str = "I love Java";

        String empty = "";

        for(int i=str.length()-1; i>=0; i--){

            empty+=str.charAt(i);
        }
        System.out.println(empty);


        StringBuilder str1 = new StringBuilder(str);

        str1.reverse();

        System.out.println(str1);


        int a = 2345678;


        for (int i = a; i > 0; i = i / 10) {
            System.out.print(i % 10);
        }


        String str2 = "I lov14e java564765";

        int sum = 0;

        for(int i=0; i<str2.length(); i++){

            if(str2.charAt(i)>='0' && str2.charAt(i)<='9'){

                sum+=Integer.valueOf("" + str2.charAt(i));
            }
        }
        System.out.println("result:" + sum);


        int i=8;
        int j=8;
        int row=8;

        for (i = 0; i < row; i++) {
            for (j = row-i ; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }







}
