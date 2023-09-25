public class ArithmeticOperatorExercise1 {
	
	//编写一个main方法
	public static void main(String[] args) {
		int i = 1; //i -> 1
		i = i++; //规则使用临时变量：（1） temp=i；（2） i=i+1； （3）i=temp；
		System.out.println(i);//1
		
		int u = 1;//u -> 1
		u = ++u; //（1） u=u+1；(2） temp=u；（3）u=temp；
		System.out.println(u);
		
		//测试输出
		int i1 = 10;//i1 ->10
		int i2 = 20;//i2 ->20
		int i3 = i1++; //i3 = 10 , i1 ->11
		System.out.print("i3="+i3);//10
		System.out.println("i2="+i2); //20
		i3 = --i2; //i2 ->19, i3 = 19
		System.out.print("i3="+i3); //19
		System.out.println("i2="+i2); //19
		
	}
}