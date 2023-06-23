package Day5_Multithreaded;

public class helloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Run by : "+Thread.currentThread().getName());
    }

}
