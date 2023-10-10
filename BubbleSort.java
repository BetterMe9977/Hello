public class BubbleSort {
	//编写一个mian方法
	public static void main(String[] args) {
		
		//化繁为简，先死后活
		/*
		数组[24,69,80,57,13]
		第一轮排序：目标把最大数放在最后
		第1次比较[24,69,80,57,13]
		第2次比较[24,69,80,57,13]
		第3次比较[24,69,57,80,13]
		第4次比较[24,69,57,13,80]
	
		 */
		int[] arr = {24, 69, 80, 57,13};
		int temp = 0;//用于辅助交换的变量
		for(int j = 0; j < 4; j++) {
			//如果前面的数>后面的数，就交换
			if(arr[j] > arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp; 
			}
		}
		System.out.println("==第一轮==");
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + "\t");
		}
		/*
		第二轮排序：目标把第二大数放在倒数第二位置
		第1次比较[24,69,57,13，80]
		第2次比较[24,57,69,13，80]
		第3次比较[24,57,13,69，80]
	 
		 */
		
		for(int j = 0; j < 3; j++) { //3次比较
			//如果前面的数>后面的数，就交换
			if(arr[j] > arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp; 
			}
		}
		System.out.println("\n==第二轮==");
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + "\t");
		}
		
		/*
		数组[24,69,80,57,13]
		第三轮排序：目标把第3大数放在倒数第3位置
		第1次比较[24,57,13,69，80]
		第2次比较[24,13,57,69，80]
	
	
		 */
		
		for(int j = 0; j < 2; j++) { //2次比较
			//如果前面的数>后面的数，就交换
			if(arr[j] > arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp; 
			}
		}
		System.out.println("\n==第三轮==");
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + "\t");
		}
		/*
	
		第四轮排序：目标把第4大数放在倒数第4位置
		第1次比较[24,13,57,69，80]
		
		 */
		
		for(int j = 0; j < 1; j++) {
			//如果前面的数>后面的数，就交换
			if(arr[j] > arr[j + 1]) { //1次比较
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp; 
			}
		}
		System.out.println("\n==第四轮==");
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + "\t");
		}
	}
		
}