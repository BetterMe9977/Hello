public class BubbleSort00 {
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
		
		//将多轮排序使用外层循环包括起来即可
		//先死后活-> 4 是 arr.length - 1
		for(int i = 0; i < arr.length - 1; i++) {//外层循环是4次
			for(int j = 0; j < arr.length - 1- i; j++) {//4->3->2->1
				//如果前面的数>后面的数，就交换
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp; 
				}
			}
			System.out.println("\n==第" + (i + 1) + "轮==");
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + "\t");
			}
		}
		
	}
}