package jdbc.demo4;

import org.junit.Test;

public class TestSQLInject {
	
	//SQL 注入漏洞演示
	@Test
	public void demo1() {
		SQLInject2 inject = new SQLInject2();
		boolean flag = inject.login("2","jack");
		//boolean flag = inject.login("2","123");
		//boolean flag = inject.login("2 ' or '1=1","jack");
		//boolean flag = inject.login("2' -- ","123");  
		if(flag) {
			System.out.println("登录成功！");
		} else {
			System.out.println("登录失败！");
		}
	}


}
