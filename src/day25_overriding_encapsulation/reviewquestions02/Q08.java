package day25_overriding_encapsulation.reviewquestions02;

public class Q08 {
    /*
    Which ones give Compile Time Error?

A
public class Test06 {

	public Integer go() {

		return 11;

	}

}

public class Test extends Test06 {

    @Override

	public Short go() {

		return 6;

	}

	public static void main(String args[]) {

		Test obj = new Test();

		obj.go();

	}

}

B
public class Test06 {

	private void go() {

		System.out.println("Good");

	}

}

public class Test extends Test06 {

	@Override

	public void go() {

		System.out.println("Bad");

	}

	public static void main(String args[]) {

		Test obj = new Test();

		obj.go();

	}

}

C
public class Test06 {

	private void go() {

		System.out.println("Good");

	}

}

public class Test extends Test06 {

	public void go() {

		System.out.println("Bad");

	}

	public static void main(String args[]) {

		Test obj = new Test();

		obj.go();

	}

}
     */
}
