package day13statickeywordvariabletypes;

public class Static03 {

    static int x;
    int y;

    Static03(){
        x+=2;
        y++;
    }
    static int getSquare(){
        return x*x; //4*4 = 16
    }

    public static void main(String[] args) { //when you start code, you come to main method first
        Static03 sm1 = new Static03();
        Static03 sm2 = new Static03();
        int z = sm2.getSquare();
        System.out.println("-x" + z + "-y" + sm2.y);
    }
}
