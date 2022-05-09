package day18_arraylists;

import java.util.ArrayList;
import java.util.List;


public class practice {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        for(Integer w : list){
            if(w==4){
                continue; // if you find 7 continue
            }
            list.set(list.indexOf(w), w+3);
        }
        System.out.println(list);






    }
}
