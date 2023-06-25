package Day10_ProducerConsumer_Semaphores;

import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{

    int maxSize;
    Queue<Object> store;
    String name;

    Lock lock;
    

    Producer (int maxSize, Queue<Object> store, String name,Lock lock)
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
            if (store.size() < maxSize) {
                System.out.println(name + "is adding a shirt and store size is " + store.size());
                store.add(new Object());
            }
            lock.unlock();
        }
    }
}
