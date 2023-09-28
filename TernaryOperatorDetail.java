//三元运算符细节

public class TernaryOperatorDetail {
	
	//编写一个main方法
	public static void main(String[] args) {
		//表达式1和表达式2要为可以赋给接收变量的类型（或可以自动转换）
		int a = 3;
		int b = 8;
		int c = a > b ? a : b;
		//int c = a > b ? 1.1 : 3.4; 
		int c1 = a > b ? (int)1.1: (int)3.4; //1.1 double型强制转换成int
		double d = a > b ? a : b + 3; //可以，满足 int -> double
		
		/*三元运算符可以转换成if--else语句
		 * int res = a > b ? a++ : --b;
		 * if (a > b) res = a++;
		 * else res = --b;
		 
		 */
		
	}
}