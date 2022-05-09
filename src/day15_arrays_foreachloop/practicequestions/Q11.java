package day15_arrays_foreachloop.practicequestions;

public class Q11 {

    public static void main(String[] args) {

                int x[] = { 3, 5, 7 };
                int a = 0;
                int b = 0;

                while (a < x.length) { // 0<3   ; 1<3   ; 2<3    ; 3<3
                    b = b + x[a];      // 0+3=3 ; 3+4=8 ; 8+7=15
                    a++;               // 0+1=1 ; 1+1=2 ; 2+1=3
                }
                System.out.println(b);

//        What is the output?
//a)    15  ==> correct answer

//b)    3 5 7

//c)    [3, 5, 7]

//d)    10

    }
}
