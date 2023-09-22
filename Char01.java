
//演示char的基本使用

public class Char01 {
	 
	//编写一个main方法
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = '\t';//制表位
		char c3 = '韩';
		char c4 = 97; //说明：字符型可以直接存放一个数字
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);//当输出c4的时候，会输出97表示的字符 => 编码的概念
		}
}