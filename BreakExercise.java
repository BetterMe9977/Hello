
public class BreakExercise {
	
	//编写一个main方法
	public static void main(String[] args) {
		//1-100 以内的数求和，求出当和第一次大于20的当前数 for + break
		//思路分析
		//1.循环1-100，求和sum
		//2.当sum > 20 时，记录下当前数，然后break
		//3.在for循环外部，定义变量n，把当前i 赋给n
		
		int sum = 0;//累积和
		
		//注意 i的作用范围在for{}
		//可以在for循环外部定义i
		//int i = 1
		//for(; i <= 100; i++) {
		
		int n = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i; //累积
			if(sum > 20) {
				System.out.println("和>20时候 当前数i=" + i);
				n = i;
				break;
			
			}
			
		}
		System.out.println("当前数=" + n);
	}
}