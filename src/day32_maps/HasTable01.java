package day32_maps;

import java.util.Hashtable;

public class HasTable01 {

    public static void main(String[] args) {

        Hashtable<String, Integer> ht1 = new Hashtable<>();
        ht1.put("Ali", 3000);
        ht1.put("Tom", 500);
        ht1.put("Alexandra", 12000);
        ht1.put("Mark", 5000);
        ht1.put("Angelina", 23000);

        System.out.println(ht1);
        System.out.println(ht1.containsKey("Angelina")); // if we have this key, it will return true, if not it will return false

        System.out.println(ht1.containsValue(5500)); // if we have this value, it will return true, if not it will return false

        Hashtable<String, Integer> ht2 = new Hashtable<>();

        ht2.put("Tom", 500);
        ht2.put("Alexandra", 12000);
        ht2.put("Mark", 5000);
        ht2.put("Angelina", 23000);
        ht2.put("Ali", 3000);

        System.out.println(ht1.equals(ht2)); // when we check the elements of 2 maps, it will not check the order, but just values

        System.out.println(ht1.size() == 0); // this is not the best way to check whether you map has elements or not
        System.out.println(ht1.isEmpty()); // this is the best way to check if your map has elements or not





    }
}
