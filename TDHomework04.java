import java.util.Scanner;

public class TDHomework04 {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		int[] arr = {10, 12, 45, 90};
	


		do {
			System.out.print("������Ҫ�����Ԫ��:>");
			int[] arrNew = new int[arr.length + 1];
			int number = myScanner.nextInt();
			for (int i = 0; i < arr.length; i++) { //����ԭ����
				arrNew[i] = arr[i]; //��ԭ�����ֵ��ֵ��������
				if (number <= arr[i]) {   //�ж��²���Ԫ�ص�λ��
					arrNew[i] = number; //�����¼�Ԫ��
					for (int j = i; j < arr.length; j++) { //����Ԫ�غ�����������
						arrNew[j+1] = arr[j];
					} 
					break; //�˳�����
				}
				else {
					arrNew[i+1] = number;  //������Ԫ��Ϊ���ֵ��ֱ�ӷŵ����
				}
			}
			arr = arrNew;  //��ԭ����ָ��������ĵ�ַ
			System.out.println("=====�µ�����Ϊ=====");  //��ӡ������
			for (int i = 0; i < arrNew.length; i++) {
						System.out.print(arrNew[i] + " ");
					}
			System.out.print("\n�Ƿ�Ҫ����µ�Ԫ�أ�y/n):>");
			char dec = myScanner.next().charAt(0);
			if (dec == 'n') {
				break;
			}
		
		} while( true );
		
	}
}