
public class MethodParameter02 {
	//编写一个mian方法
	public static void main(String[] args) {
		
		//测试
		B0 b = new B0();
		int[] arr = {1, 2, 3};
		b.test100(arr);//调用方法
		System.out.println("main的 arr数组");
		//遍历数组
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		//测试
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		
		b.test200(p);
		//测试思考，如果test200 执行 p = null，输出结果 10
		//测试思考，如果test200 执行 p = new Person（）....，输出结果 10
		System.out.println("main 的 p.age=" + p.age);//10000
		
	}
		
}
class Person2 {
	String name;
	int age;
	
}
class B0 {
	
	public void test200(Person p) {
		p.age = 10000; //修改对象属性
		//思考
		//p = null;
		//思考
		//p = new Person();
		//p.name = "Tom";
		//p.age = 9;
	}
	
	//B类中编写一个方法test100
	//可以接收一个数组，在方法中修改该数组，看看原来的数组是否发生变化【
	//
	public void test100(int[] arr) {
		arr[0] = 200;
		//遍历数组
		System.out.println("test100的 arr数组");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}