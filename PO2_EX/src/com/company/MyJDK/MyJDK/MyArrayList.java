package com.company.MyJDK.MyJDK;

import com.company.MyJDK.MyJDK.MyInterface.MyIterator;
import com.company.MyJDK.MyJDK.MyInterface.MyList;

public class MyArrayList<T> implements MyList<T> {

    private Object[] arr;
    private int size;

    public MyArrayList() {
        arr=new Object[10]; //non si può creare un array che ha come tipo un generics quindi si usa Object
        size=0;
    }

    @Override
    public void add(T x) {
        if(size>= arr.length){
            Object[] a= new Object[arr.length*2];
            for (int i = 0; i < arr.length ; i++) {
                a[i]=arr[i];
            }
            arr=a;
        }
        arr[size++]=x;
    }

    @Override
    public boolean contains(T x) {
        for (Object o_: arr) {
            T o =(T) o_;    //se dobbiamo fare i controlli su un elemento dell'array allora lo dobbiamo castare a T
            if(o.equals(x)) return true;    // con equals controllo che l'elemento o sia uguale a x

        }

        return false;
    }

    @Override
    public int size() { return size; }

    @Override
    public void remove(T x) {

        Object[] rem= new Object[size];
        for (int i = 0; i <size ; i++) {
            T o = (T) arr[i];
            if(o.equals(x)){
                if((size-(i+1))>=0) {
                    for (int j = i + 1; j < size - 1; j++) {
                        rem[j] = arr[i];
                    }
                    arr = rem;
                    size--;
                    return;
                }
            }
            rem[i]=arr[i];
        }
        arr=rem;
    }

    @Override
    public void removeAll(T x) {

    }

    @Override
    public MyIterator<T> iterator() {
        return new MyIterator<>() { //questa è un anonimus class e ha come tipo una interfaccia , se volessi creare un oggetto con un anonimus class
            private int pos= 0;
            @Override
            public boolean hasNext() { return pos<MyArrayList.this.size(); }

            @Override
            public T next() { return MyArrayList.this.get(pos++); }
        };
    }

    @Override
    public T get(int index) {
        if(index<size){
            return (T) arr[index];
        }
        return null;
    }

    @Override
    public void set(int index, T x) {
        if(index<size){
            arr[index]=x;
        }
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void add(int index, T x) {

    }
}
