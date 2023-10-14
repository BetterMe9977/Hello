
public class ConstructorDetail {
	//编写一个mian方法
	public static void main(String[] args) {
		
		Person10 p1 = new Person10("king",40);//第1个构造器
		System.out.println("p1 的信息如下");
		System.out.println("p1 对象name=" + p1.name);
		System.out.println("p1 对象age=" + p1.age);
		
		Person10 p2 = new Person10("tom");//第2个构造器
		System.out.println("p2 的信息如下");
		System.out.println("p2 对象name=" + p2.name);
		
		Dog0 dog1 = new Dog0();//使用的是默认构造器
		
	}
		
}

class Dog0 {
	//如果没有定义构造器，系统会自动给类生成一个默认无参构造器（也叫默认构造器）
	/*
	Dog(){
	
	}
	 */
	
	//一旦定义了自己的构造器，默认的构造器就覆盖了，就不能再使用默认的无参构造器，
	//除非显式的定义一下，即：Dog(){}
	//
	public Dog0(String dName) {
		
	}
	Dog0(){ //显式的定义一下 无参构造器
		
	}
}
class Person10 {
	String name;
	int age;
	//第一个构造器
	public Person10(String pName, int pAge) {
		System.out.println("第1个构造器被调用～～完成对象的属性初始化");
		name = pName;
		age = pAge;//默认0
	}
	//第二个构造器，只指定人名 不需要指定年龄
	public Person10(String pName) {
		System.out.println("\n第2个构造器被调用～～完成对象的属性初始化");
		name = pName;
	}
}