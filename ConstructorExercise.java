
public class ConstructorExercise {
	//编写一个mian方法
	public static void main(String[] args) {
		Person12 p1 = new Person12();//无参构造器
		
		//下面输出 name = null ，age = 18
		System.out.println("p1的信息 name=" + p1.name + "age=" + p1.age);
				
		Person12 p2 = new Person12("scott",50);	
		//下面输出 name = scott ，age = 50
		System.out.println("p2的信息 name=" + p2.name + "age=" + p2.age);
	}
		
}
/*
 * 在前面定义的Person类中添加两个构造器：
 * 第一个无参构造器： 利用构造器设置所有人的age属性 初始值都/为18
 * 第二个带pName和pAge两个参数的构造器： 使得每次创建Person对象的同时初始化对象的age属性值和name属性值。
 * 分别使用不同的构造器创建对象。
 * 
 */
class Person12 {
	String name; //默认值 null
	int age;//默认0
	//	第一个无参构造器： 利用构造器设置所有人的age属性 初始值都为18
	public Person12() {
		age = 18;
	}
	public Person12(String pName,int pAge) {
		age = 18;
		name = pName;
		age = pAge;
	}
}