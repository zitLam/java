

public class C7Homework07 {

	public static void main(String[] args) {

		Dog d1 = new Dog("����", "�װ�ɫ", 4);
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
		System.out.println("��ֻ����" + name + ", " + color 
			+ "��" + age + "��");
	}
}