package day12_constructor_methodoverloading_variabletypes.reviewquestions;

public class Q08 {

    public static void main(String[] args) {

        int num=0;

        do {
            if(num%2==0){
                System.out.print(num + " ");
            }
            num++;

        }while(num<8);

        //output will be 0 2 4 6
    }
}
