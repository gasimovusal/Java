package day22_inheritance.reviewquestions;

public class Q09 {
    public static void main(String[] args) {


        StringBuilder sb3 = new StringBuilder();
        sb3.append("Vusal");
        System.out.println(sb3);

        System.out.println("Before trim: " + sb3.capacity()); // 21

        sb3.trimToSize(); // triming/deleting empty boxes from String Builder, making capacity and length same

        System.out.println("After trim: " + sb3.capacity()); // 5


    }
}
