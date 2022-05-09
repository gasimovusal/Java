package day18_arraylists;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        //how to remove duplicates from an ArrayList: [2, 3, 2, 2, 5] ==> [2, 3, 5]

        ArrayList<Integer> originalList = new ArrayList<>();

        originalList.add(2);
        originalList.add(3);
        originalList.add(2);
        originalList.add(2);
        originalList.add(5);

        //1st way: INTERVIEW QUESTION!!!
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for(Integer w : originalList){ // will put 2, 3, 2, 2, 5

            if(!uniqueList.contains(w)){ // ! does not contain - 2, 3 does not contain ; 2, 2 contains ; 5 does not contain

                uniqueList.add(w); // [2, 3, 5]
            }
        }
        System.out.println(uniqueList); // [2, 3, 5]


        //2dn way:

        ArrayList<Integer> uniqueList2 = new ArrayList<>(originalList);
        //               [2, 3, 2, 2, 5]                [2, 3, 2, 2, 5]

        int counter = 0;

        for(Integer w : originalList) { // will put 2, 3, 2, 2, 5 to w

            for (int i = 0; i < uniqueList2.size(); i++) { // 0<5 ;

                if (w.equals(uniqueList2.get(i))) { // index 1 = 2;
                    counter++; // 1
                }
            }
            if(counter > 1){
                for(int k=1; k<=counter; k++){
                    uniqueList2.remove(Integer.valueOf(w));
                }
            }
            counter=0;
        }
        System.out.println(uniqueList2);



    }
}
