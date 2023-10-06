
public class WhileExercise {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//打印1-100之间所有能被3整除的数
		//化繁为简，先死后活
		int i = 1;
		int endNum = 100;
		while(i <= endNum ) {
			if(i % 3 == 0) {
				System.out.println("i=" + i);
			}
			
			i++;//变量自增
		}
		System.out.println("======");
		//打印40-200之间所有的偶数
		
		int j = 40; //变量初始化
		while (j <= 200) {
			//判断
			if(j % 2 == 0) {
				System.out.println("j=" + j);
			}
			j++;//循环变量的迭代
		}
	}
	

}