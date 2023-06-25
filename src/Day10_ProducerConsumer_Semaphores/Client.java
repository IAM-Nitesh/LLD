package Day10_ProducerConsumer_Semaphores;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) {

        int maxSize = 6;
        Queue<Object> store = new ConcurrentLinkedQueue<>();
        String name = new String();
        Lock lock = new ReentrantLock();

        Producer p1 = new Producer(maxSize,store,"p1", lock);
        Producer p2 = new Producer(maxSize,store,"p2", lock);
        Producer p3 = new Producer(maxSize,store,"p3", lock);

        Consumer c1 = new Consumer(maxSize,store,"c1", lock);
        Consumer c2 = new Consumer(maxSize,store,"c2", lock);
        Consumer c3 = new Consumer(maxSize,store,"c3", lock);
        Consumer c4 = new Consumer(maxSize,store,"c4", lock);
        Consumer c5 = new Consumer(maxSize,store,"c5", lock);

        Thread t1 = new Thread(p1);
        t1.start();

        Thread t2 = new Thread(p2);
        t2.start();

        Thread t3 = new Thread(p3);
        t3.start();


        Thread t4 = new Thread(c1);
        t4.start();

        Thread t5 = new Thread(c2);
        t5.start();

        Thread t6 = new Thread(c3);
        t6.start();

        Thread t7 = new Thread(c4);
        t7.start();

        Thread t8 = new Thread(c5);
        t8.start();











    }

}
