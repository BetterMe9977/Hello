public class Object001 {
	//编写一个mian方法
	public static void main(String[] args) {
		
		/*
		 张老太养了两只猫：小白 ，3岁,白色。小花，100岁，花色。
		 编写程序，用户输入小猫名字，显示该猫的名字，年龄，颜色。
		 输入名字错误，显示张老太没有这只猫。
		 */
		//单独变量来解决， 不利于数据管理（把一只猫的信息拆解）
		//第一只猫信息
		String cat1Name = "小白";
		int cat1Age = 3;
		String cat1Color = "白色";
		
		//第二只猫信息
		String cat2Name = "小花";
		int cat2Age = 100;
		String cat2Color = "花色";
		
		//数组
		//1） 数据类型体现不出来
		//2） 只能通过[下标]获取信息，造成变量名字和内容的对应关系不明确
		//3） 不能体现猫的行为
		//第1只猫的信息
		String[] cat1 = {"小白","3","白色"};
		String[] cat2 = {"小花","100","花色"};		
		
		//现有技术 不利于数据的管理， 效率低   引出 类与对象（OOP）
		//使用OOP面向对象解决
	}
}