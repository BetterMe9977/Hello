
public class RecursionExercise01 {
	//编写一个mian方法
	public static void main(String[] args) {
		
		TT t1 = new TT();
		int n = -1;
		int res = t1.fibonacci(n);
		if(res != -1) {
			System.out.println("当n=" + n +"对应的斐波那契数=" + res);
		}
		
		
	}
		
}

class TT {
	/*
	请使用递归的方式求出斐波那契fibonacci 数 1，1，2，3，5，8，13...
	给你一个整数你n，求出他的值是多少
	思路分析
	1.当n= 1,斐波那契数是1
	2.当n=2，斐波那契是1
	3.当n>=3,斐波那契数是前两个数的和一天
	4.这里是一个递归的思路
	 */
		public int fibonacci(int n) {
			if(n >= 1 ) {
				if(n == 1 || n == 2) {
					return 1;
				} else {
					return fibonacci(n - 1) + fibonacci(n - 2);
				}
			} else {
				System.out.println("要求输入的n>=1的整数");
				return -1;
			}
				
		}
		/*
		猴子吃桃子问题：有一堆桃子，猴子第一天吃其中一半，并再多吃一个；
		以后每天吃其中一半，再多一个。到第10天时，想吃时发现只有一个桃子。
		问 ： 最初有多少桃子
		
		思路分析 逆推
		1.day = 10 ，有1个桃子
		2.day = 9， 有（day10 + 1)*2 = 4
		3.day = 8， 有（day9 + 1)*2 = 10
		4.规律 前一天的桃子 = (后一天的桃子 + 1）*2
		5.递归
		 */
		
		public int peach(int day) {
			if(day == 10) { //第10天，只有一个桃子
				return 1;
			} else if(day >= 1 && day <=9) {
				return (peach(day + 1) + 1 ) * 2;
			} else {
				System.out.println("day在1-10");
				return -1;
				
			}
		}
		
}