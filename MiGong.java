

public class MiGong {

	public static void main (String[] args) {

	//˼·��
	//1. �������Թ�����>�У�8 �У�7  ��1����ʾ�ϰ����0����ʾ��ͨ������
	//
		int[][] map = new int[8][7];

		// �������±߿�
		for (int i = 0; i < 7; i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		// �������ұ߿�
		for (int i = 0; i < 8; i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
		// �����ϰ���
		map[3][1] = 1;
		map[3][2] = 1;

		// ��ӡ��ͼ
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			} System.out.println("");
		}

		T t1 = new T();
		t1.findWay(map, 1, 1);
		System.out.println("=======�ҵ�·���������===========");
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			} System.out.println("");
		}
	}
}

class T {

	//1.findWay��������ר�����ҳ��Թ���·��
	//2.����ҵ����ͷ���true,���򷵻�false
	//3.map���Ƕ�ά���飬����ʾ�Թ�
	//4.i,j���������λ�ã���ʼ����λ��Ϊ(1,1)
	//5.��Ϊ�����ǵݹ����·���������ȹ涨map����ĸ���ֵ�ĺ���
	//  0��ʾ������ 1��ʾ�ϰ��� 2��ʾ�����ߣ��Ѿ��߹� 3��ʾ�߹��������߲�ͨ����·
	//6.��map[6][5]=2��˵���ҵ�ͨ·,�Ϳ��Խ���������ͼ�����.
	//7.��ȷ��������·������->��->��->��
	int wayCount = 0;
	
	public boolean findWay (int[][] map, int i, int j) {

		
		if (map[6][5] == 2) { //���ڣ�˵���Ѿ��ҵ�������true
			System.out.println("·������Ϊ:>" + wayCount);
			return true ;
		} else {
			if (map[i][j] == 0) { //Ϊ0����ʾ��������δ�߹�
				map[i][j] = 2;
				wayCount++;
				if (findWay(map, i + 1, j)) { //����̽·
					return true;
				} else if (findWay(map, i, j + 1)){  //����̽·
					return true;
				} else if (findWay(map, i - 1, j)){  //����̽·
					return true;
				} else if (findWay(map, i, j - 1)){  //����̽·
					return true;
				} else {
					map[i][j] = 3; 
					return false;  //����
				}
			} else {
				return false;
		}	
		}
	}
}