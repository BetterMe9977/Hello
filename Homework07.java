
public class Homework07 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//输出小写a-z 及 大写 Z-A
		//考察我们对a-z编码和for 的综合使用
		//思路分析
		//1.‘b' = ’a‘ + 1  ； c = a + 2
		//2.使用for
		
		for(char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.print(c1 + " ");
		}
		
		System.out.println();
		
		for(char c1 = 'Z'; c1 >= 'A'; c1--) {
			System.out.print(c1 + " ");
		}	
	}
}