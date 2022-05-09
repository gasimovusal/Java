package day25_overriding_encapsulation.reviewquestions02;

public class Q09 {
    /*
    Which ones give Compile Time Error?

A
public class Test06 {

	int go() {

		return 11;

	}

}

class Test extends Test06 {

    @Override

	protected int go() {

		return 12;

	}

	public static void main(String args[]) {

		Test obj = new Test();

		obj.go();

	}

}

B
public class Test06 {

	final int go() {

		return 11;

	}

}

class Test extends Test06 {

    @Override

	final int go() {

		return 12;

	}

	public static void main(String args[]) {

		Test obj = new Test();

		obj.go();

	}

}

C
public class Test06 {

	public int go() {

		return 11;

	}

}

public class Test extends Test06 {

    @Override

	protected int go() {

		return 12;

	}

	public static void main(String args[]) {

		Test obj = new Test();

		obj.go();

	}

}

D
public class Test06 {

	int go() {

		return 11;

	}

}

class Test extends Test06 {

    @Override

	byte go() {

		return 12;

	}

	public static void main(String args[]) {

		Test obj = new Test();

		obj.go();

	}

}
     */
}
