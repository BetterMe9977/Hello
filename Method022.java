
public class Method022 {
	//编写一个mian方法
	public static void main(String[] args) {
		
		//请遍历一个数组，输出数组的各个元素值
		int[][] map = {{0,0,1},{1,1,1},{1,1,3}};
		
		
		//遍历map数组
		//传统的解决方式就是直接遍历
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		//要求再次遍历数组
		//传统方法
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
		//要求再次遍历数组...
		//传统方法
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
	    }
		
	}
}