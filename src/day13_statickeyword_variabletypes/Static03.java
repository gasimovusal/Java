package day13_statickeyword_variabletypes;

public class Static03 {

    static int x; //x=0
    int y; //y=0

    Static03(){
        x+=2;
        y++;
    }
    static int getSquare(){
        return x*x;
    }

    public static void main(String[] args) { //when you start code, you come to main method first
        Static03 sm1 = new Static03(); //x=0+2=2; y=0+1=1
        Static03 sm2 = new Static03(); //x=2+2=4; y=0+1=1
        int z = sm2.getSquare(); //x*x = 4*4 = 16
        System.out.println("-x" + z + "-y" + sm2.y); //output will be -x16-y1
        //                  -x    16   -y     1
    }
}
