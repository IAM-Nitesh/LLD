package Day10_ProducerConsumerSynchronizationIssue;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    int maxSize;
    Queue<Object> store;
    String name;

    Semaphore semaphoreProducer;
    Semaphore semaphoreConsumer;


    Consumer (int maxSize, Queue<Object> store, String name, Semaphore semaphoreProducer,Semaphore semaphoreConsumer )
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
                semaphoreConsumer.acquire();
                store.remove();
                System.out.println(name + "is removing a shirt and store size is " + store.size());
                semaphoreProducer.release();
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
