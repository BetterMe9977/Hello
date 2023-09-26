/**
 * 演示逻辑运算符的使用
*/

public class LogicOperator01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		//&& 短路与 和 & 逻辑与 案例演示
		int age = 50;
		if(age > 20 && age < 90) {
			System.out.println("ok100");
		}
		
		//& 使用
		if(age > 20 & age < 40) {
			System.out.println("ok200");
		}
		//区别
		int a = 4;
		int b = 9;
		// 对于&&短路与而言，如果第一个条件为false，后面的条件不再判断
		// 对于&逻辑与而言，如果第一个条件为false，后面的条件仍然会判断
		if(a < 1 && ++b < 50) {
			System.out.println("ok300");
		}
		System.out.println("a=" + a + "b=" + b);//a=4 b=9 (++b不执行)
		
		int c = 4;
		int d = 9;
		
		if(c < 1 & ++d < 50) {
			System.out.println("ok300");
		}
		System.out.println("c=" + c + "d=" + d);//c=4 d=10
		
		//
		int a1 = 4;
		int b1 = 9;
		// 对于&&短路与而言，如果第一个条件为false，后面的条件不再判断
		// 对于&逻辑与而言，如果第一个条件为false，后面的条件仍然会判断
		if(a1 < 10 && ++b1 < 50) {
			System.out.println("ok300");
		}
		System.out.println("a1=" + a1 + "b1=" + b1);//a1=4 b1=10
		
		int c1 = 4;
		int d1 = 9;
		
		if(c1 < 10 & ++d1 < 50) {
			System.out.println("ok300");
		}
		System.out.println("c1=" + c1 + "d1=" + d1);//c1=4 d1=10
	}
}
