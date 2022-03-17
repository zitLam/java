

public class C7Homework03 {

	public static void main(String[] args) {

		Book b1 = new Book("aa", 90);
		b1.updatePrice();
		System.out.println("price" + b1.price);
	}
}

class Book {
	String name;
	double price;
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void updatePrice () {
		if (this.price > 150) {
			this.price = 150;
		} else if (this.price > 100) {
			this.price = 100;
		} 
	}
}