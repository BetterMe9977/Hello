
import java.util.Scanner;
public class SwitchExercise {
	//编写一个main方法
	public static void main(String[] args) {
		
		//使用Switch 把小写类型的char型转化成大写（键盘输入）
		//abcde -> ABCDE  其他的输入other
		
		//创建scanner对象
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入a-e");
		char c1 = myScanner.next().charAt(0);
		switch(c1) {
			case 'a' :
				System.out.println("A");
				break;
			case 'b' :
				System.out.println("B");
				break;
			case 'c' :
				System.out.println("C");
				break;
			case 'd' :
				System.out.println("D");
				break;
			case 'e' :
				System.out.println("E");
				break;
			default:
				System.out.println("你的输入有误～");
				 
		} 
		
		
		
	}
}