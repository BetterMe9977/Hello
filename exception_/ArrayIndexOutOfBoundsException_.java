package com.hspedu.exception_;

public class ArrayIndexOutOfBoundsException_ {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
//ArrayIndexOutOfBoundsException:
// Index 3 out of bounds for length 3
        }
    }
}
