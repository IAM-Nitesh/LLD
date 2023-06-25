package Day10_ProducerConsumer_Semaphores;

import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable{

    int maxSize;
    Queue<Object> store;
    String name;

    Lock lock;

    Consumer (int maxSize, Queue<Object> store, String name,Lock lock)
    {
        this.maxSize =maxSize;
        this.store = store;
        this.name = name;
        this.lock = lock;
    }
    @Override
    public void run() {

        while (true) {
            lock.lock();
            if (store.size() > 0) {
                    System.out.println(name + "is removing a shirt and store size is " + store.size());
                    store.remove();

            }
            lock.unlock();
        }
    }
}
