

public class StarsDiamond {

	public static void main (String[] args) {

		int layer = 11; //��������Ϊ����
		for (int i = 1; i <= layer; ++i) { //��ѭ��������
			if (i <= layer / 2 + 1) {   //��ӡ������
				for (int k = 1; k <= layer / 2 + 1 - i; k++) { //��ӡ�ո�
					System.out.print(' ');
				}
				for (int j = 1; j <= 2 * i - 1; j++){ //��ӡÿ�����
					if (j == 1 || j == 2 * i - 1) {
						System.out.print('*');
					}else {
						System.out.print(' ');
					}
				} System.out.println("");
			}
			else {   //��ӡ������
				for (int k = 1; k <= i - (layer / 2 + 1); k++) { //��ӡ�ո�
					System.out.print(' ');
				}
				for (int j = 1; j <= 2 * (layer + 1 - i) - 1 ; j++){ //��ӡÿ�����
					if (j == 1 || j == 2 * (layer + 1 - i) - 1){
						System.out.print('*');
					}else {
						System.out.print(' ');
					}
				}System.out.println("");
			}
		}
	}
}