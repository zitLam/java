import java.util.Scanner;

public class C7Homework14 {
	public static void main(String[] args) {

		while (true) {
			Scanner myScanner = new Scanner(System.in);
			System.out.print("\n���ȭ��0��ȭͷ  1������  2���� 3:�˳�):>  ");
			int num = myScanner.nextInt();
			if (num == 3) {
				System.out.println("���˳���Ϸ");
				break;
			}
			Tom t1 =new Tom(num);
			int comp = (int)(Math.random() * 3);
			System.out.println("���Գ�ȭ:>  " + comp);
			t1.game(comp);
		}
		
	}
}

class Tom {

	int finger;

	public Tom(int finger) {
		this.finger = finger;
	}
	public void game(int comp) {
		if (finger == comp) {
			System.out.println("Is tie~");
		} else if (finger == 0 && comp == 1 || 
			finger == 1 && comp ==2 || finger ==2 && comp ==0) {
			System.out.println("You win!");
		} else {
			System.out.println("You lose!");
		}
	}
	
}