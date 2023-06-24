package Day9_Locks;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {

    private Count count;
    private Lock lock;

    public Adder(Count count,Lock lock){
        this.lock = lock;
        this.count = count;
    }
    @Override
    public void run() {

        for(int i= 1 ; i <=10000;i++) {
            lock.lock();
            count.value += i;
            lock.unlock();
        }
        System.out.println("Run by : " + Thread.currentThread().getName()+" ->Count:"+count.value);
    }
}
