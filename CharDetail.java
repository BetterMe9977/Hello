
public class CharDetail {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//在java中，char的本质是一个整数，在默认输出时，是unicode码对应的字符
		//要输出对应的数字，可以（int）字符
		char c1 = 97;
		System.out.println(c1); // a
		
		char c2 = 'a';
		System.out.println((int)c2);//输出a对应的数字
		char c3 = '韩';
		System.out.println((int)c3);//38889
		char c4 = 38889;
		System.out.println(c4); //韩
		
		//char类型是可以进行运算的，相当于一个整数，因为它都对应有unicode码
		
		System.out.println('a' + 10); //107
		
		//测试
		char c5 = 'b' + 1; //98+1==>99
		System.out.println((int)c5); //99
		System.out.println(c5); //c 99->对应的字符->编码表ASCII（规定好的）
	
	}
}