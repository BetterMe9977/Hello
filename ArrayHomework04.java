
public class ArrayHomework04 {
	//编写一个mian方法
	public static void main(String[] args) {
		/*
		已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序
		[10,12,45,90] 添加23后，[10,12,23,45,90]
		
		思路  数组扩容 + 定位
		1.先确定 添加数 应该插入到哪个索引
		2.扩容
		
		 */
		//定义数组
		int[] arr = {10,12,45,90};
		int insertNum = 23;
		int index = -1; //intdex就是要插入的位置
		
		//遍历arr数组，如果发现 insertNum<= arr[i],说明 i就是要插入的位置
		//使用 index 保留 index = i；
		//如果遍历完后，没有发现 insertNum<=arr[i],说明 inndex = arr.length
		//即： 添加到arr的最后
		
		for(int i = 0; i < arr.length; i++) {
			if(insertNum <= arr[i]) {
				index = i;
				break;//找到位置后，就退出
				
			}
		}
		//判断index的值
		if(index == -1){ //说明没有找到位置
			index = arr.length;
			
		}
		System.out.println("index=" + index);
		//扩容
		//先创建一个新的数组，大小 arr.length + 1
		int[] arrNew = new int[arr.length + 1];
		//将arr的元素拷贝到arrNew，并且要跳过 index位置
		
		//i控制arrNew的下标，j控制arr数组的下标
		
		for(int i = 0,j = 0; i < arrNew.length; i++) {
			if(i != index) { //说明可以把arr的元素拷贝到arrNew
				arrNew[i] = arr[j];
				j++;
			} else { //i这个位置就是要插入的数
				arrNew[i] = insertNum;
			}
		}
		//让arr 指向 arrNew ，原来的数组就成为垃圾 被销毁
		
		arr = arrNew;
		
		System.out.println("====插入后，arr数组的元素情况====" );
		for(int i = 0; i < arr.length; i++) {
			System.out.print( arr[i] +"\t");
		}
		
	}
		
}