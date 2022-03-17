

public class C7Homework02 {

	public static void main (String[] args) {

		String[] strs = {"hh","123$","gg"};
		A02 a02 = new A02();
		int res = a02.find("gs", strs);
		if (res != -1) {
			System.out.println("find one,the index is " + res);
		} else {
			System.out.println("not found");
		}
		
	}
}

class A02 {

	public int find (String c, String[] strs) {
		
		for (int i = 0; i < strs.length; i++) {
			if (c.equals(strs[i])){
				return i;
			}
		} 		return -1;
	}
}