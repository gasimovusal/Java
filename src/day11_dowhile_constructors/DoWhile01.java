package day11_dowhile_constructors;

public class DoWhile01 {

    public static void main(String[] args) {

        //what is the differences between loop and do-while loop?
        //in while loop, the codes inside the loop body are not executed sometimes
        //it means zero execution is possible in while loop

        int i = 1;
        while(i<1){
            System.out.println("Hello!");
            i++;

        }

        //do-while : 0 execution is not possible, at least 1 output will print
        //the codes inside the do body are executed at least once
        Integer k=1;
        do{
            System.out.println("Hello!"); //do first then check the condition
            k++;
        }while(k<1);
    }
}
