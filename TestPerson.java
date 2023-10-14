
public class TestPerson {
	//编写一个mian方法

	public static void main(String[] args) {
		
		Person110 p1 = new Person110("marry",20);
		Person110 p2 = new Person110("smith",30);
		
		System.out.println("p1和p2比较的结果=" + p1.comparaTo(p2));
		
	}
}
/*
 定义person类，里面有name，age属性，并提供comparaTo比较方法，
 用于判断是否和另一个人相等，提供测试类TestPerson用于测试，
 名字和年龄完全一样，返回true，否则返回false
  
 */

class Person110 {
	String name;
	int age;
	//构造器
	public Person110(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//comparaTo比较方法
	public boolean comparaTo(Person110 p) {
		//名字和年龄完全一样
		
		/*if(this.name.equals(p.name) && this.age == p.age) {
			return true;
		} else {
			return false;
		*/
		
		return this.name.equals(p.name) && this.age == p.age;
	}
}
