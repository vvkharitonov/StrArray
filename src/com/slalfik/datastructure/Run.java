package com.slalfik.datastructure;

/**
 * Created by dsk21 on 8/20/2018.
 */
public class Run {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        QueueIterator queueIter = new QueueIterator(queue);

        while (queueIter.hasNext()) {
            System.out.println(QueueIterator.arrayQueue.dequeue()  );

        }


////        System.out.println(queue.dequeue());
//
//        Stack queue = new ArrayStack();
//
//        queue.push("A");
//        queue.push("B");
//        queue.push("C");
//        queue.push("D");
//
//        System.out.println(queue.peek());
//        System.out.println(queue.pop());
//        System.out.println(queue.pop());
//
//        queue.push("X");
//        System.out.println(queue.peek());
//        System.out.println(queue.pop());
//
//        System.out.println(queue.peek());

    }

}



