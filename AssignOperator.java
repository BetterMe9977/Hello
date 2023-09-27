//演示赋值运算符的使用

public class AssignOperator {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int n1 = 10;
		n1 += 4; // n1 = n1 + 4
		System.out.println(n1); //14
		n1 /= 3;
		System.out.println(n1); //4
		
		//赋值运算顺序从右往左
		//赋值运算符左边只能是变量，右边可以是变量，表达式,常量值
		
		//复合赋值运算符会进行类型转换
		byte b = 3;
		b += 2; //5; 等价于 b = （byte）(b + 2)
		b++; //6; b =(byte)( b + 1)
		System.out.println(b);
		
	}
	
}