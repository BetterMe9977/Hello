package com.hspedu.reflection.class_;


import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassLoad_ {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入key");
        String key = scanner.next();
        switch (key) {
            case "1" :
                Monkey monkey = new Monkey();  //静态加载 依赖性强
                monkey.cry();
                break;
            case "2" :
                //反射 -》 动态加载
                /*
                //  Class.forName
                    String classAllPath = "com.hspedu.Car"; //通过读取配置文件获取
                     Class<?> cls1 = Class.forName(classAllPath);
                 */

                Class cls = Class.forName("com.hspedu.Dog");// 动态加载
                Object o = cls.newInstance();
                Method m = cls.getMethod("cry");
                m.invoke(o);
                System.out.println("ok");
                break;
            case "3":
                Class cls2 = Class.forName("com.hspedu.reflection.class_.Person");
                Object o2 = cls2.newInstance();
                Method m2 = cls2.getMethod("hi");
                m2.invoke(o2);
                System.out.println("nice");
                break;
            default:
                System.out.println("do nothing ^^");

        }
    }
}
// 因为new Monkey()  是静态加载，必须编写 Monkey 类
// Person 类是动态加载，所以没有编写Person类也不会报错，只有当动态加载该类时，才会报错
class Monkey {
    public void cry() {
        System.out.println("monkey ukiki");
    }
}

class Person {
    public void hi() {
        System.out.println("baby hi");
    }

}

