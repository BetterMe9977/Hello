
public class BitOperator02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		System.out.println(1 >> 2); //1/2/2=0
		System.out.println(1 << 2); //1*2*2=4
		System.out.println(4 << 3); // 4*2*2*2=32 
		System.out.println(15 >> 2); // 15/2/2=3
		
		System.out.println(-10.5%3); 
		//a % b 当a是小数时，公式= a - (int)a/b * b
		//-10.5%3 = -10.5 - (-10)/3 *3 = -10.5 + 9 = -1.5
		//注意：有小数参与的运算，最后得到的都是近似值
		
		System.out.println(-10.4/3); // 
		
		int i = 66;
		System.out.println(++i + i); // 67+67=134
		
		//A) int num1=(int)"18";  错误 应该是 Integer.parselnt("18");
		//B) int num2=18.0; 错误 double -> int
		//C) double num3=3d; ok 
		//D) double num4=8; ok  int -> double
		//E) int i=48; char ch = i+1; 错误 int ->char
		//F) byte b =19; short s = b+2; 错误 int ->short
		
		//String str = "18.8";  注意 字符串要可以被转化成 double
		//double d1 = Double.parseDouble(str);
		
		//char c1 = "韩"；
		//String str2 = c1 + "";
	}
}