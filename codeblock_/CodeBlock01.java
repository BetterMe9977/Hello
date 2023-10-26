package com.hspedu.codeblock_;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("你好");
        Movie movie1 = new Movie("青春", 80);
        Movie movie2 = new Movie("children", 100,"jack");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    // 3个构造器 --》重载
    //1. 下面三个构造器都有相同的语句
    //2. 代码看起来冗余
    //3. 可以把相同的语句，放到一个代码块中
    //4. 这样，不管调用哪个构造器，创建对象，都会先调用代码块的内容
    //5. 代码块调用的顺序优先于构造器
    {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
        System.out.println("电影正式开始");
    };

    public Movie(String name) {
        this.name = name;
        System.out.println("Movie(String name)构造器被调用");
        System.out.println("---------------------------------------------------");
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println( "Movie(String name, double price)构造器被调用");
        System.out.println("---------------------------------------------------");
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
        System.out.println( "Movie(String name, double price, String director)构造器被调用");
    }
}