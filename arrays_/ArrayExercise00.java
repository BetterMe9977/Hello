package com.hspedu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise00 {
    public static void main(String[] args) {
        Book00[] books = new Book00[4];
        books[0] = new Book00("读者",100);
        books[1] = new Book00("红楼梦",90);
        books[2] = new Book00("青年文摘",5);
        books[3] = new Book00("Java入门",300);

        //1）price从大到小
        Arrays.sort(books, new Comparator() {
            //这里是对Book数组排序，因此 o1 和 o2 就是 Book 对象
            @Override
            public int compare(Object o1, Object o2) {
                Book00 book1 = (Book00) o1;
                Book00 book2 = (Book00) o2;

                //要求按照书名的长度来进行排序
                return book2.getName().length() - book1.getName().length();

            }
        });
        System.out.println(Arrays.toString(books));
    }
}

class Book00 {
    private String name;
    private double price;


    public Book00(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
