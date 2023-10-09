
public class Homework08 {
	
	//编写一个main方法
	public static void main(String[] args) {
		/*
		求出1-1/2+1/3-1/4...1/100的和
		思路分析
		1.等于（1/1）-（1/2）+（1/3）-（1/4）...1/100
		2.从上面的分析可以看到
		1）共有100个数，分子为1，分母从1-100
		2）规律：分母为奇数，前+，分母偶数，前-
		3.使用for+判断
		4.结果存放到 double sum
		5.有一个隐藏的陷阱，要把公式分子1写出1.0才能得到精确的小数
		  
		 */
		
		double sum = 0;
		for(int i = 1; i <= 100; i++) {
			//判断奇偶，做不同处理
			if(i % 2 != 0) { //分母为奇数
				sum += 1.0/i;
			} else { //分母有偶数
				sum -= 1.0 /i;
			}
		}
		System.out.println("sum=" + sum);
	}
}