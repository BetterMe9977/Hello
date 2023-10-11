
public class Object01 {
	//编写一个mian方法
	public static void main(String[] args) {
		
		/*
		 张老太养了两只猫：小白 ，3岁,白色。小花，100岁，花色。
		 编写程序，用户输入小猫名字，显示该猫的名字，年龄，颜色。
		 输入名字错误，显示张老太没有这只猫。
		 */
		//单独变量来解决， 不利于数据管理（把一只猫的信息拆解）
		//第一只猫信息
		//String cat1Name = "小白";
		//int cat1Age = 3;
		//String cat1Color = "白色";
		//第二只猫信息
		//String cat2Name = "小花";
		//int cat2Age = 100;
		//String cat2Color = "花色";
		
		//数组
		//1） 数据类型体现不出来
		//2） 只能通过[下标]获取信息，造成变量名字和内容的对应关系不明确
		//3） 不能体现猫的行为
		//第1只猫的信息
		//String[] cat1 = {"小白","3","白色"};
		//String[] cat2 = {"小花","100","花色"};		
		
		//现有技术 不利于数据的管理， 效率低   引出 类与对象（OOP）
		//使用OOP面向对象解决
		//1.new Cat() 创建一只猫
		//2.Cat cat1 = new Cat(); 把创建的猫赋给 cat1
		//3.cat1 就是一个对象
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";
		
		
		//创建了第二只猫，并赋给 cat2
		//cat2 也是一个对象（猫对象）
		
		Cat cat2 = new Cat();
	    cat2.name = "小花";
		cat2.age = 100;
	    cat2.color = "花色";
	  
	    
	    //访问对象的属性
	    System.out.println("第1只猫信息" + cat1.name + " " + cat1.age + " " + cat1.color );
	    System.out.println("第1只猫信息" + cat2.name + " " + cat2.age + " " + cat2.color );
	    
		
	}
		
}

//使用面向对象的方式来解决养猫问题
//
//定义一个猫类 Cat -> 自定义的数据类型
class Cat {
	//属性
	String name; //名字
	int age; //年龄
	String color; //颜色
	
	//行为
}