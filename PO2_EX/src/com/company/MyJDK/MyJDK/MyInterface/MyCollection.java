package com.company.MyJDK.MyJDK.MyInterface;

public interface MyCollection<T> extends  MyIterable<T>{
    void add(T x);
    boolean contains(T x);
    int size();
    void remove(T x);
    void removeAll(T x);

}
