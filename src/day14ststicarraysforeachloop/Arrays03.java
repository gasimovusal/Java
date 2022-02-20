package day14ststicarraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Create a String array and print the elements in alphabetical order on  the console in different lines
        //1. create a string array
        String myStringArray[] = new String[4];
        System.out.println(Arrays.toString(myStringArray)); // [null, null, null, null]

        //2. add elements into the array
        myStringArray[0]= "Veli";
        myStringArray[1]= "Can";
        myStringArray[2]= "Beyhan";
        myStringArray[3]= "Ali";
        System.out.println(Arrays.toString(myStringArray)); // [Veli, Can, Beyhan, Ali]

        //how to the elements in alphabetical orders:
        Arrays.sort(myStringArray);
        System.out.println(Arrays.toString(myStringArray)); // [Ali, Beyhan, Can, Veli]

        //how to print the elements in different lines
        for(String w : myStringArray){
            System.out.println(w);
        }
        System.out.println("------");

        //print the list elements if the number of characters is less than 4
        for(String w : myStringArray){
            if(w.length()<4){
                System.out.println(w);
            }
        }
        System.out.println("------");

        //print the list elements if you see "Can", stop printing
        for(String w : myStringArray){

            if(w.equals("Can")){
                break;
            }
            System.out.println(w);
        }
        System.out.println("------");

        //print the list elements except "Can" if there is ==> [Ali, Beyhan, Can, Veli]
        //1st way:
        for(String w : myStringArray){
            if(!w.equals("Can")){
                System.out.println(w);
            }
        }
        //2nd way
        for(String w: myStringArray){
            if(w.equals("Can")){
                continue; //this keyword lets you skip some elements under some condition
            }
        }


    }
}
