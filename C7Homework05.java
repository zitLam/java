

public class C7Homework05 {

	public static void main(String[] args) {

		//求圆的周长及面积
		Circle c1 = new Circle(3);
		System.out.println("该圆周长为 " + c1.perimeter());
		System.out.println("该圆面积为 " + c1.area());
	}
}

class Circle {

	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double perimeter() {

		return 2 * Math.PI * radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}
}