package day25_overriding_encapsulation.reviewquestions02;

public class Q07 {

    public class Shape{

        public void draw(){

            System.out.println("Shape");

        }

        public void paint(){

            System.out.println("Shape painted");

        }

    }



    public class Circle extends Shape{

        public void draw(){

            System.out.println("Circle");

        }

    }



    public class Square extends Shape{

        public void draw(){

            System.out.println("Square");

        }

        public void paint(){

            System.out.println("Square painted");

        }

    }
/*
    Which one is false?

    A
    public class Main{

        public static void main(String aga[]){

            Shape t = new Shape();

            t.draw();

            t.paint();

        }

    }

    Prints Shape

    Shape painted

    B
    public class Main{

        public static void main(String aga[]){

            Shape c = new Circle();

            c.draw();

            c.paint();

        }

    }

    Prints Circle

    Shape painted

    C
            None

    D
    public class Main{

        public static void main(String aga[]){

            Shape s = new Square();

            s.draw();

            s.paint();

        }

    }

    Prints Square

    Square painted

 */
}
