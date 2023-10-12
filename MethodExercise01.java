
public class MethodExercise01 {
	//编写一个mian方法
	public static void main(String[] args) {
		AA a = new AA();
			if(a.isOdd(1)) { 
				System.out.println("是奇数");
			} else {
				System.out.println("是偶数");
			}
		
			a.print(4,4,'#');
	}
		
	
		
}

//编写类AA，一个方法：判断一个数是奇数odd还是偶数，返回boolean

class AA {
	//思路
	//1.方法的返回类型 boolean
	//2 方法的名字 isOdd
	//3. 方法的形参（int num）
	//4.方法体，判断
	
	public boolean isOdd(int num) {
		//if(num % 2 != 0) {
		//return true;
	    // } else { 
		//return false;
	    //}
		//return num % 2 != 0 ? true; false;
		//
		return num % 2 != 0;
	}
	
	//根据行 列 字符打印 对应的行数和列数 的字符 eg 4行4列#
	
	//思路
	//1.方法的返回类型 void
	//2.方法的名字 print
	//3.方法的形参（int row，int col，char c） {
	//4.方法体，循环
	
	public void print(int row, int col, char c) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {//输出每一行
				System.out.print(c);
			}
			System.out.println();//换行
		}
		
	}
	
	
	
	
}