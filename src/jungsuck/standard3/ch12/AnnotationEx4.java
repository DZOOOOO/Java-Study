package jungsuck.standard3.ch12;

import java.util.Arrays;

public class AnnotationEx4 {
    public static void main(String[] args) {
        MyArrayList<String> list = MyArrayList.asList("1", "2", "3", "4");

        System.out.println(list);
    }
}

class MyArrayList<T> {
    T[] arr;

    @SafeVarargs
    @SuppressWarnings("varargs")
    MyArrayList(T... arr) {
        this.arr = arr;
    }

    @SafeVarargs
    public static <T> MyArrayList<T> asList(T... a) {
        return new MyArrayList<>(a);
    }

    public String toString() {
        return Arrays.toString(arr);
    }
}