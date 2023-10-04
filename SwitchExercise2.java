

import java.util.Scanner;	
public class SwitchExercise2 {
	public static void main(String[] args) {
		
		//根据用于指定月份  打印该月份所属的季节
				//3，4，5春季 6，7，8夏季  9，10，11秋季 12，1，2冬季
				//提示 使用穿透
				//思路分析
				//1.创建Scanner对象，接受用户输入
				//2.使用 int month 接受
				//3.使用Switch 来匹配，使用穿透来完成，比较简洁
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入月份");
		int month = myScanner.nextInt();
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("这是春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("这是夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("这是秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("这是冬季");
				break;
				
			default :
				System.out.println("你输入的月份不对，应是1-12");
				
				
		}
	}
}