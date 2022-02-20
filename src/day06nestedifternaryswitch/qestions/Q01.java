package day06nestedifternaryswitch.qestions;

public class Q01 {

    public static void main(String[] args) {
         int i = 1;
         int j = 0;
         switch (i){
             case 2: //will not execute because i is 1 not 2
                 j+=0;
             case 4: //will not execute because i is 1 not 4
                 j+=1;
             case 1: //will execute because i is 1
                 j+=4;
             default: // will exectue because there is no break;
                 j+=2;
         }
        System.out.println("j=" +j);

         /*
            j=1
            j=j+4 ==> j+=4 ==> j=5
          */
    }
}
