

public class C7Homework05 {

	public static void main(String[] args) {

		//��Բ���ܳ������
		Circle c1 = new Circle(3);
		System.out.println("��Բ�ܳ�Ϊ " + c1.perimeter());
		System.out.println("��Բ���Ϊ " + c1.area());
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