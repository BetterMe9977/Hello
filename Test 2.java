
public class Test {
	
	//编写一个main方法
	public static void main(String[] args) {
		//随机生成1-100的一个数，直到生成了97这个数，一共用几次
		//使用(int)(Math.random() * 100) + 1
		//思路分析
		//循环，次数不知道，break 当某个条件满足时，终止循环
		//通过该需求可以说明其他流程控制的必要性，比如break
		for(int i = 1; i <= 10; i++) {
			System.out.println((int)(Math.random() * 100) + 1); 
		}
	}

}