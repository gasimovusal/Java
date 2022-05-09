package day25_overriding_encapsulation.encapsulation;

    /*

     */

public class CreditCard {

    private String ccn = "12343241";
    private int age = 21;
    private boolean isExpired = false;

    //by using "getter method" we can read the value of encapsulated data from other classes
    public String getCcn() {

        return ccn;
    }

    //by using"setter methods" we can uodaye the value if the encapsulated data from other classes
    public void setCcn (String ccn){
        this.ccn = ccn;

    }
    public int getAge(){

        return age;
    }
    public void setAge(int age) { // parameter is in integer data type because variable is integer

        this.age = age;
    }

    public boolean isExpired() {

        return isExpired;
    }

    public void setExpired(boolean expired) {

        isExpired = expired;
    }
}

