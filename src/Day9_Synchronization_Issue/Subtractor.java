package Day9_Synchronization_Issue;

public class Subtractor implements Runnable{

    private Count count;

    Subtractor(Count count){
        this.count = count;
    }

    @Override
    public void run() {

        for (int i =0;i<=1000;i--){
            count.value -= i;
        }
    System.out.println("Run by : " + Thread.currentThread().getName()+" ->Count:"+count.value);
    }
}
