package com.hspedu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("读者",100);
        books[1] = new Book("红楼梦",90);
        books[2] = new Book("青年文摘",5);
        books[3] = new Book("Java入门",300);

        //1）price从大到小
        Arrays.sort(books, new Comparator() {
            //这里是对Book数组排序，因此 o1 和 o2 就是 Book 对象
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                double priceVal = book2.getPrice() - book1.getPrice();
                //返回int ， 输出 double
                //如果发现返回结果和我们输出的不一致，就修改一下返回的1 和 -1
                if(priceVal > 0) {
                    return 1;
                } else if (priceVal < 0) {
                    return -1;
                } else {
                    return 0;
                }

            }
        });
        System.out.println(Arrays.toString(books));
    }
}

class Book {
    private String name;
    private double price;



    public Book(String name, double price) {
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