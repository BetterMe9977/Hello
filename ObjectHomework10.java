
public class ObjectHomework10 {
	//编写一个mian方法

	public static void main(String[] args) {
	Demo demo = new Demo();
	demo.m();
	}
		
}
class Demo {
	int i = 100;
	public void m() {
		int j = i++;
		System.out.println("i=" + i); 
		System.out.println("j=" + j);
	}
}
class Test00 {
	public static void main(String[] args) { //运行它
		Demo d1 = new Demo();
		Demo d2 = d1;
		d2.m();
		System.out.println(d1.i);
		System.out.println(d2.i);
	}
}