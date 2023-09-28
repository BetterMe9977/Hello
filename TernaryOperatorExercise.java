
public class TernaryOperatorExercise {
	
	//编写一个main方法
	public static void main(String[] args) {
		//实现三个数的最大值
		int n1 = 55;
		int n2 = 33;
		int n3 = 123;
		// 思路
		//1.先得到 n1 和 n2 中最大数，保存到 max1
		//2.再求出 max1 和 n3 中的最大数，保存到max2
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 :n3;
		System.out.println("最大数=" + max2);
		
		//使用一条语句实现
		//推荐使用上面一种方法，清晰
		int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3; 
		System.out.println("最大数=" + max);
		
		//
		int abcclass = 10;
		int n = 40;
		int N = 50;
		System.out.println("n=" + n); //40
		System.out.println("N=" + N); //50
		
		//java中严格区分大小写
		int abc = 100;
		int aBc = 200;
		
		/*表示符的命名规则
		数字不能开头
		不能有空格，-
		不能是关键字 class int double public static 
		goto是保留字
		h$4  可以
		*/
 
		
	}
	
	
	
}