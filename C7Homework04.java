

public class C7Homework04 {

	public static void main (String[] args) {

		A03 a03 = new A03();
		int[] arr = {0, 2, 4, 5, 8};
		System.out.println("���ص�����Ϊ��>" );
		int[] copyarr = a03.copyArr(arr);z
		for (int i = 0; i < copyarr.length; i++) {
			System.out.print(copyarr[i] + " ");
		}
	}
}

class A03 {

	public int[] copyArr (int[] arr) {
		int[] copyarr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copyarr[i] = arr[i];
		} return copyarr;
	}
}