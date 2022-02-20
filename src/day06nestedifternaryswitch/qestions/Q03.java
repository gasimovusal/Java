package day06nestedifternaryswitch.qestions;

public class Q03 {

    public static void main(String[] args){

        int variable = 1;
        switch (variable){
            case 1:
                System.out.println("P"); //will execute because variable is 1
            case 2:
            case 3:
                System.out.println("Q"); //will execute because there is no break between case 1 and case 2
            break; //will skip all other cases
            case 4:
                System.out.println("R");
            default:
                System.out.println("S");
        }

        // Output will be PQ
    }
}
