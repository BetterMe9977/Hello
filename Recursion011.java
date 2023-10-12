
public class Recursion011 {
	//编写一个mian方法
	public static void main(String[] args) {
		
		T1 t1 = new T1();
		t1.test(4); 
	}
		
}

class T1 {
	//分析
	public void test(int n) {
		if (n > 2) {
			test(n - 1);
		} else {
			System.out.println("n=" + n); //n=2
		}
		
	}
}