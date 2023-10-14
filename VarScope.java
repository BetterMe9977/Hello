
public class VarScope {
	//编写一个mian方法
	public static void main(String[] args) {
		Cat0 cat = new Cat0();
		cat.eat();
		cat.hi();
	}	
}
		
class Cat0 {
	//全局变量：也就是属性，作用域为整个类体 Cat类： cry eat 等方法使用属性
	//属性在定义时，可以直接赋值
	int age = 10;//指定的值是10
	
	//全局变量（属性）可以不赋值，直接使用，有默认值
	
	double  weight;//默认值0.0
	
	public void hi(){
		//局部变量 必须赋值后才能使用， 因为没有默认值
		int num = 1;
		String address = "北京的猫";
		System.out.println("num=" + num);
		System.out.println("address=" + address);
		System.out.println("weight=" + weight); //属性
	}
	
	
	{
		int num = 100;
	}

	
	
	public void cry() {
		//局部变量：也就是除了属性之外的其他变量，作用域为定义它的代码块中
		//1.局部变量一般是指在成员方法中定义的变量
		//2.n 和 name 就是局部变量
		//3.n 和 name 的作用域在cry方法中
		int n = 10;
		String name = "jack";
	}
	
	public void eat() {
		System.out.println("在eat中使用属性 age =" + age);
		
		//不能使用作用域之外的其他局部变量
		//System.out.println("num =" + num); 
		//System.out.println("在eat中使用 cry的变量 name =" + name);
	}
}