

public class C7Homework06 {

	public static void main (String[] args) {

		Cale c = new Cale(50, 0);
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
}

class Cale {

	double a;
	double b;

	public Cale(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public void add() {
		System.out.println("两个数的和为 " + (a + b));
	}
	public void sub() {
		System.out.println("两个数的和为 " + (a - b));
	}
	public void mul() {
		System.out.println("两个数的和为 " + (a * b));
	}
	public void div() {
		if (b != 0) {
			System.out.println("两个数的和为 " + (a / b));
		} else {
			System.out.println("输入错误：第二个数不能等于0");
		}
		
	}
}