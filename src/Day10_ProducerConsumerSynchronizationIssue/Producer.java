package Day10_ProducerConsumerSynchronizationIssue;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    int maxSize;
    Queue<Object> store;
    String name;

    Semaphore semaphoreProducer;
    Semaphore semaphoreConsumer;


    Producer (int maxSize, Queue<Object> store, String name, Semaphore semaphoreProducer,Semaphore semaphoreConsumer )
    {
        this.maxSize =maxSize;
        this.store = store;
        this.name = name;
        this.semaphoreConsumer = semaphoreConsumer;
        this.semaphoreProducer = semaphoreProducer;
    }

    @Override
    public void run() {
        while (true) {

            try {
                semaphoreProducer.acquire();
                store.add(new Object());
                System.out.println(name + "is adding a shirt and store size is " + store.size());
                semaphoreConsumer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
