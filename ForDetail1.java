//演示for的使用细节

public class ForDetail1 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开
		//循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开
		int count = 3;
		for (int i = 0,j = 0; i < count; i++, j += 2) {
			System.out.println("i=" + i + "j=" + j);
		}
	}
}