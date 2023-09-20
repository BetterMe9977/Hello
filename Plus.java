
public class Plus {
	
	//编写一个main方法
	public static void main(String[] args) {
		
	    /* 当左右两边都是数值型时，则做加法运算
		   当左右两边有一方是字符串，则做拼接运算
		   运算顺序，是从左到右
		 */
		
		System.out.println(100 + 98); //198
		System.out.println("100" + 98); //10098
		System.out.println(100 + 3 + "hello"); //103hello
		System.out.println("hello" + 100 + 3); //hello1003
	}
}