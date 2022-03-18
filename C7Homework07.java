

public class C7Homework07 {

	public static void main(String[] args) {

		Dog d1 = new Dog("豆豆", "米白色", 4);
		d1.show();
	}
}

class Dog {

	String name;
	String color;
	int age;

	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void show() {
		System.out.println("这只狗叫" + name + ", " + color 
			+ "，" + age + "岁");
	}
}