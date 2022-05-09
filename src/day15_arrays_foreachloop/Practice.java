package day15_arrays_foreachloop;

public class Practice {

    public static void main(String[] args) {

       int arr [] = {10, 24, 5};

       for(int w: arr){
           if(w==24){
               System.out.println("exists");
               break;
           }else{
               System.out.println("does not exists");
           }
       }



    }


}
