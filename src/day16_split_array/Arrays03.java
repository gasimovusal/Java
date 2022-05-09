package day16_split_array;

public class Arrays03 {
    public static void main(String[] args) {


        String date = "23/02/2022";

        //please split the date and get day, month, and year separately on the console

        String[] dates = date.split("/");
         for(String each: dates){
             System.out.println(each);
         }

        System.out.println("Day: "+dates[0]);
        System.out.println("Month: "+dates[1]);
        System.out.println("Year: "+dates[2]);


         //2. way:
        System.out.println("day: " + date.split("/")[0]);
        System.out.println("month: " + date.split("/")[1]);
        System.out.println("year: " + date.split("/")[2]);


    }
}
