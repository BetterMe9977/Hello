

public class This011 {
	//编写一个mian方法
	public static void main(String[] args) {
		Dog03 dog1 = new Dog03("大壮",3);
		System.out.println("dog1的hashcode=" +dog1.hashCode());
		dog1.info();
		Dog03 dog2 = new Dog03("大黄",2);
		System.out.println("dog2的hashcode=" +dog2.hashCode());
		dog2.info();
	}
	
}

class Dog03 {
	String name;
	int age;


	
	//输出 大壮 3
	/*public Dog02(String dName, int dAge) {//构造器
		
		name = dName;
		age = dAge;//默认0
	}
	*/  
	
	//如果我们构造器的形参，能够直接写成属性名，就更好了
	//出现一个问题：根据变量的作用域原则，构造器的 name 和 age 是局部变量，而不是属性
	//--》》引出this关键字来解决
	
	
	public Dog03(String name, int age) {//构造器
		//This.name 就是当前对象的属性name
		this.name = name;
		//This.age 就是当前对象的属性age
		this.age = age;
		System.out.println("this的hashcode=" +this.hashCode());
	}
	
	public void info() {//成员方法，输出属性信息
		System.out.println("this的hashcode=" +this.hashCode());
		System.out.println(name + "\t" + age + "\t");
	}
}