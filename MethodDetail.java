
public class MethodDetail {
	//编写一个mian方法
	public static void main(String[] args) {
		
		AAA a = new AAA();
		int[] res = a.getSumAndSub(1,4);
		System.out.println("和=" + res[0]);
		System.out.println("差=" + res[1]);
		
		//细节： 调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型 的参数
		byte b1 = 1;
		byte b2 = 2;
		a.getSumAndSub(b1,b2); //byte -> int
		
		//细节： 实参和形参的类型要一致或兼容，个数，顺序必须一致
		
		a.getSumAndSub(100,90);//实际参数和形式参数 个数一致
		a.f3("tom", 10); //实际参数和形式参数 顺序一致
	}
}

class AAA {
	public void f3(String str, int n) {
		
	}
	

	//1.一个方法最多有一个返回值 （返回多个结果，返回数组）
	public int[] getSumAndSub(int n1, int n2) {
		
		int[] resArr = new int[2]; //创建一个数组
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}
	
	//3.如果方法要求有返回数据类型，则方法体中最后的执行语句必须为return 值；
	//而且要求返回值类型必须和return的值类型一致或兼容
	//
	public double f1() {
		
		double d1 = 1.1 * 3;
		int n = 100;
		return n; 
	}
	//4.如果方法是void 则方法体中可以没有return语句，或者只写return;
	//实际工作中，方法都是为了完成某个功能，所以方法名要有一定含义，最好是见名知意
	public void f2() {
		System.out.println("hello");
		System.out.println("1");
	    System.out.println("hello");
	    return;
	}
	
	
}