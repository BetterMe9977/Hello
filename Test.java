//验证

public class Test {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int x = 5;
		int y = 5;
		if(x++==6 & ++y==6) { //逻辑与
			x = 11;
		}
		System.out.println("x=" + x + ",y=" + y); //6,6
		//
		
		int x1 = 5;
		int y1 = 5;
		if(x1++==6 && ++y1==6) { //短路与
			x1 = 11;
		}
		System.out.println("x1=" + x1 + ",y1=" + y1);//6,5
		
		//
		int x3 = 5;
		int y3 = 5;
		if(x3++==5 | ++y3==5) { //逻辑或
			x3 = 11;
		}
		System.out.println("x3=" + x3 + ",y3=" + y3);//11,6
		//
		int x4 = 5;
		int y4 = 5;
		if(x4++==5 || ++y4==5) { //短路与
			x4 = 11;
		}
		System.out.println("x4=" + x4 + ",y4=" + y4);//11，5
		//
		boolean x0 = true;
		boolean y0 = false;
		short z = 46;
		if((z++==46) && (y0 = true)) z++;//y0=true,给y0赋值
		if((x0 = false) || (++z ==49)) z++;
		System.out.println("z=" + z); //50
		
			
		
	}
}