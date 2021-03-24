package com.company.MyJDK.MyJDK.MyInterface;

/**
 * Il generics T della interfaccia MyList è un type arguments , al contrario quello della interfaccia estesa MyCollection è un type argument
 * @param <T>
 */
public interface MyList<T> extends MyCollection<T>{
    T get(int index);
    void set(int index, T x);
    void remove(int index);
    void add(int index, T x);
}
