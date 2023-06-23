package Day5_Multithreaded;

public class Client {

    public static void dosomething(){

        System.out.println("dosomething Run by : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        System.out.println("Run by : " + Thread.currentThread().getName());

        helloWorldPrinter h = new helloWorldPrinter();

        // Passing task to the thread which we will have to run
        Thread thread = new Thread(h);

        thread.start();

        Thread thread1 = new Thread(h);

        thread1.start();

        dosomething();
    }
}
