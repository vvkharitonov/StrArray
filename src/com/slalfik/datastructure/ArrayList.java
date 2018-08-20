package com.slalfik.datastructure;

/**
 * Created by dsk21 on 8/17/2018.
 */
public class ArrayList implements List{
    private static int INITIAL_NUMBER_IN_ARRAY=5;

    private Object[] array = new Object[INITIAL_NUMBER_IN_ARRAY];
    private int size;

    @Override
    public void add(Object value) {
        if (size<4) {
            array[size] = value;
            size++;
        }
        else{
            Object[] newArray = new Object[size+1];
            array = newArray;
            System.arraycopy(array,0,newArray,0,size);
            array[size] = value;

            size++;
        }
    }

    @Override
    public void add(Object value, int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        Object[] newArray = new Object[size+1];
        array = newArray;
        System.arraycopy(array,0,newArray,0,size);
        for (int i = size-1; i > index ; i--) {
            array[i]=array[i-1];
        }
        array[index] = value;
        size++;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public Object set(Object value, int index) {
        return null;
    }

    @Override
    public void clear() {
        Object[] newArray = new Object[INITIAL_NUMBER_IN_ARRAY];
        array = newArray;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0 ? true : false;
    }

    @Override
    public boolean contains(Object value) {
//        return size==0 ? true : false;
        return true;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object value) {
        return 0;
    }



//    http://shop.oreilly.com/product/9780596007126.do
//    read about first pattern (about ducks)
//
//    Java Core Хортсманн -> Вложенные, Аннонимные Классы (search for additional materials)
//    https://www.youtube.com/watch?v=MniNZsyjH9E&list=PL6jg6AGdCNaX1yIJpX4sgALBTmTVc_uOJ only first video
//
//    Start read about Java8 (lambda, Stream API)
//
//    Finish ArrayList, methods
//
//    read about Связные списки add implememnts LinkedStacdk and LinkedQueue based on them



}
