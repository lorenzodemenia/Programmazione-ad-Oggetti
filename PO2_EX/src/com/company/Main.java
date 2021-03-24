package com.company;

import com.company.MyJDK.MyJDK.MyArrayList;

public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> arr_i=new MyArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr_i.add(i);
        }
        for (int i = 0; i <arr_i.size() ; i++) {
            System.out.println(arr_i.get(i));
        }

    }
}
