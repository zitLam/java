

public class RecursionMonkey {

	public static void main (String[] args) {

		MyTools tools = new MyTools();
		int n = 8;
		int res = tools.monkey(n);
		System.out.println("�������" + res + "����");
	}
}

class MyTools {

	public int monkey (int n) {
		if (n == 10) {
			return 1;
		} else {
			return ((monkey(n+1) + 1) * 2);
		}
	}
}