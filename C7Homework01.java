

public class C7Homework01 {

	public static void main (String[] args) {

		Aa01 aa = new Aa01();
		double[] arr = {11.2, 4, 29.22, 11.7, 55};
		Double res = aa.max(arr);
		if (res != null) {
			System.out.println("max" + res);
		} else {
			System.out.println("error");
		}
	
	}
}

class Aa01 {

	public Double max(double[] arr) {
		if (arr != null && arr.length > 0) {
			double maxnum = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (maxnum < arr[i]) {
					maxnum = arr[i];
				}
			} return maxnum;
		} else {
			return null;
		}
	
	}
}