package com.slalfik.datastructure;

/**
 * Created by dsk21 on 8/20/2018.
 */
public class ArrayQueue implements Queue{
    private final static int INIT_CAPACITY = 2;

    Object[] array;
    int size;

    public ArrayQueue() {
        array=new Object[INIT_CAPACITY];
    }

    @Override
    public void enqueue(Object value) {
        if (array.length == size ) {
            Object[] newArray = new Object[size*2];
            for (int i = 0; i <size ; i++) {
                newArray[i]=array[i];
            }
            array=newArray;
        }

        array[size]=value;
        size++;
    }

    @Override
    public Object dequeue() {
        Object result = array[0];
        size--;
        for (int i = 0; i < size; i++) {
            array[i]=array[i+1];
        }
        return result;

    }

    @Override
    public int size() {
        return 0;
    }
}
