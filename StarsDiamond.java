

public class StarsDiamond {

	public static void main (String[] args) {

		int layer = 11; //层数，需为奇数
		for (int i = 1; i <= layer; ++i) { //外循环：层数
			if (i <= layer / 2 + 1) {   //打印正三角
				for (int k = 1; k <= layer / 2 + 1 - i; k++) { //打印空格
					System.out.print(' ');
				}
				for (int j = 1; j <= 2 * i - 1; j++){ //打印每层符号
					if (j == 1 || j == 2 * i - 1) {
						System.out.print('*');
					}else {
						System.out.print(' ');
					}
				} System.out.println("");
			}
			else {   //打印倒三角
				for (int k = 1; k <= i - (layer / 2 + 1); k++) { //打印空格
					System.out.print(' ');
				}
				for (int j = 1; j <= 2 * (layer + 1 - i) - 1 ; j++){ //打印每层符号
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