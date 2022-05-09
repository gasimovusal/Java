package day10_forloop_whileloop.practicequestions;

public class Q03 {

    public static void main(String[] args) {

        int y = 1;

        for (int i=0; i<4; i++){ //i=0; i=1; i=2; i=3
                                // i cannot be equal to 4 for code breaks and print last result which was 7
            y+=i; //y=1+0=1; y=1+1=2; y=2+2=4; 4+3=7
        }
        System.out.println(y); // it prints last result of y which was 7
    }
}
