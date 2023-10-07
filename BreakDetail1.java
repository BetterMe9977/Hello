public class BreakDetail1 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		label1 :
			for(int j = 0; j < 4; j++) { //外层for
			label2 :
				for(int i = 0; i < 10; i++) { //内层for
					if(i == 2) {
						break label1; //跳出外层for循环
					}
					System.out.println("i=" + i);
		
				}
			}
	}
}