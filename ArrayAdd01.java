import java.util.Scanner;
public class ArrayAdd01 {
	//编写一个mian方法
	public static void main(String[] args) {
		/*
		实现动态的给数组添加元素的效果，实现对数组扩容
		1.原始数组使用静态分配 int[] arr = {1,2,3}
		2.增加的元素4，直接放在数组的最后 arr = { 1,2,3,4}
		3.用户可以通过如下方法来决定是否继续添加，添加成功，
		是否继续？ y/n
		
		思路分析
		1.定义初始数组 int[] arr = {1, 2, 3} // 下标0-2
		2.arr[3] = 4;//不行
		  定义一个新的数组 int[] arrNew = new int[arr.length+1];
		3.遍历 arr 数组，依次将arr的元素拷贝到 arrNew数组
		4.将 4 赋给 arrNew[arrNew.length - 1] = 4;
		  把4赋给arrNew最后一个元素
		5.让arr指向 arrNew ; arr = arrNew; 那么 原来arr数组就被销毁
		6.创建一个Scanner 可以接收用户输入
		7.因为用户什么时候退出不确定，老师使用do-while + break来控制 
		 */
		Scanner myScanner = new Scanner(System.in);
		//初始化数组
		int[] arr = {1, 2, 3};
		
		do {
			int[] arrNew = new int[arr.length + 1];
			//遍历 arr 数组，依次将arr的元素拷贝到 arrNew 数组
			
			for(int i = 0; i < arr.length; i++) {
				arrNew[i] = arr[i];
			}
			System.out.println("请输入你要添加的元素");
			int addNum = myScanner.nextInt();
			//把addNum 赋给arrNew最后一个元素
			arrNew[arrNew.length - 1] = addNum;
			//让 arr 指向 arrNew
			arr = arrNew;
			//输出arr 看效果
			System.out.println("====arr扩容后元素情况====");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
			//询问用户是否继续
			System.out.println("是否继续添加 y/n");
			char key = myScanner.next().charAt(0);
			if(key == 'n') { //如果输入n 就终止
				break;
			}
		} while (true);
			
		System.out.println("你退出了添加");
		
	}	
}