package day14_ststic_arrays_foreachloop;

public class Arrays07 {

    public static void main(String[] args) {

        //type code to check if a specific elements exists in an array or not

        int c[] = {-12, 21, 0, -2, 34};

        int num = 34;

        int counter = 0; //flag used to test if part of code work or not

        for (int w : c){
            if(w==num){
                counter++; //if a number exists in the array it will increase 0 to 1, if number does not exist, it will remain 0
                break; //we dont need to check after we find the matching number
            }
        }

        if(counter==0){
            System.out.println(num + " does not exist inside the array");
        }else{
            System.out.println(num + " exists inside the array");
        }
    }
}
