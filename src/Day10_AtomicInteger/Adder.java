package Day10_AtomicInteger;

public class Adder implements Runnable {

    private Count count;

    public Adder(Count count){
        this.count = count;
    }
    @Override
    public void run() {

        for(int i= 1 ; i <=10000;i++) {
                count.value.addAndGet(i);
        }
        System.out.println("Run by : " + Thread.currentThread().getName()+" ->Count:"+count.value);
    }
}
