package day21_varags_stringbuilders_access_modifiers;

public class StringBuilder2 {

    public static void main(String[] args) {

        StringBuilder sb4 = new StringBuilder("Mississippi");
        System.out.println(sb4.lastIndexOf("s")); //6

        //take the first 4 indexes, return  index of last occurrence of "s"
        System.out.println(sb4.lastIndexOf("s", 5));

        sb4.insert(3, "XXX");
        System.out.println(sb4); // MisXXXsissippi

        System.out.println(sb4.insert(1, "ABCDE", 1, 3)); // put new characters at index 1, choose new characters from index 1 and end in 3 MBCisXXXsissippi

        sb4.delete(5, 8);
        System.out.println(sb4); //==> MBCississippi

        sb4.deleteCharAt(1);
        sb4.deleteCharAt(1);
        System.out.println(sb4);//==> Mississippi

        sb4.replace(2, 4, "S");
        System.out.println(sb4); // MiSissippi

        sb4.reverse();
        System.out.println(sb4); // ippissiSiM - reverse of MiSissippi

        StringBuilder sb5 = new StringBuilder("Ali Can");
        StringBuilder sb6 = new StringBuilder("Ali Can");
        StringBuilder sb7 = new StringBuilder("veli Can");
        // for the same String compareto() method returns 0
        System.out.println(sb5.compareTo(sb6)); //0 ascii value of A-A=0

        // if the first one comes before second one, result will be negative
        System.out.println(sb6.compareTo(sb7)); // -53 ascii value of A-v=-53
        // if the second one comes before first one, result will be positive
        System.out.println(sb7.compareTo(sb6)); // +53 ascii value of v-A=+53

        //note: the number 21 means the difference lexicographically, between A and V, there 21 letters
        //note: for the uppercase and lowercase it


        //Converting StringBuilders to String
        //substring method comes from String class, string class is immutable, method in String class are immutable
        //if a method comes from string class, it will be immutble, it means it cannot update the string builder

        //sb5 = sb.substring(3) - data types are different you cannot do assign

        sb5.substring(3);
        System.out.println(sb5); //sb5 is not updated

        //you can create a String container
        String newString = sb5.substring(4);
        System.out.println(newString);

        //can we convert StringBuilders to String? YES by using toString()
        // converting StringBuilder to string
        String stringFromStringBuilder = sb5.toString(); // converting StringBuilder to string

        //converting String back to StringBuilder
        StringBuilder stringBuilderFromString = new StringBuilder(stringFromStringBuilder);






    }
}
