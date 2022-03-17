

public class TestPerson {

	public static void main (String[] args) {

		Person p1 = new Person ("Lam", 20);
		Person p2 = new Person ("lueng", 20);
		System.out.println("p1是否等于p2 -->" + p1.compareTo(p2));

	}
}

class Person {

	String name;
	int age;
	
	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}
	//compareTo比较方法
	public Boolean compareTo(Person p) {
		// if (this.name.equals(p.name) && this.age ==p.age) {
		// 	return true;
		// } else {
		// 	return false;
		// }
		return this.name.equals(p.name) && this.age ==p.age;
	}
}