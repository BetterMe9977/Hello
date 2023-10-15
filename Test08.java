
public class Test08 {  //公有类
	
	int count = 9;//属性
	public void count1() {//test类的成员方法
		count = 10;//这个count就是属性，把9改成10
		System.out.println("count1=" + count); //10
		
	}
	public void count2() {//test类的成员方法
		System.out.println("count1=" + count++);//9  ；  10
		
	}
	//这是Test类的main方法，任何一个类，都可有main方法
	public static void main(String args[]) {
		//1.new Test()是匿名对象，匿名对象使用后，就不能使用，被销毁
		//2.new Test().count1() 创建好匿名对象后，就调用count1()
		new Test08().count1();
		
		Test08 t1 = new Test08();
		t1.count2();
		t1.count2();
	}
		
}