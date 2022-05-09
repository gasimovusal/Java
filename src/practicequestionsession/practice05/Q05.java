package practicequestionsession.practice05;

public class Q05 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("M"); //M

        sb.append("E"); //ME

        String add = "S";

        sb.append(add); //MES

        sb.insert(1, "T"); //MTES

        System.out.println(sb);

    }
}
