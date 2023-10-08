
public class Return01 {
	
	//编写main方法
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			
			if(i ==3 ) {
				System.out.println("韩顺平教育" + i);
				return;//使用在方法，表示跳出方法，若在main方法，退出程序
			}
			System.out.println("Hello World!");
		} 
		System.out.println("go on..");
	}
}