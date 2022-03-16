
public class RecursionExercise {

	public static void main(String[] args) {

		T tt = new T();
		int n = 7;
		int res = tt.fibonacci(n);
		if (res != -1) {
			System.out.println(res);
		}
		
	}
}

class T {
	//斐波那契数
	
	public int fibonacci(int n) {
		if (n >=1) {
			if (n == 1 || n == 2) {
				return 1;
			} else {
				return (fibonacci(n - 1) + fibonacci(n - 2));
			}
		} else {
			System.out.println("要求输入的数应该大于等于1")；
			return -1;
		}
	}

}


