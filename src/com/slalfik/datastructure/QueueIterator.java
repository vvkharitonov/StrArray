package com.slalfik.datastructure;
import java.util.Iterator;


/**
 * Created by dsk21 on 8/20/2018.
 */
    public class QueueIterator implements Iterator {

        public  ArrayQueue arrayQueue;

        private int index;
        private int size;



        public QueueIterator(ArrayQueue arrayQueue) {
            this.arrayQueue = arrayQueue;
            size=arrayQueue.size;
        }

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Object next() {
            Object result = arrayQueue.array[index];
            index++;
            return result;
        }
    }



