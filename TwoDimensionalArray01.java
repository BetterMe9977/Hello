
public class TwoDimensionalArray01 {
	//编写一个mian方法
	public static void main(String[] args) {
		
		/*
		请用二维数组输出如下图形
			000000
			001000
			020300
			000000
		 */
		//二维数组
		//1.从定义形式上看 int[][]
		//2.原来的一维数组的每一个元素数一维数组，就构成二维数组
		
		int [][] arr = {{0,0,0,0,0,0},
						{0,0,1,0,0,0},
						{0,2,0,3,0,0},
						{0,0,0,0,0,0},};
		//关于二维数组
		//1）
		System.out.println("二维数组的元素个数=" + arr.length);
		//2) 二维数组的每个元素是一维数组，所以如果需要得到每个
		//  一维数组的值，还需要两次遍历
		//3） 如果我们要访问第（i+i）个以为数组的第（j+i）个值arr[i][j];
		//举例 访问3，他是第3个一维数组的第4个值 arr[2][3]
		System.out.println("第三个一维数组的第4个值=" + arr[2][3]);

		
		
		//输出二维图形
		for(int i = 0; i < arr.length; i++) {
			//遍历二维数组的每个元素（数组）
			//1.arr[i].表示 二维数组的第i+1个元素
			//2.arr[i].length得到对应的每个一维数组的长度
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");//输出一维数组
				
			}
			System.out.println();//换行
		}
	}
		
}