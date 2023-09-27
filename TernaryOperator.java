//三元运算符使用

public class TernaryOperator {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int a = 10;
		int b = 99;
		//解读
		// 1.a > b 为 false
		// 2.返回 b--，先返回 b 的值，然后再 b-1
		// 3.返回的结果是99
		int result = a > b ? a++ : b--;
		System.out.println("result=" + result); //99
		System.out.println("a=" + a); //10
		System.out.println("b=" + b); //98
		//
		
		int a1 = 10;
		int b1 = 99;
		//解读
		// 1.a1 > b1 为 false
		// 2.返回 --b1，先 b1-1 ，然后再返回 b1-1的值
		// 3.返回的结果是98
		int result1 = a1 > b1 ? a1++ : --b1;
		System.out.println("result1=" + result1); //98
		System.out.println("a1=" + a1); //10
		System.out.println("b1=" + b1); //98
		//
		int a2 = 10;
		int b2 = 99;
		//解读
		// 1.a2 < b2 为 true
		// 2.返回 a2++，先返回 a2 的值，然后再 a+1
		// 3.返回的结果是10
		int result2 = a2 < b2 ? a2++ : b2--;
		System.out.println("result2=" + result2); //10
		System.out.println("a2=" + a2); //11
		System.out.println("b2=" + b2); //99
		
		
	}
}