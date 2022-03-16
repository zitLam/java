import java.util.Scanner;

public class TDHomework04 {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		int[] arr = {10, 12, 45, 90};
	


		do {
			System.out.print("请输入要插入的元素:>");
			int[] arrNew = new int[arr.length + 1];
			int number = myScanner.nextInt();
			for (int i = 0; i < arr.length; i++) { //遍历原数组
				arrNew[i] = arr[i]; //把原数组的值赋值给新数组
				if (number <= arr[i]) {   //判断新插入元素的位置
					arrNew[i] = number; //插入新加元素
					for (int j = i; j < arr.length; j++) { //插入元素后继续往后遍历
						arrNew[j+1] = arr[j];
					} 
					break; //退出遍历
				}
				else {
					arrNew[i+1] = number;  //若插入元素为最大值，直接放到最后
				}
			}
			arr = arrNew;  //将原数组指向新数组的地址
			System.out.println("=====新的数组为=====");  //打印新数组
			for (int i = 0; i < arrNew.length; i++) {
						System.out.print(arrNew[i] + " ");
					}
			System.out.print("\n是否要添加新的元素（y/n):>");
			char dec = myScanner.next().charAt(0);
			if (dec == 'n') {
				break;
			}
		
		} while( true );
		
	}
}