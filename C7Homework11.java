
public class C7Homework11 {

	public static void main(String[] args) {

		Test t1 = new Test();
		System.out.println(t1.method(t1.method(10.0, 20.0), 100));
	}
}

class Test {

	public double method(double a, double b) {
		if (a < b) {
			return b;
		} else {
			return a;
		}
	}
}