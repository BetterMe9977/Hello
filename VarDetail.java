
public class VarDetail {
	
	//编写一个main方法
	public static void main(String[] args) {
		//变量必须先声明，后使用，即有先后顺序
	
		/*  错误示范：
		 System.out.println(a);
		 int a = 50;
		 */
		
		int a = 50;
		System.out.println(a); //输出50
		//该区域的数据/值可以在同一类型范围内不断变化
		//a = "jack"; //错误
		a = 88; //正确
		System.out.println(a); //输出88
		
		//变量在同一作用域内不能重名
		//int a = 77; //错误
		
	}
}	

class Dog {
	public static void main(String[] args) {
		int a = 666; //正确
		System.out.println(a); //代码正确，为什么结果不输出666？
	}
}