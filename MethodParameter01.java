
public class MethodParameter01 {
	//编写一个mian方法
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		//创建AA对象,名字obj
		AA0 obj = new AA0();
		obj.swap(a, b); //调用swap
		
		System.out.println("main方法 a=" + a + "b=" + b ); //a=10,b=20
	}
	
}

class AA0 {
	public void swap(int a, int b) {
		System.out.println("\n a和b交换前的值\na=" + a + "\tb=" + b);//a=10,b=20
		//完成了a和b的交换
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("\n a和b交换后的值\na=" + a + "\tb=" + b);//a=20,b=10
	}
}