

public class MiGong {

	public static void main (String[] args) {

	//思路：
	//1. 先设置迷宫——>行：8 列：7  “1”表示障碍物，“0”表示可通行区域。
	//
		int[][] map = new int[8][7];

		// 设置上下边框
		for (int i = 0; i < 7; i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		// 设置左右边框
		for (int i = 0; i < 8; i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
		// 设置障碍物
		map[3][1] = 1;
		map[3][2] = 1;

		// 打印地图
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			} System.out.println("");
		}

		T t1 = new T();
		t1.findWay(map, 1, 1);
		System.out.println("=======找到路的情况如下===========");
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			} System.out.println("");
		}
	}
}

class T {

	//1.findWay方法就是专门来找出迷宫的路径
	//2.如果找到，就返回true,否则返回false
	//3.map就是二维数组，即表示迷宫
	//4.i,j就是老鼠的位置，初始化的位置为(1,1)
	//5.因为我们是递归的找路，所以我先规定map数组的各个值的含义
	//  0表示可以走 1表示障碍物 2表示可以走，已经走过 3表示走过，但是走不通是死路
	//6.当map[6][5]=2就说明找到通路,就可以结束，否则就继续找.
	//7.先确定老鼠找路策略下->右->上->左
	int wayCount = 0;
	
	public boolean findWay (int[][] map, int i, int j) {

		
		if (map[6][5] == 2) { //出口，说明已经找到，返回true
			System.out.println("路径长度为:>" + wayCount);
			return true ;
		} else {
			if (map[i][j] == 0) { //为0，表示可以走且未走过
				map[i][j] = 2;
				wayCount++;
				if (findWay(map, i + 1, j)) { //向下探路
					return true;
				} else if (findWay(map, i, j + 1)){  //向右探路
					return true;
				} else if (findWay(map, i - 1, j)){  //向上探路
					return true;
				} else if (findWay(map, i, j - 1)){  //向左探路
					return true;
				} else {
					map[i][j] = 3; 
					return false;  //回溯
				}
			} else {
				return false;
		}	
		}
	}
}