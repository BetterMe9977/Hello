public class RecursionExercise011 {
	//编写一个mian方法
	public static void main(String[] args) {
		
		TT0 t1 = new TT0();
		
		//猴子吃桃问题
		int day = 1;
		int peachNum = t1.peach(day);
		if(peachNum != -1) {
			System.out.println("第" + day +"天有" + peachNum + "个桃子");
		}
	}
		
}

class TT0 {

				
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