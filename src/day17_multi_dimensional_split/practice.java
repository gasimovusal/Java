package day17_multi_dimensional_split;

public class practice {
    public static void main(String[] args) {

        Integer[][] num = {{2, 4, 7}, {34, 5, 6}, {-3}};

        int min = Integer.MIN_VALUE;

        for(Integer[] w : num){

            for(Integer e : w){

                if(min<e){
                    min=e;
                }
            }
        }
        System.out.println(min);



    }
}
