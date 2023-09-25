
public class ArithmeticOperatorExercise02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//1.需求：
		//假如还有59天放假，问：合xx个星期零xx天
		
		//2.思路分析
		//（1） 使用int 变量 days 保存 天数
		//（2） 一个星期是7天 星期数：days / 7  零xx天 leftDays days % 7
		//（3） 输出
		
		// 3. 走代码
		int days = 59;
		int weeks = days / 7;
		int leftDays = days % 7;
		System.out.println(days + "天 合"+ weeks + "星期零" + leftDays + "天");
		
		
		// 1. 需求
		// （1）定义一个double huaShi  变量保存 华氏温度
		// （2）根据给出的公式，进行计算即可 5/9*（华氏温度-100）
		// （3）将得到的结果保存到double sheShi
		// 3走代码
		double huaShi = 234.6;
		double sheShi = 5.0 / 9 * (huaShi - 100);
		System.out.println("华氏温度" + huaShi + "对应的摄氏温度=" + sheShi);
		
		
	}
}