package day25_overriding_encapsulation.encapsulation;

public class Runner {

    public static void main(String[] args) {

        CreditCard ccn1 = new CreditCard(); // to get non-static data from CreditCard class, we create an object
        System.out.println(ccn1.getCcn()); //12343241

        String ccn = ccn1.getCcn();

        //I want to create credit card number like
        ccn1.setCcn("****" + ccn.substring((ccn.length()-4))); //substring(12) will give you numbers start 12th index to the end, which give last 4 digit

        System.out.println(ccn1.getCcn());


        //I want to tell to user "not visible"

        ccn1.setCcn("Not visible");
        System.out.println(ccn1.getCcn());
    }
}
