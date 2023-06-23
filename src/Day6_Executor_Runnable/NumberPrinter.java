package Day6_Executor_Runnable;

public class NumberPrinter implements Runnable{

    private int NumberToPrint;

    NumberPrinter (int NumberToPrint) {
        this.NumberToPrint = NumberToPrint;
    }

    @Override
    public void run() {

        System.out.println( NumberToPrint + " is ran by thread " + Thread.currentThread().getName());
    }
}
