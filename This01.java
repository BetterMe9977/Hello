
public class This01 {
	//编写一个mian方法
	public static void main(String[] args) {
		Dog02 dog1 = new Dog02("大壮",3);
		dog1.info();

	}
		
}

class Dog02 {
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
	public Dog02(String name, int age) {//构造器
    	name = name;
		age = age;//默认0
	}
	
	
	public void info() {//成员方法，输出属性信息
		System.out.println(name + "\t" + age + "\t");
	}
}