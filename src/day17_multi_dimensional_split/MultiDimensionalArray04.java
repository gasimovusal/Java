package day17_multi_dimensional_split;

public class MultiDimensionalArray04 {

    public static void main(String[] args) {

        //Find the maximum element in 2 dimensional array

        int a[][] = { {5,0}, {-5, 34}, {65, 22, 31} };

        int x = Integer.MIN_VALUE; // calculating max element, start min value as starting point

        for(int [] w : a){ // { {5,0}, {-5, 34}, {65, 22, 31} }

            for(int m : w){ // {5,0} ; {-5, 34} ; {65, 22, 31}
                if (x < m) {
                    x=m; // x = 5 ; x = 34 ; x = 65
                }
            }
        }
        System.out.println(x);
    }
}
