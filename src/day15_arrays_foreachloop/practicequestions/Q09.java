package day15_arrays_foreachloop.practicequestions;

public class Q09 {

    public static void main(String[] args) {


        int arr[] = {3, 2, 3, 4, 4, 5};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                count++; // for first 3 -- 0+1=1;   for second 3 -- 1+1=2
            }
        }
        System.out.println(count);

//    What is the output?

// a)   2  correct answer

// b)   3

// c)   1

// d)   0

    }
}
