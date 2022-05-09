package day17_multi_dimensional_split.practicequestions;

public class Q08 {

    public static void main(String[] args) {

        int arr[] = {21, 22, 23, 24, 25, 26};

//        Which one is false?

  for(int i=0; i<arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        //prints 21 22 23 24 25 26 on the console     TRUE

  System.out.println(arr[1]);

        //prints 22 on the console        TRUE

  System.out.println(arr.length);

        //prints 6 on the console     TRUE

  System.out.println(arr[6]);

        //prints 26 on the console    FALSE 6 index does not exist


    }
}
