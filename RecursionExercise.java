
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
	//쳲�������
	
	public int fibonacci(int n) {
		if (n >=1) {
			if (n == 1 || n == 2) {
				return 1;
			} else {
				return (fibonacci(n - 1) + fibonacci(n - 2));
			}
		} else {
			System.out.println("Ҫ���������Ӧ�ô��ڵ���1")��
			return -1;
		}
	}

}


