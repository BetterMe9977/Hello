
public class VarParameterDetail {
	//编写一个mian方法
	public static void main(String[] args) {
		
		//细节：可变参数的实参可以为数组
		int[] arr = {1, 2, 3};
		double[] arr1 = {1.1, 2.2, 3.3, 4.4};
		String str = "hello";
		T7 t1 = new T7();
		t1.f1(arr);
		t1.f2(str, arr1);

	}
		
}

class T7 {
	public void f1(int...nums) {
		System.out.println("长度=" + nums.length);
	}
	//可变参数可以和普通参数一起放在形参列表，但必须保证可变参数在最后
	public void f2(String str,double...nums) {
		System.out.println(str + nums.length);
	}
	
	//一个形参列表只能出现一个可变参数
	//下面写法错误
	//public void f3(int...nums1,double...nums2) {
		
	//}
	
}