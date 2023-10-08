import java.util.Scanner;
public class BreakExercise02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//实现登录验证，还有3次机会，如果用户名为“丁真”，密码“666”提示登录成功
		//否则提示还有几次机会，请使用for+break来完成
		//思路分析
		//1.创建Scanner对象接收用户输入
		//2.定义Sting name ；String passWd；保存用户名和密码
		//3.最多循环3次（登录3次），如果满足条件就提前退出
		//4.定义一般变量int chance 记录还有几次登录机会
		
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String passWd = "";
		int chance = 3;//登录一次，就减少一次
		for(int i = 1; i <= 3; i++) {
			System.out.println("请输入名字");
			name = myScanner.next();
			System.out.println("请输入密码");
			passWd = myScanner.next();
			//比较输入的名字和密码是否正确
			//补充说明 字符串内容是否相等 比较使用的方法 equals
			if("丁真".equals(name) && "666".equals( passWd)) {
				System.out.println("恭喜你，登录成功～");
				break;
			}
			
			//登录的机会就减少一次
			chance--;
			System.out.println("你还有" + chance + "次登录机会");
			
			
			
		}
		
		
		
	}
}