package Day6_Executor_Runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {

        //ExecutorService executor = Executors.newFixedThreadPool(10);

        // thread pool with fixed size = 0

        ExecutorService executor = Executors.newCachedThreadPool();

        // thread pool with dynamic size

        for (int i= 1; i <=100 ; i++) {

            NumberPrinter np = new NumberPrinter(i);
            executor.execute(np);
        }
        executor.shutdown();

        }
}