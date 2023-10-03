
import java.util.Scanner;
public class Switch01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		/*
		 案例：
		 请编写一个程序，该程序可以接受一个字符，比如：a，b，c，d，e，f，g
		 a表示星期一，b表示星期二...
		 根据用户的输入显示相应的信息。要求使用 switch 语句完成
		 
		 思路分析
		 1. 接受一个字符，创建Scanner对象
		 2. 使用switch来完成匹配，并输入对应信息
		 */
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符（a-g）");
		char c1 = myScanner.next().charAt(0);
		//在java中，只要是有值返回，就是一个表达式
		switch(c1) {
			case 'a' :
				System.out.println("今天星期一，猴子穿新衣");
				break;
			case 'b' :
				System.out.println("今天星期二，猴子当小二");
				break;
			case 'c' :
				System.out.println("今天星期三，猴子爬雪山");
				break;
			case 'd' :
				System.out.println("今天星期四，猴子泡温泉");
				break;
			case 'e' :
				System.out.println("今天星期五，猴子休息");
				break;
			case 'f' :
				System.out.println("今天星期六，猴子休息");
				break;
			case 'g' :
				System.out.println("今天星期日，猴子休息");
				break;
			//.....
			default:
				System.out.println("你输入的字符不正确，没有匹配的");
		}
		
		System.out.println("退出了switch，继续执行程序");
		
	}
}