
public class TwoDimensionalArray03 {
	//编写一个mian方法
	public static void main(String[] args) {
		
		/*
		看一个需求：动态确定下面二维数组
		
		i = 0: 1
		i = 1: 2
		i = 2: 3
		
		一个有三个一维数组，每个一维数组的元素是不一样的
		 */
		
		int[][] arr = new int [3][];//创建 二维数组，但是只是确定一维数组的个数
		
		for(int i = 0; i < arr.length; i++) { //遍历arr每个一维数组
		//给每个一维数组开空间 new
		//如果没有给一个一维数组 new ，那么 arr[i]就是null
			arr[i] = new int[i + 1];
			
			//遍历一维数组，并给一维数组的每个元素赋值
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;
			}
			
		}
		
		System.out.println("====arr的元素====");
		//遍历arr输出
		for(int i = 0; i < arr.length; i++) {
			//输出arr的每个一维数组
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");//换行
		}
		
	}
		
}