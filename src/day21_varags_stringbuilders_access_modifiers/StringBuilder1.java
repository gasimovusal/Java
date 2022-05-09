package day21_varags_stringbuilders_access_modifiers;

public class StringBuilder1 {

    /*
    1) String Class is "immutable" but String Builder Class is "mutable"
    2) "immutable" means update wil not be reflected to the original String without assignment
    3) "mutable" means update wil be reflected to the original String without assignment
    4) if you need to reflect update directly to original String, use String Builder, otherwise use String Class
     */

    public static void main(String[] args) {

        String s = "Ali";

        System.out.println(s + "!");
        //java created String new reserved area in heap memory and put Ali! in it
        // It takes a lot of space in heap memory, sometime we don't need to create new reserved area in heap memory, we can just update existing String in reserved area

        //you can also update existing String : it is insisting but
        s = s + "?"; // updating Ali to Ali?

        //how to create a StringBuilder Object
        //1. way
        StringBuilder sd1 = new StringBuilder("Veli");

        //2. way
        StringBuilder sb2 = new StringBuilder();
        System.out.println("For Empty " + sb2.capacity()); // sb2.capacity() shows capacity in String
        //java gives 16 boxes for the characters whose numbers are less than or equal 16
        // when you create an empty String, java will give you 16 empty boxes to put string inside

        sb2.append("Vusal");
        sb2.append(" Firudin").append(" Gasimov").append(" Adishirin oglu");

        System.out.println(sb2);
        System.out.println(sb2.length()); //36
        System.out.println("For non-empty " + sb2.capacity()); // 16+16+2+16+2=70
        //after assigning value to String and reaching 16 boxes, capacity of the boxes will be increase +16 +2

        //3. way
        StringBuilder sb3 = new StringBuilder(2);
        //put 2 inside parenthesis, you will get only 2 boxes instead of 16
        sb3.append("FL!");
        System.out.println("sb3 capacity is " + sb3.capacity()); // 3
        System.out.println("sb3 length is " + sb3.length()); // 2*2+2=16





    }
}
