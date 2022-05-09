package day27_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Practice {

    public static void main(String[] args) {

        getFile();

        age(109);
    }

    public static void getFile () {

        try {
            FileInputStream file = new FileInputStream("src/day27exception/File02.txt");
            int k = 0;

            while((k= file.read()) !=-1){

                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void age(int k){

        if(k>=0 & k<=100){

            System.out.println(k);
        } else{
            throw new IllegalArgumentException("ge cannot be");
        }
    }
}
