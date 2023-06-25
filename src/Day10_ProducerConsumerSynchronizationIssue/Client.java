package Day10_ProducerConsumerSynchronizationIssue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;


public class Client {

    public static void main(String[] args) {

        int maxSize = 6;
        Queue<Object> store = new ConcurrentLinkedQueue<>();
        String name = new String();
        Semaphore semaphoreConsumer = new Semaphore(3);
        Semaphore semaphoreProducer = new Semaphore(0);

        Producer p1 = new Producer(maxSize,store,"p1", semaphoreConsumer, semaphoreProducer);
        Producer p2 = new Producer(maxSize,store,"p2", semaphoreConsumer, semaphoreProducer);
        Producer p3 = new Producer(maxSize,store,"p3", semaphoreConsumer, semaphoreProducer);

        Consumer c1 = new Consumer(maxSize,store,"c1", semaphoreConsumer, semaphoreProducer);
        Consumer c2 = new Consumer(maxSize,store,"c2", semaphoreConsumer, semaphoreProducer);
        Consumer c3 = new Consumer(maxSize,store,"c3", semaphoreConsumer, semaphoreProducer);
/*        Consumer c4 = new Consumer(maxSize,store,"c4", );
        Consumer c5 = new Consumer(maxSize,store,"c5", );*/

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

//        Thread t7 = new Thread(c4);
//        t7.start();
//
//        Thread t8 = new Thread(c5);
//        t8.start();

    }

}
