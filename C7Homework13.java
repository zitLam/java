
public class C7Homework13 {

	public static void main(String[] args) {

		Circle c = new Circle();
		PassObject p1 = new PassObject();
		p1.printAreas(c, 6);

	}
} 

class Circle {

	double radius;

	public circle() {
		
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double findArea() {
		return Math.PI * radius *radius;
	}
}

class PassObject {

	public void printAreas(Circle c, int times) {
		for (int i = 1; i <= times; i++) {
			c.radius = i;
			System.out.println("半径为" + c.radius + "的圆面积为：" + c.findArea());
		}
	}
}