package practicequestionsession.practice02;

public class Q01 {
    public static void main(String[] args) {

        int x=1;
        int y=1;

        if(x++ < ++y){
            //x is 1 here because we have note use x yet
            // y is 2 here because ++y means we
            System.out.println("Hello");
        } else{
            System.out.println("Welcome");
        }

        System.out.println("Log: "+x +" : "+y);

        //output will be Hello
        //              Log 2:2
    }
}
