
public class TwoDimensionalArray02 {
	//编写一个mian方法
	public static void main(String[] args) {
		
		int arr [][] = new int [2][3];
		
		arr[1][1] = 8;
		//遍历arr数组
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) { //把每个一维数组遍历
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();//换行
		}
	}
		
}