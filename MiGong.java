public class MiGong {
	//编写一个mian方法
	public static void main(String[] args) {
		
		//思路
		//1.先创建迷宫，用二维数组表示int[][]map = new int[8][7];
		//2.先规定map 数组的元素值：0表示可以走，1表示障碍物
		
		int[][] map = new int[8][7];
		//3.将最上面的一行和最下面的一行 全部设置为1
		for(int i = 0; i < 7; i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//4.将最左边的一列和最左边的一列全部设置为1
		for(int i = 0; i < 8; i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
		//5.
		map[3][1] = 1;
		map[3][2] = 1;
		
		//输出当前的地图
		System.out.println("====当前的地图情况====");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");//输出一行
			}
			System.out.println();
		}
		
		//使用findWay给老鼠找路
		T5 t1 = new T5();
		t1.findWay(map,1,1);
		System.out.println("====找路的情况如下====");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");//输出一行
			}
			System.out.println();
		}
		
	}
		
}

class T5 {
	//使用递归回溯的思想来解决老鼠出迷宫
	//
	//1.findWay 方法就是专门来找出迷宫的路径
	//2.如果找到，就返回true ，否则返回false
	//3.map 就是二维数组，即表示迷宫
	//4.i,j就是老鼠位置，初始化位置为（1，1）
	//5.因为递归找路， 先规定 map数组各个值的含义
	//  0表示可以走  1表示障碍物 2表示可以走  3表示走过，但是走不通
	//6.当map【6】【5】 = 2 找到通路，可以结束，否则继续找
	//7.确定找路策略 下- 右 --上--左
	public boolean findWay(int[][] map, int i, int j) {
		
		if(map[6][5] == 2) {//说明找到
			return true;
		} else {
			if(map[i][j] == 0) { //0表示可以走
				//假定可以走
				map[i][j] = 2;
				//使用找路策略来确定是否真的可以走
				//下- 右 --上--左
				if(findWay(map,i+1,j)) {//先下走
					return true;
				} else if(findWay(map,i,j+1)) {//右
					return true;
				} else if(findWay(map,i-1,j)) {//上
					return true;
				} else if(findWay(map,i,j-1)) {	//左
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}
				
			} else { //map[i][j] = 1，2 3;
				return false;
			}
		}
	}	
}
	
