
public class Constructor01 {
	//编写一个mian方法
	public static void main(String[] args) {
		
		Person11 p1 = new Person11("smith",80);
		System.out.println("p1 的信息如下");
		System.out.println("p1 对象name=" + p1.name);
		System.out.println("p1 对象age=" + p1.age);
	}
		
}
//在创建人类的对象时，就直接指定这个对象的年龄和姓名
//
class Person11 {
	String name;
	int age;
	//构造器
	//1.构造器没有返回值，也不能写void
	//2.构造器的名成和Person11类一样
	public Person11(String pName, int pAge) {
		System.out.println("构造器被调用～～完成对象的属性初始化");
		name = pName;
		age = pAge;
		
	}
}
