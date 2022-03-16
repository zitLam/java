
public class MethodExercise02 {

	public static void main (String[] args) {

		MyTools myTools = new MyTools();
		int[][] dim = new int[3][3];
		for (int i = 0; i < dim.length; i++) {
			for (int j = 0; j < dim[i].length; j++) {
				dim[i][j] = i + j;
			}
		}
		myTools.print(dim);

		//====================克隆=====================
		Person p1 = new Person();
		p1.name = "lam";
		p1.age = 18;
		System.out.println("p1的名字" + p1.name + "p1的年龄" + p1.age);
		Person p2 = myTools.copyPerson(p1);
		System.out.println("p2的名字" + p2.name + "p2的年龄" + p2.age);
		System.out.println(p1 == p2);
	}
}

class Person {

	String name;
	int age;
}

class MyTools {

	public void print(int[][] dim) {

		for (int i = 0; i < dim.length; i++) {
			for (int j = 0; j < dim[i].length; j++) {
				System.out.print(dim[i][j] + " ");
			} System.out.println("");
		}
	}

	public Person copyPerson (Person p1) {
		
		Person p2 = new Person();
		p2.name = p1.name;
		p2.age = p1.age;
		return p2;
	}
}