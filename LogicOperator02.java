//演示｜  ｜｜使用

public class LogicOperator02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		// ||短路或  和｜ 逻辑或 案例演示
		// 规则：两个条件只要有一个成立，结果为true，否则为false
		int age = 50;
		if(age > 20 || age <30) {
			System.out.println("ok100");
		}
		
		//|逻辑或使用
		if(age > 20 | age < 30) {
			System.out.println("ok200");
		}
		
		//看看区别
		//（1） ｜｜短路或：如果第一个条件为true，
		//则第二个条件不会被判断，最终结果为true，效率高
		//(2) | 逻辑或：不管第一个条件是否为true，第二个条件都要判断，效率低
		int a = 4;
		int b = 9;
		if( a > 1 || ++b > 4) {
			System.out.println("ok300");
		}
		System.out.println("a=" + a + "b=" + b);//a=4 b=9
		//
		int c = 4;
		int d = 9;
		if( c > 1 | ++d > 4) {
			System.out.println("ok300");
		}
		System.out.println("c=" + c + "d=" + d);//c=4 b=10
		//
		int a1 = 4;
		int b1 = 9;
		if( a1 > 6 || ++b1 > 4) {
			System.out.println("ok300");
		}
		System.out.println("a1=" + a1 + "b1=" + b1);//a1=4 b1=10
		//
		int c1 = 4;
		int d1 = 9;
		if( c1 > 6 | ++d1 > 4) {
			System.out.println("ok300");
		}
		System.out.println("c1=" + c1 + "d1=" + d1);//c1=4 b1=10
	}
}